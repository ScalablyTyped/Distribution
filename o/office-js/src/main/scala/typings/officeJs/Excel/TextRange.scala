package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.TextRangeData
import typings.officeJs.Excel.Interfaces.TextRangeLoadOptions
import typings.officeJs.Excel.Interfaces.TextRangeUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the text that is attached to a shape, in addition to properties and methods for manipulating the text.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait TextRange
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TextRange: RequestContext = js.native
  
  /**
    * Returns a `ShapeFont` object that represents the font attributes for the text range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val font: ShapeFont = js.native
  
  /**
    * Returns a TextRange object for the substring in the given range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param start The zero-based index of the first character to get from the text range.
    * @param length Optional. The number of characters to be returned in the new text range. If length is omitted, all the characters from start to the end of the text range's last paragraph will be returned.
    */
  def getSubstring(start: Double): TextRange = js.native
  def getSubstring(start: Double, length: Double): TextRange = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TextRange = js.native
  def load(options: TextRangeLoadOptions): TextRange = js.native
  def load(propertyNamesAndPaths: Expand): TextRange = js.native
  def load(propertyNames: String): TextRange = js.native
  def load(propertyNames: js.Array[String]): TextRange = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TextRangeUpdateData): Unit = js.native
  def set(properties: TextRangeUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TextRange): Unit = js.native
  
  /**
    * Represents the plain text content of the text range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var text: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TextRange object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TextRangeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TextRangeData = js.native
}
