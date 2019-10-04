package typings.officeDashJs.ExcelNs

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.ExcelNs.InterfacesNs.ImageData
import typings.officeDashJs.ExcelNs.InterfacesNs.ImageLoadOptions
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.officeDashJsStrings.BMP
import typings.officeDashJs.officeDashJsStrings.GIF
import typings.officeDashJs.officeDashJsStrings.JPEG
import typings.officeDashJs.officeDashJsStrings.PNG
import typings.officeDashJs.officeDashJsStrings.SVG
import typings.officeDashJs.officeDashJsStrings.UNKNOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an image in the worksheet. To get the corresponding Shape object, use Image.shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.Image")
@js.native
class Image () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Image: RequestContext = js.native
  /**
    *
    * Returns the format of the image. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val format: PictureFormat | UNKNOWN | BMP | JPEG | GIF | PNG | SVG = js.native
  /**
    *
    * Represents the shape identifier for the image object. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val id: String = js.native
  /**
    *
    * Returns the Shape object associated with the image. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val shape: Shape = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Image = js.native
  def load(options: ImageLoadOptions): Image = js.native
  def load(propertyNamesAndPaths: Anon_Expand): Image = js.native
  def load(propertyNames: String): Image = js.native
  def load(propertyNames: js.Array[String]): Image = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Image object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ImageData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ImageData = js.native
}

