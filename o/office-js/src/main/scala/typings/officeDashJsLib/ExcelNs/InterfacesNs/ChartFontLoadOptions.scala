package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * This object represents the font attributes (font name, font size, color, etc.) for a chart object.
         *
         * [Api set: ExcelApi 1.1]
         */

trait ChartFontLoadOptions extends js.Object {
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
               * Size of the font (e.g. 11)
               *
               * [Api set: ExcelApi 1.1]
               */
  var size: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Type of underline applied to the font. See Excel.ChartUnderlineStyle for details.
               *
               * [Api set: ExcelApi 1.1]
               */
  var underline: js.UndefOr[scala.Boolean] = js.undefined
}

