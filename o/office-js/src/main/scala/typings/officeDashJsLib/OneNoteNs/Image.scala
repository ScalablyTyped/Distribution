package typings
package officeDashJsLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an Image. An Image can be a direct child of a PageContent object or a Paragraph object.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.Image")
@js.native
class Image ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Image: RequestContext = js.native
  /**
    *
    * Gets or sets the description of the Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var description: java.lang.String = js.native
  /**
    *
    * Gets or sets the height of the Image layout.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var height: scala.Double = js.native
  /**
    *
    * Gets or sets the hyperlink of the Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var hyperlink: java.lang.String = js.native
  /**
    *
    * Gets the ID of the Image object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val id: java.lang.String = js.native
  /**
    *
    * Gets the data obtained by OCR (Optical Character Recognition) of this Image, such as OCR text and language.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val ocrData: ImageOcrData = js.native
  /**
    *
    * Gets the PageContent object that contains the Image. Throws if the Image is not a direct child of a PageContent. This object defines the position of the Image on the page. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val pageContent: PageContent = js.native
  /**
    *
    * Gets the Paragraph object that contains the Image. Throws if the Image is not a direct child of a Paragraph. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val paragraph: Paragraph = js.native
  /**
    *
    * Gets or sets the width of the Image layout.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var width: scala.Double = js.native
  /**
    *
    * Gets the base64-encoded binary representation of the Image.
    Example: data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIA...
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getBase64Image(): officeDashJsLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.Image` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.Image` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.Image` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Image = js.native
  def load(option: java.lang.String): Image = js.native
  def load(option: js.Array[java.lang.String]): Image = js.native
  def load(option: officeDashJsLib.Anon_Expand): Image = js.native
  def load(option: officeDashJsLib.OneNoteNs.InterfacesNs.ImageLoadOptions): Image = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Image): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: OneNote.Image): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.OneNoteNs.InterfacesNs.ImageUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.OneNoteNs.InterfacesNs.ImageUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.Image object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.ImageData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsLib.OneNoteNs.InterfacesNs.ImageData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Image = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): Image = js.native
}

