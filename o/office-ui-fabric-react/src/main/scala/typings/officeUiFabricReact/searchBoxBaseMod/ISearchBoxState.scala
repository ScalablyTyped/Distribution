package typings.officeUiFabricReact.searchBoxBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchBoxState extends js.Object {
  var hasFocus: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String] = js.native
}

object ISearchBoxState {
  @scala.inline
  def apply(): ISearchBoxState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISearchBoxState]
  }
  @scala.inline
  implicit class ISearchBoxStateOps[Self <: ISearchBoxState] (val x: Self) extends AnyVal {
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
    def setHasFocus(value: Boolean): Self = this.set("hasFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasFocus: Self = this.set("hasFocus", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

