package typings.officeJs.OneNote

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.OneNote.Interfaces.ImageData
import typings.officeJs.OneNote.Interfaces.ImageLoadOptions
import typings.officeJs.OneNote.Interfaces.ImageUpdateData
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an Image. An Image can be a direct child of a PageContent object or a Paragraph object.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait Image
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Image: RequestContext = js.native
  
  /**
    * Gets or sets the description of the Image.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var description: String = js.native
  
  /**
    * Gets the base64-encoded binary representation of the Image.
    Example: data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIA...
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def getBase64Image(): ClientResult[String] = js.native
  
  /**
    * Gets or sets the height of the Image layout.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var height: Double = js.native
  
  /**
    * Gets or sets the hyperlink of the Image.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var hyperlink: String = js.native
  
  /**
    * Gets the ID of the Image object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Image = js.native
  def load(options: ImageLoadOptions): Image = js.native
  def load(propertyNamesAndPaths: Expand): Image = js.native
  def load(propertyNames: String): Image = js.native
  def load(propertyNames: js.Array[String]): Image = js.native
  
  /**
    * Gets the data obtained by OCR (Optical Character Recognition) of this Image, such as OCR text and language.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val ocrData: ImageOcrData = js.native
  
  /**
    * Gets the PageContent object that contains the Image. Throws if the Image is not a direct child of a PageContent. This object defines the position of the Image on the page. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val pageContent: PageContent = js.native
  
  /**
    * Gets the Paragraph object that contains the Image. Throws if the Image is not a direct child of a Paragraph. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val paragraph: Paragraph = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Image): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ImageUpdateData): Unit = js.native
  def set(properties: ImageUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.Image object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.ImageData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ImageData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Image = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Image = js.native
  
  /**
    * Gets or sets the width of the Image layout.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var width: Double = js.native
}
