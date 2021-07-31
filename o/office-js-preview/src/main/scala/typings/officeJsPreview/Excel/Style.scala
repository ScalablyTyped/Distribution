package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.StyleData
import typings.officeJsPreview.Excel.Interfaces.StyleLoadOptions
import typings.officeJsPreview.Excel.Interfaces.StyleUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Bottom
import typings.officeJsPreview.officeJsPreviewStrings.Center
import typings.officeJsPreview.officeJsPreviewStrings.CenterAcrossSelection
import typings.officeJsPreview.officeJsPreviewStrings.Context
import typings.officeJsPreview.officeJsPreviewStrings.Distributed
import typings.officeJsPreview.officeJsPreviewStrings.Fill
import typings.officeJsPreview.officeJsPreviewStrings.General
import typings.officeJsPreview.officeJsPreviewStrings.Justify
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.LeftToRight
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.RightToLeft
import typings.officeJsPreview.officeJsPreviewStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * An object encapsulating a style's format and other properties.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait Style
  extends StObject
     with ClientObject {
  
  /**
    *
    * Specifies if text is automatically indented when the text alignment in a cell is set to equal distribution.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoIndent: Boolean = js.native
  
  /**
    *
    * A Border collection of four Border objects that represent the style of the four borders.
    *
    * [Api set: ExcelApi 1.7]
    */
  val borders: RangeBorderCollection = js.native
  
  /**
    *
    * Specifies if the style is a built-in style.
    *
    * [Api set: ExcelApi 1.7]
    */
  val builtIn: Boolean = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Style: RequestContext = js.native
  
  /**
    * Deletes this style.
    *
    * [Api set: ExcelApi 1.7]
    */
  def delete(): Unit = js.native
  
  /**
    *
    * The Fill of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  val fill: RangeFill = js.native
  
  /**
    *
    * A Font object that represents the font of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  val font: RangeFont = js.native
  
  /**
    *
    * Specifies if the formula will be hidden when the worksheet is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var formulaHidden: Boolean = js.native
  
  /**
    *
    * Represents the horizontal alignment for the style. See Excel.HorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var horizontalAlignment: HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed = js.native
  
  /**
    *
    * Specifies if the style includes the AutoIndent, HorizontalAlignment, VerticalAlignment, WrapText, IndentLevel, and TextOrientation properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeAlignment: Boolean = js.native
  
  /**
    *
    * Specifies if the style includes the Color, ColorIndex, LineStyle, and Weight border properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeBorder: Boolean = js.native
  
  /**
    *
    * Specifies if the style includes the Background, Bold, Color, ColorIndex, FontStyle, Italic, Name, Size, Strikethrough, Subscript, Superscript, and Underline font properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeFont: Boolean = js.native
  
  /**
    *
    * Specifies if the style includes the NumberFormat property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeNumber: Boolean = js.native
  
  /**
    *
    * Specifies if the style includes the Color, ColorIndex, InvertIfNegative, Pattern, PatternColor, and PatternColorIndex interior properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includePatterns: Boolean = js.native
  
  /**
    *
    * Specifies if the style includes the FormulaHidden and Locked protection properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeProtection: Boolean = js.native
  
  /**
    *
    * An integer from 0 to 250 that indicates the indent level for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var indentLevel: Double = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Style = js.native
  def load(options: StyleLoadOptions): Style = js.native
  def load(propertyNamesAndPaths: Expand): Style = js.native
  def load(propertyNames: String): Style = js.native
  def load(propertyNames: js.Array[String]): Style = js.native
  
  /**
    *
    * Specifies if the object is locked when the worksheet is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var locked: Boolean = js.native
  
  /**
    *
    * The name of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  val name: String = js.native
  
  /**
    *
    * The format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormat: String = js.native
  
  /**
    *
    * The localized format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: String = js.native
  
  /**
    *
    * The reading order for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var readingOrder: ReadingOrder | Context | LeftToRight | RightToLeft = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.Style): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: StyleUpdateData): Unit = js.native
  def set(properties: StyleUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Style): Unit = js.native
  
  /**
    *
    * Specifies if text automatically shrinks to fit in the available column width.
    *
    * [Api set: ExcelApi 1.7]
    */
  var shrinkToFit: Boolean = js.native
  
  /**
    *
    * The text orientation for the style.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Style object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.StyleData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): StyleData = js.native
  
  /**
    *
    * Specifies the vertical alignment for the style. See Excel.VerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var verticalAlignment: VerticalAlignment | Top | Center | Bottom | Justify | Distributed = js.native
  
  /**
    *
    * Specifies if Excel wraps the text in the object.
    *
    * [Api set: ExcelApi 1.7]
    */
  var wrapText: Boolean = js.native
}
