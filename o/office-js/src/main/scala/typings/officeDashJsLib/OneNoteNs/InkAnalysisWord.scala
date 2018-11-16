package typings
package officeDashJsLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents ink analysis data for an identified word formed by ink strokes.
     *
     * [Api set: OneNoteApi 1.1]
     */
@JSGlobal("OneNote.InkAnalysisWord")
@js.native
class InkAnalysisWord ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Gets the ID of the InkAnalysisWord object. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val id: java.lang.String = js.native
  /**
           *
           * The id of the recognized language in this inkAnalysisWord. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val languageId: java.lang.String = js.native
  /**
           *
           * Reference to the parent InkAnalysisLine. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val line: InkAnalysisLine = js.native
  /**
           *
           * Weak references to the ink strokes that were recognized as part of this ink analysis word. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val strokePointers: js.Array[InkStrokePointer] = js.native
  /**
           *
           * The words that were recognized in this ink word, in order of likelihood. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val wordAlternates: js.Array[java.lang.String] = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): OneNote.InkAnalysisWord` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): OneNote.InkAnalysisWord` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.InkAnalysisWord` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): InkAnalysisWord = js.native
  def load(option: java.lang.String): InkAnalysisWord = js.native
  def load(option: js.Array[java.lang.String]): InkAnalysisWord = js.native
  def load(option: officeDashJsLib.Anon_Select): InkAnalysisWord = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): OneNote.InkAnalysisWord` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): OneNote.InkAnalysisWord` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.InkAnalysisWord` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.OneNoteNs.InterfacesNs.InkAnalysisWordLoadOptions): InkAnalysisWord = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: InkAnalysisWord): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: OneNote.InkAnalysisWord): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.OneNoteNs.InterfacesNs.InkAnalysisWordUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: OneNote.InkAnalysisWord): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.OneNoteNs.InterfacesNs.InkAnalysisWordUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  def toJSON(): officeDashJsLib.OneNoteNs.InterfacesNs.InkAnalysisWordData = js.native
  /**
           * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
           */
  def track(): InkAnalysisWord = js.native
  /**
           * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
           */
  def untrack(): InkAnalysisWord = js.native
}

