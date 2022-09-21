package typings.officeJsPreview.OneNote

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.OneNote.Interfaces.InkAnalysisLineData
import typings.officeJsPreview.OneNote.Interfaces.InkAnalysisLineLoadOptions
import typings.officeJsPreview.OneNote.Interfaces.InkAnalysisLineUpdateData
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents ink analysis data for an identified text line formed by ink strokes.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkAnalysisLine
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_InkAnalysisLine: RequestContext = js.native
  
  /**
    * Gets the ID of the InkAnalysisLine object. Read-only.
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
  def load(): InkAnalysisLine = js.native
  def load(options: InkAnalysisLineLoadOptions): InkAnalysisLine = js.native
  def load(propertyNamesAndPaths: Expand): InkAnalysisLine = js.native
  def load(propertyNames: String): InkAnalysisLine = js.native
  def load(propertyNames: js.Array[String]): InkAnalysisLine = js.native
  
  /**
    * Reference to the parent InkAnalysisParagraph. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val paragraph: InkAnalysisParagraph = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: InkAnalysisLine): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: InkAnalysisLineUpdateData): Unit = js.native
  def set(properties: InkAnalysisLineUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.InkAnalysisLine object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.InkAnalysisLineData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): InkAnalysisLineData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): InkAnalysisLine = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): InkAnalysisLine = js.native
  
  /**
    * Gets the ink analysis words in this ink analysis line. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val words: InkAnalysisWordCollection = js.native
}
