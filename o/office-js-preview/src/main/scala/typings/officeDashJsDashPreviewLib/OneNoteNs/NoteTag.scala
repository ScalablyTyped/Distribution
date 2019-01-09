package typings
package officeDashJsDashPreviewLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A container for the NoteTag in a paragraph.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.NoteTag")
@js.native
class NoteTag ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Gets the Id of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val id: java.lang.String = js.native
  /**
    *
    * Gets the status of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val status: NoteTagStatus | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Normal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Completed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Disabled | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OutlookTask | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TaskNotSyncedYet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TaskRemoved = js.native
  /**
    *
    * Gets the type of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val `type`: NoteTagType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ToDo | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Important | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Question | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Contact | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Address | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PhoneNumber | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Website | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Idea | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Critical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ToDoPriority1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ToDoPriority2 = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.NoteTag` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.NoteTag` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.NoteTag` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NoteTag = js.native
  def load(option: java.lang.String): NoteTag = js.native
  def load(option: js.Array[java.lang.String]): NoteTag = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): NoteTag = js.native
  def load(option: officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs.NoteTagLoadOptions): NoteTag = js.native
  def toJSON(): officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs.NoteTagData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): NoteTag = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): NoteTag = js.native
}

