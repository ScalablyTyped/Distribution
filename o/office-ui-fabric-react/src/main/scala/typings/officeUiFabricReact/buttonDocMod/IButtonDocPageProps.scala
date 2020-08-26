package typings.officeUiFabricReact.buttonDocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IButtonDocPageProps extends js.Object {
  var areButtonsChecked: Boolean = js.native
  var areButtonsDisabled: Boolean = js.native
}

object IButtonDocPageProps {
  @scala.inline
  def apply(areButtonsChecked: Boolean, areButtonsDisabled: Boolean): IButtonDocPageProps = {
    val __obj = js.Dynamic.literal(areButtonsChecked = areButtonsChecked.asInstanceOf[js.Any], areButtonsDisabled = areButtonsDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButtonDocPageProps]
  }
  @scala.inline
  implicit class IButtonDocPagePropsOps[Self <: IButtonDocPageProps] (val x: Self) extends AnyVal {
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
    def setAreButtonsChecked(value: Boolean): Self = this.set("areButtonsChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setAreButtonsDisabled(value: Boolean): Self = this.set("areButtonsDisabled", value.asInstanceOf[js.Any])
  }
  
}

