package typings.officeDashJsDashPreview.OneNote

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.OfficeExtension.ClientObject
import typings.officeDashJsDashPreview.OneNote.Interfaces.InkStrokeData
import typings.officeDashJsDashPreview.OneNote.Interfaces.InkStrokeLoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a single stroke of ink.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.InkStroke")
@js.native
class InkStroke () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_InkStroke: RequestContext = js.native
  /**
    *
    * Gets the ID of the InkStroke object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val floatingInk: FloatingInk = js.native
  /**
    *
    * Gets the ID of the InkStroke object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.InkStroke` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.InkStroke` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.InkStroke` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): InkStroke = js.native
  def load(option: String): InkStroke = js.native
  def load(option: js.Array[String]): InkStroke = js.native
  def load(option: Anon_Expand): InkStroke = js.native
  def load(option: InkStrokeLoadOptions): InkStroke = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.InkStroke object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.InkStrokeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): InkStrokeData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): InkStroke = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): InkStroke = js.native
}

