package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "style.toJSON()". */

trait StyleData extends js.Object {
  /**
               *
               * Indicates if text is automatically indented when the text alignment in a cell is set to equal distribution.
               *
               * [Api set: ExcelApi 1.8]
               */
  var autoIndent: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * A Border collection of four Border objects that represent the style of the four borders.
              *
              * [Api set: ExcelApi 1.7]
              */
  var borders: js.UndefOr[js.Array[RangeBorderData]] = js.undefined
  /**
               *
               * Indicates if the style is a built-in style.
               *
               * [Api set: ExcelApi 1.7]
               */
  var builtIn: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * The Fill of the style.
              *
              * [Api set: ExcelApi 1.7]
              */
  var fill: js.UndefOr[RangeFillData] = js.undefined
  /**
              *
              * A Font object that represents the font of the style.
              *
              * [Api set: ExcelApi 1.7]
              */
  var font: js.UndefOr[RangeFontData] = js.undefined
  /**
               *
               * Indicates if the formula will be hidden when the worksheet is protected.
               *
               * [Api set: ExcelApi 1.7]
               */
  var formulaHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the horizontal alignment for the style. See Excel.HorizontalAlignment for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var horizontalAlignment: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.HorizontalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.General | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Fill | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CenterAcrossSelection | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed
  ] = js.undefined
  /**
               *
               * Indicates if the style includes the AutoIndent, HorizontalAlignment, VerticalAlignment, WrapText, IndentLevel, and TextOrientation properties.
               *
               * [Api set: ExcelApi 1.7]
               */
  var includeAlignment: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Indicates if the style includes the Color, ColorIndex, LineStyle, and Weight border properties.
               *
               * [Api set: ExcelApi 1.7]
               */
  var includeBorder: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Indicates if the style includes the Background, Bold, Color, ColorIndex, FontStyle, Italic, Name, Size, Strikethrough, Subscript, Superscript, and Underline font properties.
               *
               * [Api set: ExcelApi 1.7]
               */
  var includeFont: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Indicates if the style includes the NumberFormat property.
               *
               * [Api set: ExcelApi 1.7]
               */
  var includeNumber: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Indicates if the style includes the Color, ColorIndex, InvertIfNegative, Pattern, PatternColor, and PatternColorIndex interior properties.
               *
               * [Api set: ExcelApi 1.7]
               */
  var includePatterns: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Indicates if the style includes the FormulaHidden and Locked protection properties.
               *
               * [Api set: ExcelApi 1.7]
               */
  var includeProtection: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * An integer from 0 to 250 that indicates the indent level for the style.
               *
               * [Api set: ExcelApi 1.7]
               */
  var indentLevel: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Indicates if the object is locked when the worksheet is protected.
               *
               * [Api set: ExcelApi 1.7]
               */
  var locked: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * The name of the style.
               *
               * [Api set: ExcelApi 1.7]
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * The format code of the number format for the style.
               *
               * [Api set: ExcelApi 1.7]
               */
  var numberFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * The localized format code of the number format for the style.
               *
               * [Api set: ExcelApi 1.7]
               */
  var numberFormatLocal: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * The reading order for the style.
               *
               * [Api set: ExcelApi 1.7]
               */
  var readingOrder: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ReadingOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Context | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LeftToRight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RightToLeft
  ] = js.undefined
  /**
               *
               * Indicates if text automatically shrinks to fit in the available column width.
               *
               * [Api set: ExcelApi 1.7]
               */
  var shrinkToFit: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * The text orientation for the style.
               *
               * [Api set: ExcelApi 1.8]
               */
  var textOrientation: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the vertical alignment for the style. See Excel.VerticalAlignment for details.
               *
               * [Api set: ExcelApi 1.7]
               */
  var verticalAlignment: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.VerticalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed
  ] = js.undefined
  /**
               *
               * Indicates if Microsoft Excel wraps the text in the object.
               *
               * [Api set: ExcelApi 1.7]
               */
  var wrapText: js.UndefOr[scala.Boolean] = js.undefined
}

