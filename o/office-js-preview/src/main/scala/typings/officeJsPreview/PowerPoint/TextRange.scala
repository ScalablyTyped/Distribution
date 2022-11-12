package typings.officeJsPreview.PowerPoint

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.PowerPoint.Interfaces.TextRangeData
import typings.officeJsPreview.PowerPoint.Interfaces.TextRangeLoadOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the text that is attached to a shape, in addition to properties and methods for manipulating the text.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
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
    * [Api set: PowerPointApi 1.4]
    */
  val font: ShapeFont = js.native
  
  /**
    * Returns the parent {@link PowerPoint.TextFrame} object that holds this `TextRange`.
    *
    * @remarks
    * [Api set: PowerPointApi 1.5]
    */
  def getParentTextFrame(): TextFrame = js.native
  
  /**
    * Returns a `TextRange` object for the substring in the given range.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    *
    * @param start The zero-based index of the first character to get from the text range.
    * @param length Optional. The number of characters to be returned in the new text range. If length is omitted, all the characters from start to the end of the text range's last paragraph will be returned.
    */
  def getSubstring(start: Double): TextRange = js.native
  def getSubstring(start: Double, length: Double): TextRange = js.native
  
  /**
    * Gets or sets the length of the range that this `TextRange` represents.
    Throws an `InvalidArgument` exception when set with a negative value or if the value is greater than the length of the available text from the starting point.
    *
    * @remarks
    * [Api set: PowerPointApi 1.5]
    */
  var length: Double = js.native
  
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
    * Represents the paragraph format of the text range. See {@link PowerPoint.ParagraphFormat} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  val paragraphFormat: ParagraphFormat = js.native
  
  /**
    * Selects this `TextRange` in the current view.
    *
    * @remarks
    * [Api set: PowerPointApi 1.5]
    */
  def setSelected(): Unit = js.native
  
  /**
    * Gets or sets zero-based index, relative to the parent text frame, for the starting position of the range that this `TextRange` represents.
    Throws an `InvalidArgument` exception when set with a negative value or if the value is greater than the length of the text.
    *
    * @remarks
    * [Api set: PowerPointApi 1.5]
    */
  var start: Double = js.native
  
  /**
    * Represents the plain text content of the text range.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var text: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original PowerPoint.TextRange object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.TextRangeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TextRangeData = js.native
}
