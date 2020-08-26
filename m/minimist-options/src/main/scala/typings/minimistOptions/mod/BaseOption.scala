package typings.minimistOptions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOption[TypeOptionType /* <: OptionType */, DefaultOptionType] extends js.Object {
  /**
  	 * An alias/list of aliases for the option.
  	 */
  val alias: js.UndefOr[String | js.Array[String]] = js.native
  /**
  	 * The default value for the option.
  	 */
  val default: js.UndefOr[DefaultOptionType] = js.native
  /**
  	 * The data type the option should be parsed to.
  	 */
  val `type`: js.UndefOr[TypeOptionType] = js.native
}

object BaseOption {
  @scala.inline
  def apply[/* <: typings.minimistOptions.mod.OptionType */ TypeOptionType, DefaultOptionType](): BaseOption[TypeOptionType, DefaultOptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOption[TypeOptionType, DefaultOptionType]]
  }
  @scala.inline
  implicit class BaseOptionOps[Self <: BaseOption[_, _], /* <: typings.minimistOptions.mod.OptionType */ TypeOptionType, DefaultOptionType] (val x: Self with (BaseOption[TypeOptionType, DefaultOptionType])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAliasVarargs(value: String*): Self = this.set("alias", js.Array(value :_*))
    @scala.inline
    def setAlias(value: String | js.Array[String]): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setDefault(value: DefaultOptionType): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setType(value: TypeOptionType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

