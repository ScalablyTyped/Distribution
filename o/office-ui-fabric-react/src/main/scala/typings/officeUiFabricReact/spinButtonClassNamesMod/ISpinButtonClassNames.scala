package typings.officeUiFabricReact.spinButtonClassNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpinButtonClassNames extends js.Object {
  var arrowBox: String = js.native
  var icon: String = js.native
  var input: String = js.native
  var label: String = js.native
  var labelWrapper: String = js.native
  var root: String = js.native
  var spinButtonWrapper: String = js.native
}

object ISpinButtonClassNames {
  @scala.inline
  def apply(
    arrowBox: String,
    icon: String,
    input: String,
    label: String,
    labelWrapper: String,
    root: String,
    spinButtonWrapper: String
  ): ISpinButtonClassNames = {
    val __obj = js.Dynamic.literal(arrowBox = arrowBox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelWrapper = labelWrapper.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], spinButtonWrapper = spinButtonWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinButtonClassNames]
  }
  @scala.inline
  implicit class ISpinButtonClassNamesOps[Self <: ISpinButtonClassNames] (val x: Self) extends AnyVal {
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
    def setArrowBox(value: String): Self = this.set("arrowBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelWrapper(value: String): Self = this.set("labelWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpinButtonWrapper(value: String): Self = this.set("spinButtonWrapper", value.asInstanceOf[js.Any])
  }
  
}

