package typings.phaser.Phaser.Types.GameObjects.Text

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Text Style configuration object as used by the Text Game Object.
  */
trait TextStyle extends js.Object {
  /**
    * The alignment of the Text. This only impacts multi-line text. Either `left`, `right`, `center` or `justify`.
    */
  var align: js.UndefOr[String] = js.undefined
  /**
    * A solid fill color that is rendered behind the Text object. Given as a CSS string color such as `#ff0`.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * The amount of horizontal padding added to the width of the text when calculating the font metrics.
    */
  var baselineX: js.UndefOr[Double] = js.undefined
  /**
    * The amount of vertical padding added to the height of the text when calculating the font metrics.
    */
  var baselineY: js.UndefOr[Double] = js.undefined
  /**
    * The color the Text is drawn in. Given as a CSS string color such as `#fff` or `rgb()`.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Force the Text object to have the exact height specified in this property. Leave as zero for it to change accordingly to content.
    */
  var fixedHeight: js.UndefOr[Double] = js.undefined
  /**
    * Force the Text object to have the exact width specified in this property. Leave as zero for it to change accordingly to content.
    */
  var fixedWidth: js.UndefOr[Double] = js.undefined
  /**
    * The font the Text object will render with. This is a Canvas style font string.
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * The font size, as a CSS size string.
    */
  var fontSize: js.UndefOr[String] = js.undefined
  /**
    * Any addition font styles, such as 'strong'.
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of lines to display within the Text object.
    */
  var maxLines: js.UndefOr[integer] = js.undefined
  /**
    * A Text Metrics object. Use this to avoid expensive font size calculations in text heavy games.
    */
  var metrics: js.UndefOr[TextMetrics] = js.undefined
  /**
    * A Text Padding object.
    */
  var padding: js.UndefOr[TextPadding] = js.undefined
  /**
    * Sets the resolution (DPI setting) of the Text object. Leave at zero for it to use the game resolution.
    */
  var resolution: js.UndefOr[Double] = js.undefined
  /**
    * Set to `true` if this Text object should render from right-to-left.
    */
  var rtl: js.UndefOr[Boolean] = js.undefined
  /**
    * The Text shadow configuration object.
    */
  var shadow: js.UndefOr[TextShadow] = js.undefined
  /**
    * The color used to stroke the Text if the `strokeThickness` property is greater than zero.
    */
  var stroke: js.UndefOr[String] = js.undefined
  /**
    * The thickness of the stroke around the Text. Set to zero for no stroke.
    */
  var strokeThickness: js.UndefOr[Double] = js.undefined
  /**
    * This is the string used to aid Canvas in calculating the height of the font.
    */
  var testString: js.UndefOr[String] = js.undefined
  /**
    * The Text Word wrap configuration object.
    */
  var wordWrap: js.UndefOr[TextWordWrap] = js.undefined
}

object TextStyle {
  @scala.inline
  def apply(
    align: String = null,
    backgroundColor: String = null,
    baselineX: js.UndefOr[Double] = js.undefined,
    baselineY: js.UndefOr[Double] = js.undefined,
    color: String = null,
    fixedHeight: js.UndefOr[Double] = js.undefined,
    fixedWidth: js.UndefOr[Double] = js.undefined,
    fontFamily: String = null,
    fontSize: String = null,
    fontStyle: String = null,
    maxLines: js.UndefOr[integer] = js.undefined,
    metrics: TextMetrics = null,
    padding: TextPadding = null,
    resolution: js.UndefOr[Double] = js.undefined,
    rtl: js.UndefOr[Boolean] = js.undefined,
    shadow: TextShadow = null,
    stroke: String = null,
    strokeThickness: js.UndefOr[Double] = js.undefined,
    testString: String = null,
    wordWrap: TextWordWrap = null
  ): TextStyle = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(baselineX)) __obj.updateDynamic("baselineX")(baselineX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(baselineY)) __obj.updateDynamic("baselineY")(baselineY.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeight)) __obj.updateDynamic("fixedHeight")(fixedHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth.get.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLines)) __obj.updateDynamic("maxLines")(maxLines.get.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.get.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeThickness)) __obj.updateDynamic("strokeThickness")(strokeThickness.get.asInstanceOf[js.Any])
    if (testString != null) __obj.updateDynamic("testString")(testString.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
}

