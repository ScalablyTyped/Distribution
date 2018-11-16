package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "conditionalRangeFont.toJSON()". */

trait ConditionalRangeFontData extends js.Object {
  /**
               *
               * Represents the bold status of font.
               *
               * [Api set: ExcelApi 1.6]
               */
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * HTML color code representation of the text color. E.g. #FF0000 represents Red.
               *
               * [Api set: ExcelApi 1.6]
               */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Represents the italic status of the font.
               *
               * [Api set: ExcelApi 1.6]
               */
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the strikethrough status of the font.
               *
               * [Api set: ExcelApi 1.6]
               */
  var strikethrough: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Type of underline applied to the font. See Excel.ConditionalRangeFontUnderlineStyle for details.
               *
               * [Api set: ExcelApi 1.6]
               */
  var underline: js.UndefOr[
    officeDashJsLib.ExcelNs.ConditionalRangeFontUnderlineStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Single | officeDashJsLib.officeDashJsLibStrings.Double
  ] = js.undefined
}

