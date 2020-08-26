package typings.officeUiFabricReact.colorPickerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorPickerStrings extends js.Object {
  /**
    * Label for the alpha text field.
    * Also used as the aria label for the alpha slider if `alphaAriaLabel` is not provided.
    * @defaultvalue Alpha
    */
  var alpha: js.UndefOr[String] = js.native
  /**
    * Customized aria-label for the alpha slider.
    */
  var alphaAriaLabel: js.UndefOr[String] = js.native
  /**
    * Label for the blue text field.
    * @defaultvalue Blue
    */
  var blue: js.UndefOr[String] = js.native
  /**
    * Label for the green text field.
    * @defaultvalue Green
    */
  var green: js.UndefOr[String] = js.native
  /**
    * Label for the hex text field.
    * @defaultvalue Hex
    */
  var hex: js.UndefOr[String] = js.native
  /**
    * Aria label for the hue slider.
    * @deprecated Use `hueAriaLabel`
    */
  var hue: js.UndefOr[String] = js.native
  /**
    * Aria label for the hue slider.
    * @defaultvalue Hue
    */
  var hueAriaLabel: js.UndefOr[String] = js.native
  /**
    * Label for the red text field.
    * @defaultvalue Red
    */
  var red: js.UndefOr[String] = js.native
  /**
    * Accessible label for the root of the color picker region.
    * The string should contain a placeholder `{0}` for the currently selected color.
    * @defaultvalue `'Color picker, {0} selected.'`
    */
  var rootAriaLabelFormat: js.UndefOr[String] = js.native
  /**
    * Detailed description for how to use the color rectangle. Moving the thumb horizontally adjusts
    * saturation and moving it vertically adjusts value (essentially, brightness).
    * @defaultvalue 'Use left and right arrow keys to set saturation. Use up and down arrow keys to set brightness.'
    */
  var svAriaDescription: js.UndefOr[String] = js.native
  /**
    * Aria label for the color rectangle, which adjusts saturation and value (brightness).
    * @defaultvalue 'Saturation and brightness'
    */
  var svAriaLabel: js.UndefOr[String] = js.native
  /**
    * Format string for the current values of the color rectangle.
    * The string must include descriptions and two placeholders for the current values:
    * `{0}` for saturation and `{1}` for value/brightness.
    * @defaultvalue `'Saturation {0} brightness {1}'`
    */
  var svAriaValueFormat: js.UndefOr[String] = js.native
  /**
    * Label for the transparency text field.
    * @defaultvalue Transparency
    */
  var transparency: js.UndefOr[String] = js.native
  /**
    * Customized aria-label for the transparency slider.
    */
  var transparencyAriaLabel: js.UndefOr[String] = js.native
}

object IColorPickerStrings {
  @scala.inline
  def apply(): IColorPickerStrings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorPickerStrings]
  }
  @scala.inline
  implicit class IColorPickerStringsOps[Self <: IColorPickerStrings] (val x: Self) extends AnyVal {
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
    def setAlpha(value: String): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setAlphaAriaLabel(value: String): Self = this.set("alphaAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlphaAriaLabel: Self = this.set("alphaAriaLabel", js.undefined)
    @scala.inline
    def setBlue(value: String): Self = this.set("blue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlue: Self = this.set("blue", js.undefined)
    @scala.inline
    def setGreen(value: String): Self = this.set("green", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreen: Self = this.set("green", js.undefined)
    @scala.inline
    def setHex(value: String): Self = this.set("hex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHex: Self = this.set("hex", js.undefined)
    @scala.inline
    def setHue(value: String): Self = this.set("hue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHue: Self = this.set("hue", js.undefined)
    @scala.inline
    def setHueAriaLabel(value: String): Self = this.set("hueAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHueAriaLabel: Self = this.set("hueAriaLabel", js.undefined)
    @scala.inline
    def setRed(value: String): Self = this.set("red", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRed: Self = this.set("red", js.undefined)
    @scala.inline
    def setRootAriaLabelFormat(value: String): Self = this.set("rootAriaLabelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootAriaLabelFormat: Self = this.set("rootAriaLabelFormat", js.undefined)
    @scala.inline
    def setSvAriaDescription(value: String): Self = this.set("svAriaDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvAriaDescription: Self = this.set("svAriaDescription", js.undefined)
    @scala.inline
    def setSvAriaLabel(value: String): Self = this.set("svAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvAriaLabel: Self = this.set("svAriaLabel", js.undefined)
    @scala.inline
    def setSvAriaValueFormat(value: String): Self = this.set("svAriaValueFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvAriaValueFormat: Self = this.set("svAriaValueFormat", js.undefined)
    @scala.inline
    def setTransparency(value: String): Self = this.set("transparency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparency: Self = this.set("transparency", js.undefined)
    @scala.inline
    def setTransparencyAriaLabel(value: String): Self = this.set("transparencyAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparencyAriaLabel: Self = this.set("transparencyAriaLabel", js.undefined)
  }
  
}

