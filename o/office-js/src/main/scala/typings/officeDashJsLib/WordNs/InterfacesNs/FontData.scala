package typings
package officeDashJsLib.WordNs.InterfacesNs

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
    officeDashJsLib.WordNs.UnderlineType | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Hidden | officeDashJsLib.officeDashJsLibStrings.DotLine | officeDashJsLib.officeDashJsLibStrings.Single | officeDashJsLib.officeDashJsLibStrings.Word | officeDashJsLib.officeDashJsLibStrings.Double | officeDashJsLib.officeDashJsLibStrings.Thick | officeDashJsLib.officeDashJsLibStrings.Dotted | officeDashJsLib.officeDashJsLibStrings.DottedHeavy | officeDashJsLib.officeDashJsLibStrings.DashLine | officeDashJsLib.officeDashJsLibStrings.DashLineHeavy | officeDashJsLib.officeDashJsLibStrings.DashLineLong | officeDashJsLib.officeDashJsLibStrings.DashLineLongHeavy | officeDashJsLib.officeDashJsLibStrings.DotDashLine | officeDashJsLib.officeDashJsLibStrings.DotDashLineHeavy | officeDashJsLib.officeDashJsLibStrings.TwoDotDashLine | officeDashJsLib.officeDashJsLibStrings.TwoDotDashLineHeavy | officeDashJsLib.officeDashJsLibStrings.Wave | officeDashJsLib.officeDashJsLibStrings.WaveHeavy | officeDashJsLib.officeDashJsLibStrings.WaveDouble
  ] = js.undefined
}

