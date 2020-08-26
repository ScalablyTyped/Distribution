package typings.phaser.Phaser.Types.GameObjects.Text

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Text Style configuration object as used by the Text Game Object.
  */
@js.native
trait TextStyle extends js.Object {
  /**
    * The alignment of the Text. This only impacts multi-line text. Either `left`, `right`, `center` or `justify`.
    */
  var align: js.UndefOr[String] = js.native
  /**
    * A solid fill color that is rendered behind the Text object. Given as a CSS string color such as `#ff0`.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * The amount of horizontal padding added to the width of the text when calculating the font metrics.
    */
  var baselineX: js.UndefOr[Double] = js.native
  /**
    * The amount of vertical padding added to the height of the text when calculating the font metrics.
    */
  var baselineY: js.UndefOr[Double] = js.native
  /**
    * The color the Text is drawn in. Given as a CSS string color such as `#fff` or `rgb()`.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Force the Text object to have the exact height specified in this property. Leave as zero for it to change accordingly to content.
    */
  var fixedHeight: js.UndefOr[Double] = js.native
  /**
    * Force the Text object to have the exact width specified in this property. Leave as zero for it to change accordingly to content.
    */
  var fixedWidth: js.UndefOr[Double] = js.native
  /**
    * The font the Text object will render with. This is a Canvas style font string.
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * The font size, as a CSS size string.
    */
  var fontSize: js.UndefOr[String] = js.native
  /**
    * Any addition font styles, such as 'strong'.
    */
  var fontStyle: js.UndefOr[String] = js.native
  /**
    * The maximum number of lines to display within the Text object.
    */
  var maxLines: js.UndefOr[integer] = js.native
  /**
    * A Text Metrics object. Use this to avoid expensive font size calculations in text heavy games.
    */
  var metrics: js.UndefOr[TextMetrics] = js.native
  /**
    * A Text Padding object.
    */
  var padding: js.UndefOr[TextPadding] = js.native
  /**
    * Sets the resolution (DPI setting) of the Text object. Leave at zero for it to use the game resolution.
    */
  var resolution: js.UndefOr[Double] = js.native
  /**
    * Set to `true` if this Text object should render from right-to-left.
    */
  var rtl: js.UndefOr[Boolean] = js.native
  /**
    * The Text shadow configuration object.
    */
  var shadow: js.UndefOr[TextShadow] = js.native
  /**
    * The color used to stroke the Text if the `strokeThickness` property is greater than zero.
    */
  var stroke: js.UndefOr[String] = js.native
  /**
    * The thickness of the stroke around the Text. Set to zero for no stroke.
    */
  var strokeThickness: js.UndefOr[Double] = js.native
  /**
    * This is the string used to aid Canvas in calculating the height of the font.
    */
  var testString: js.UndefOr[String] = js.native
  /**
    * The Text Word wrap configuration object.
    */
  var wordWrap: js.UndefOr[TextWordWrap] = js.native
}

object TextStyle {
  @scala.inline
  def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  @scala.inline
  implicit class TextStyleOps[Self <: TextStyle] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBaselineX(value: Double): Self = this.set("baselineX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineX: Self = this.set("baselineX", js.undefined)
    @scala.inline
    def setBaselineY(value: Double): Self = this.set("baselineY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineY: Self = this.set("baselineY", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFixedHeight(value: Double): Self = this.set("fixedHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedHeight: Self = this.set("fixedHeight", js.undefined)
    @scala.inline
    def setFixedWidth(value: Double): Self = this.set("fixedWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedWidth: Self = this.set("fixedWidth", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setMaxLines(value: integer): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLines: Self = this.set("maxLines", js.undefined)
    @scala.inline
    def setMetrics(value: TextMetrics): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setPadding(value: TextPadding): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setShadow(value: TextShadow): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeThickness(value: Double): Self = this.set("strokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeThickness: Self = this.set("strokeThickness", js.undefined)
    @scala.inline
    def setTestString(value: String): Self = this.set("testString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestString: Self = this.set("testString", js.undefined)
    @scala.inline
    def setWordWrap(value: TextWordWrap): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
  }
  
}

