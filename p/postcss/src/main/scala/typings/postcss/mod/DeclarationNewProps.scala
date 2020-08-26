package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclarationNewProps extends js.Object {
  /**
    * The declaration's property name.
    */
  var prop: js.UndefOr[String] = js.native
  var raws: js.UndefOr[DeclarationRaws] = js.native
  /**
    * The declaration's value. This value will be cleaned of comments. If the
    * source value contained comments, those comments will be available in the
    * _value.raws property. If you have not changed the value, the result of
    * decl.toString() will include the original raws value (comments and all).
    */
  var value: js.UndefOr[String] = js.native
}

object DeclarationNewProps {
  @scala.inline
  def apply(): DeclarationNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclarationNewProps]
  }
  @scala.inline
  implicit class DeclarationNewPropsOps[Self <: DeclarationNewProps] (val x: Self) extends AnyVal {
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
    def setProp(value: String): Self = this.set("prop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProp: Self = this.set("prop", js.undefined)
    @scala.inline
    def setRaws(value: DeclarationRaws): Self = this.set("raws", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaws: Self = this.set("raws", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

