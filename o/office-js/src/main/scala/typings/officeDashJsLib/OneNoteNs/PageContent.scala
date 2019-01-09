package typings
package officeDashJsLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a region on a page that contains top-level content types such as Outline or Image. A PageContent object can be assigned an XY position.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.PageContent")
@js.native
class PageContent ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Gets the ID of the PageContent object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val id: java.lang.String = js.native
  /**
    *
    * Gets the Image in the PageContent object. Throws an exception if PageContentType is not Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val image: Image = js.native
  /**
    *
    * Gets the ink in the PageContent object. Throws an exception if PageContentType is not Ink.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val ink: FloatingInk = js.native
  /**
    *
    * Gets or sets the left (X-axis) position of the PageContent object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var left: scala.Double = js.native
  /**
    *
    * Gets the Outline in the PageContent object. Throws an exception if PageContentType is not Outline.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val outline: Outline = js.native
  /**
    *
    * Gets the page that contains the PageContent object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val parentPage: Page = js.native
  /**
    *
    * Gets or sets the top (Y-axis) position of the PageContent object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var top: scala.Double = js.native
  /**
    *
    * Gets the type of the PageContent object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val `type`: PageContentType | officeDashJsLib.officeDashJsLibStrings.Outline | officeDashJsLib.officeDashJsLibStrings.Image | officeDashJsLib.officeDashJsLibStrings.Ink | officeDashJsLib.officeDashJsLibStrings.Other = js.native
  /**
    *
    * Deletes the PageContent object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def delete(): scala.Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.PageContent` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.PageContent` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.PageContent` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageContent = js.native
  def load(option: java.lang.String): PageContent = js.native
  def load(option: js.Array[java.lang.String]): PageContent = js.native
  def load(option: officeDashJsLib.Anon_Expand): PageContent = js.native
  def load(option: officeDashJsLib.OneNoteNs.InterfacesNs.PageContentLoadOptions): PageContent = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: OneNote.PageContent): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.OneNoteNs.InterfacesNs.PageContentUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.OneNoteNs.InterfacesNs.PageContentUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PageContent): scala.Unit = js.native
  def toJSON(): officeDashJsLib.OneNoteNs.InterfacesNs.PageContentData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): PageContent = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): PageContent = js.native
}

