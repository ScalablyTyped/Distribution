package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Text Style configuration object as used by the Text Game Object.
  */
trait TextSyle extends js.Object {
  /**
    * The alignment of the Text. This only impacts multi-line text. Either `left`, `right`, `center` or `justify`.
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A solid fill color that is rendered behind the Text object. Given as a CSS string color such as `#ff0`.
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The amount of horizontal padding added to the width of the text when calculating the font metrics.
    */
  var baselineX: js.UndefOr[scala.Double] = js.undefined
  /**
    * The amount of vertical padding added to the height of the text when calculating the font metrics.
    */
  var baselineY: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color the Text is drawn in. Given as a CSS string color such as `#fff` or `rgb()`.
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Force the Text object to have the exact height specified in this property. Leave as zero for it to change accordingly to content.
    */
  var fixedHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Force the Text object to have the exact width specified in this property. Leave as zero for it to change accordingly to content.
    */
  var fixedWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The font the Text object will render with. This is a Canvas style font string.
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The font size, as a CSS size string.
    */
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Any addition font styles, such as 'strong'.
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of lines to display within the Text object.
    */
  var maxLines: js.UndefOr[phaserLib.integer] = js.undefined
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
  var resolution: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set to `true` if this Text object should render from right-to-left.
    */
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The Text shadow configuration object.
    */
  var shadow: js.UndefOr[TextShadow] = js.undefined
  /**
    * The color used to stroke the Text if the `strokeThickness` property is greater than zero.
    */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The thickness of the stroke around the Text. Set to zero for no stroke.
    */
  var strokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
    * This is the string used to aid Canvas in calculating the height of the font.
    */
  var testString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Text Word wrap configuration object.
    */
  var wordWrap: js.UndefOr[TextWordWrap] = js.undefined
}

object TextSyle {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    backgroundColor: java.lang.String = null,
    baselineX: scala.Int | scala.Double = null,
    baselineY: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    fixedHeight: scala.Int | scala.Double = null,
    fixedWidth: scala.Int | scala.Double = null,
    fontFamily: java.lang.String = null,
    fontSize: java.lang.String = null,
    fontStyle: java.lang.String = null,
    maxLines: js.UndefOr[phaserLib.integer] = js.undefined,
    metrics: TextMetrics = null,
    padding: TextPadding = null,
    resolution: scala.Int | scala.Double = null,
    rtl: js.UndefOr[scala.Boolean] = js.undefined,
    shadow: TextShadow = null,
    stroke: java.lang.String = null,
    strokeThickness: scala.Int | scala.Double = null,
    testString: java.lang.String = null,
    wordWrap: TextWordWrap = null
  ): TextSyle = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (baselineX != null) __obj.updateDynamic("baselineX")(baselineX.asInstanceOf[js.Any])
    if (baselineY != null) __obj.updateDynamic("baselineY")(baselineY.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (fixedHeight != null) __obj.updateDynamic("fixedHeight")(fixedHeight.asInstanceOf[js.Any])
    if (fixedWidth != null) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (!js.isUndefined(maxLines)) __obj.updateDynamic("maxLines")(maxLines)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeThickness != null) __obj.updateDynamic("strokeThickness")(strokeThickness.asInstanceOf[js.Any])
    if (testString != null) __obj.updateDynamic("testString")(testString)
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap)
    __obj.asInstanceOf[TextSyle]
  }
}

