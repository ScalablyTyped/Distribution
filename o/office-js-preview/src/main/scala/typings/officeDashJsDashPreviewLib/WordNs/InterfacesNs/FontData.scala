package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "font.toJSON()". */
trait FontData extends js.Object {
  /**
    *
    * Gets or sets a value that indicates whether the font is bold. True if the font is formatted as bold, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the color for the specified font. You can provide the value in the '#RRGGBB' format or the color name.
    *
    * [Api set: WordApi 1.1]
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the font has a double strikethrough. True if the font is formatted as double strikethrough text, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var doubleStrikeThrough: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the highlight color. To set it, use a value either in the '#RRGGBB' format or the color name. To remove highlight color, set it to null. The returned highlight color can be in the '#RRGGBB' format, an empty string for mixed highlight colors, or null for no highlight color.
    *
    * **Note**: Only the default highlight colors are available in Office on Windows Desktop. 
    * These are "Yellow", "Lime", "Turquoise", "Pink", "Blue", "Red", "DarkBlue", "Teal", "Green", "Purple", "DarkRed", "Olive", "Gray", "LightGray", and "Black".
    * When the add-in runs in Office on Windows Desktop, any other color is converted to the closest color when applied to the font.
    * 
    * [Api set: WordApi 1.1]
    */
  var highlightColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the font is italicized. True if the font is italicized, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that represents the name of the font.
    *
    * [Api set: WordApi 1.1]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets a value that represents the font size in points.
    *
    * [Api set: WordApi 1.1]
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the font has a strikethrough. True if the font is formatted as strikethrough text, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var strikeThrough: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the font is a subscript. True if the font is formatted as subscript, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var subscript: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the font is a superscript. True if the font is formatted as superscript, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var superscript: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates the font's underline type. 'None' if the font is not underlined.
    *
    * [Api set: WordApi 1.1]
    */
  var underline: js.UndefOr[
    officeDashJsDashPreviewLib.WordNs.UnderlineType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mixed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Hidden | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotLine | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Single | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Word | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Thick | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dotted | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DottedHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashLine | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashLineHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashLineLong | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashLineLongHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDashLine | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDashLineHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TwoDotDashLine | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TwoDotDashLineHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wave | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WaveHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WaveDouble
  ] = js.undefined
}

object FontData {
  @scala.inline
  def apply(
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    doubleStrikeThrough: js.UndefOr[scala.Boolean] = js.undefined,
    highlightColor: java.lang.String = null,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    strikeThrough: js.UndefOr[scala.Boolean] = js.undefined,
    subscript: js.UndefOr[scala.Boolean] = js.undefined,
    superscript: js.UndefOr[scala.Boolean] = js.undefined,
    underline: officeDashJsDashPreviewLib.WordNs.UnderlineType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mixed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Hidden | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotLine | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Single | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Word | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Thick | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dotted | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DottedHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashLine | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashLineHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashLineLong | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashLineLongHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDashLine | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDashLineHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TwoDotDashLine | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TwoDotDashLineHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wave | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WaveHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WaveDouble = null
  ): FontData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(doubleStrikeThrough)) __obj.updateDynamic("doubleStrikeThrough")(doubleStrikeThrough)
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strikeThrough)) __obj.updateDynamic("strikeThrough")(strikeThrough)
    if (!js.isUndefined(subscript)) __obj.updateDynamic("subscript")(subscript)
    if (!js.isUndefined(superscript)) __obj.updateDynamic("superscript")(superscript)
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontData]
  }
}

