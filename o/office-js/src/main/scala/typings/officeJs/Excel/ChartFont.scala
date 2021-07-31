package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.ChartFontData
import typings.officeJs.Excel.Interfaces.ChartFontLoadOptions
import typings.officeJs.Excel.Interfaces.ChartFontUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * This object represents the font attributes (font name, font size, color, etc.) for a chart object.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartFont
  extends StObject
     with ClientObject {
  
  /**
    *
    * Represents the bold status of font.
    *
    * [Api set: ExcelApi 1.1]
    */
  var bold: Boolean = js.native
  
  /**
    *
    * HTML color code representation of the text color (e.g., #FF0000 represents Red).
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartFont: RequestContext = js.native
  
  /**
    *
    * Represents the italic status of the font.
    *
    * [Api set: ExcelApi 1.1]
    */
  var italic: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartFont = js.native
  def load(options: ChartFontLoadOptions): ChartFont = js.native
  def load(propertyNamesAndPaths: Expand): ChartFont = js.native
  def load(propertyNames: String): ChartFont = js.native
  def load(propertyNames: js.Array[String]): ChartFont = js.native
  
  /**
    *
    * Font name (e.g., "Calibri")
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: String = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartFont): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartFont): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartFontUpdateData): Unit = js.native
  def set(properties: ChartFontUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    *
    * Size of the font (e.g., 11)
    *
    * [Api set: ExcelApi 1.1]
    */
  var size: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartFont object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartFontData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartFontData = js.native
  
  /**
    *
    * Type of underline applied to the font. See Excel.ChartUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var underline: ChartUnderlineStyle | None | Single = js.native
}
