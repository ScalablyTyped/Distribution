package typings
package officeDashJsLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents a OneNote notebook. Notebooks contain section groups and sections.
     *
     * [Api set: OneNoteApi 1.1]
     */
@JSGlobal("OneNote.Notebook")
@js.native
class Notebook ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * The url of the site that this notebook is located. Read only
           *
           * [Api set: OneNoteApi 1.1]
           */
  val baseUrl: java.lang.String = js.native
  /**
           *
           * The client url of the notebook. Read only
           *
           * [Api set: OneNoteApi 1.1]
           */
  val clientUrl: java.lang.String = js.native
  /**
           *
           * Gets the ID of the notebook. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val id: java.lang.String = js.native
  /**
           *
           * True if the Notebook is not created by the user (i.e. 'Misplaced Sections'). Read only
           *
           * [Api set: OneNoteApi 1.2]
           */
  val isVirtual: scala.Boolean = js.native
  /**
           *
           * Gets the name of the notebook. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val name: java.lang.String = js.native
  /**
           *
           * The section groups in the notebook. Read only
           *
           * [Api set: OneNoteApi 1.1]
           */
  val sectionGroups: SectionGroupCollection = js.native
  /**
           *
           * The the sections of the notebook. Read only
           *
           * [Api set: OneNoteApi 1.1]
           */
  val sections: SectionCollection = js.native
  /**
           *
           * Adds a new section to the end of the notebook.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param name The name of the new section.
           */
  def addSection(name: java.lang.String): Section = js.native
  /**
           *
           * Adds a new section group to the end of the notebook.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param name The name of the new section.
           */
  def addSectionGroup(name: java.lang.String): SectionGroup = js.native
  /**
           *
           * Gets the REST API ID.
           *
           * [Api set: OneNoteApi 1.1]
           */
  def getRestApiId(): officeDashJsLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): OneNote.Notebook` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): OneNote.Notebook` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.Notebook` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): Notebook = js.native
  def load(option: java.lang.String): Notebook = js.native
  def load(option: js.Array[java.lang.String]): Notebook = js.native
  def load(option: officeDashJsLib.Anon_Select): Notebook = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): OneNote.Notebook` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): OneNote.Notebook` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.Notebook` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.OneNoteNs.InterfacesNs.NotebookLoadOptions): Notebook = js.native
  def toJSON(): officeDashJsLib.OneNoteNs.InterfacesNs.NotebookData = js.native
  /**
           * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
           */
  def track(): Notebook = js.native
  /**
           * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
           */
  def untrack(): Notebook = js.native
}

