package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.RangeFontData
import typings.officeJs.Excel.Interfaces.RangeFontLoadOptions
import typings.officeJs.Excel.Interfaces.RangeFontUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.DoubleAccountant
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Single
import typings.officeJs.officeJsStrings.SingleAccountant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object represents the font attributes (font name, font size, color, etc.) for an object.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait RangeFont
  extends StObject
     with ClientObject {
  
  /**
    * Represents the bold status of the font.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var bold: Boolean = js.native
  
  /**
    * HTML color code representation of the text color (e.g., #FF0000 represents Red).
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var color: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeFont: RequestContext = js.native
  
  /**
    * Specifies the italic status of the font.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var italic: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeFont = js.native
  def load(options: RangeFontLoadOptions): RangeFont = js.native
  def load(propertyNamesAndPaths: Expand): RangeFont = js.native
  def load(propertyNames: String): RangeFont = js.native
  def load(propertyNames: js.Array[String]): RangeFont = js.native
  
  /**
    * Font name (e.g., "Calibri"). The name's length should not be greater than 31 characters.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var name: String = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: RangeFontUpdateData): Unit = js.native
  def set(properties: RangeFontUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeFont): Unit = js.native
  
  /**
    * Font size.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var size: Double = js.native
  
  /**
    * Specifies the strikethrough status of font. A `null` value indicates that the entire range doesn't have a uniform strikethrough setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var strikethrough: Boolean = js.native
  
  /**
    * Specifies the subscript status of font.
    Returns `true` if all the fonts of the range are subscript.
    Returns `false` if all the fonts of the range are superscript or normal (neither superscript, nor subscript).
    Returns `null` otherwise.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var subscript: Boolean = js.native
  
  /**
    * Specifies the superscript status of font.
    Returns `true` if all the fonts of the range are superscript.
    Returns `false` if all the fonts of the range are subscript or normal (neither superscript, nor subscript).
    Returns `null` otherwise.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var superscript: Boolean = js.native
  
  /**
    * Specifies a double that lightens or darkens a color for the range font. The value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A `null` value indicates that the entire range doesn't have a uniform font `tintAndShade` setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeFont object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeFontData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeFontData = js.native
  
  /**
    * Type of underline applied to the font. See `Excel.RangeUnderlineStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var underline: RangeUnderlineStyle | None | Single | typings.officeJs.officeJsStrings.Double | SingleAccountant | DoubleAccountant = js.native
}
