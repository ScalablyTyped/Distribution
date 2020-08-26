package typings.officeUiFabricReact.coachmarkBasicExampleMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoachmarkBasicExampleStyles extends js.Object {
  /**
    * The example button container
    */
  var buttonContainer: IStyle = js.native
  /**
    * The dropdown component container
    */
  var dropdownContainer: IStyle = js.native
  /**
    * Style for the root element in the default enabled/unchecked state.
    */
  var root: js.UndefOr[IStyle] = js.native
}

object ICoachmarkBasicExampleStyles {
  @scala.inline
  def apply(): ICoachmarkBasicExampleStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICoachmarkBasicExampleStyles]
  }
  @scala.inline
  implicit class ICoachmarkBasicExampleStylesOps[Self <: ICoachmarkBasicExampleStyles] (val x: Self) extends AnyVal {
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
    def setButtonContainer(value: IStyle): Self = this.set("buttonContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonContainer: Self = this.set("buttonContainer", js.undefined)
    @scala.inline
    def setButtonContainerNull: Self = this.set("buttonContainer", null)
    @scala.inline
    def setDropdownContainer(value: IStyle): Self = this.set("dropdownContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownContainer: Self = this.set("dropdownContainer", js.undefined)
    @scala.inline
    def setDropdownContainerNull: Self = this.set("dropdownContainer", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

