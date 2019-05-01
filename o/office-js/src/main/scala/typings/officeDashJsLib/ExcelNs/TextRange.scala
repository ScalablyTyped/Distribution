package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the text that is attached to a shape, in addition to properties and methods for manipulating the text.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.TextRange")
@js.native
class TextRange ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TextRange: RequestContext = js.native
  /**
    *
    * Returns a ShapeFont object that represents the font attributes for the text range. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val font: ShapeFont = js.native
  /**
    *
    * Represents the plain text content of the text range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var text: java.lang.String = js.native
  /**
    *
    * Returns a TextRange object for the substring in the given range.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param start The zero-based index of the first character to get from the text range.
    * @param length Optional. The number of characters to be returned in the new text range. If length is omitted, all the characters from start to the end of the text range's last paragraph will be returned.
    */
  def getSubstring(start: scala.Double): TextRange = js.native
  def getSubstring(start: scala.Double, length: scala.Double): TextRange = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.TextRange` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.TextRange` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.TextRange` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TextRange = js.native
  def load(option: java.lang.String): TextRange = js.native
  def load(option: js.Array[java.lang.String]): TextRange = js.native
  def load(option: officeDashJsLib.Anon_Expand): TextRange = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.TextRangeLoadOptions): TextRange = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.TextRange): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.TextRangeUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.TextRangeUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TextRange): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TextRange object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TextRangeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.TextRangeData = js.native
}

