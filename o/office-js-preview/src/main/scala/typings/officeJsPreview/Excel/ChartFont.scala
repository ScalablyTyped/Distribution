package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.ChartFontData
import typings.officeJsPreview.Excel.Interfaces.ChartFontLoadOptions
import typings.officeJsPreview.Excel.Interfaces.ChartFontUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object represents the font attributes (such as font name, font size, and color) for a chart object.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartFont
  extends StObject
     with ClientObject {
  
  /**
    * Represents the bold status of font.
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
  var context_ChartFont: RequestContext = js.native
  
  /**
    * Represents the italic status of the font.
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
  def load(): ChartFont = js.native
  def load(options: ChartFontLoadOptions): ChartFont = js.native
  def load(propertyNamesAndPaths: Expand): ChartFont = js.native
  def load(propertyNames: String): ChartFont = js.native
  def load(propertyNames: js.Array[String]): ChartFont = js.native
  
  /**
    * Font name (e.g., "Calibri")
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var name: String = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartFont): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartFontUpdateData): Unit = js.native
  def set(properties: ChartFontUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Size of the font (e.g., 11)
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var size: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartFont object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartFontData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartFontData = js.native
  
  /**
    * Type of underline applied to the font. See `Excel.ChartUnderlineStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var underline: ChartUnderlineStyle | None | Single = js.native
}
