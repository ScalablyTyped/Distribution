package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an image in the worksheet. To get the corresponding Shape object, use Image.shape.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.Image")
@js.native
class Image ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Image: RequestContext = js.native
  /**
    *
    * Returns the format of the image. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val format: PictureFormat | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.UNKNOWN | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BMP | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.JPEG | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GIF | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PNG | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SVG = js.native
  /**
    *
    * Represents the shape identifier for the image object. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val id: java.lang.String = js.native
  /**
    *
    * Returns the Shape object associated with the image. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val shape: Shape = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.Image` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.Image` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Image` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Image = js.native
  def load(option: java.lang.String): Image = js.native
  def load(option: js.Array[java.lang.String]): Image = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): Image = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ImageLoadOptions): Image = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Image object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ImageData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ImageData = js.native
}

