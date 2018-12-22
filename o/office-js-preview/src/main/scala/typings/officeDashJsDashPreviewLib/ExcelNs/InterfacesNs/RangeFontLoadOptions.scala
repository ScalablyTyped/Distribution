package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * This object represents the font attributes (font name, font size, color, etc.) for an object.
         *
         * [Api set: ExcelApi 1.1]
         */

trait RangeFontLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the bold status of font.
               *
               * [Api set: ExcelApi 1.1]
               */
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * HTML color code representation of the text color. E.g. #FF0000 represents Red.
               *
               * [Api set: ExcelApi 1.1]
               */
  var color: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the italic status of the font.
               *
               * [Api set: ExcelApi 1.1]
               */
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Font name (e.g. "Calibri")
               *
               * [Api set: ExcelApi 1.1]
               */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Font size.
               *
               * [Api set: ExcelApi 1.1]
               */
  var size: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the strikethrough status of font. A null value indicates that the entire range doesn't have uniform Strikethrough setting.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var strikethrough: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the Subscript status of font.
              Returns True if all the fonts of the range are Subscript.
              Returns False if all the fonts of the range are Superscript or normal (neither Superscript, nor Subscript).
              Returns Null otherwise.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var subscript: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the Superscript status of font.
              Returns True if all the fonts of the range are Superscript.
              Returns False if all the fonts of the range are Subscript or normal (neither Superscript, nor Subscript).
              Returns Null otherwise.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var superscript: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Returns or sets a double that lightens or darkens a color for Range Font, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
              A null value indicates that the entire range doesn't have uniform font tintAndShade setting.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var tintAndShade: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Type of underline applied to the font. See Excel.RangeUnderlineStyle for details.
               *
               * [Api set: ExcelApi 1.1]
               */
  var underline: js.UndefOr[scala.Boolean] = js.undefined
}

