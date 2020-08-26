package typings.officeUiFabricReact.colorSliderTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorSliderStyles extends js.Object {
  /**
    * Style set for the root element.
    */
  var root: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the overlay element.
    */
  var sliderOverlay: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the draggable thumb element.
    */
  var sliderThumb: js.UndefOr[IStyle] = js.native
}

object IColorSliderStyles {
  @scala.inline
  def apply(): IColorSliderStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorSliderStyles]
  }
  @scala.inline
  implicit class IColorSliderStylesOps[Self <: IColorSliderStyles] (val x: Self) extends AnyVal {
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
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setSliderOverlay(value: IStyle): Self = this.set("sliderOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderOverlay: Self = this.set("sliderOverlay", js.undefined)
    @scala.inline
    def setSliderOverlayNull: Self = this.set("sliderOverlay", null)
    @scala.inline
    def setSliderThumb(value: IStyle): Self = this.set("sliderThumb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderThumb: Self = this.set("sliderThumb", js.undefined)
    @scala.inline
    def setSliderThumbNull: Self = this.set("sliderThumb", null)
  }
  
}

