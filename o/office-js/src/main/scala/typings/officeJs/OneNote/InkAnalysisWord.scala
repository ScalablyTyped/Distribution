package typings.officeJs.OneNote

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.OneNote.Interfaces.InkAnalysisWordData
import typings.officeJs.OneNote.Interfaces.InkAnalysisWordLoadOptions
import typings.officeJs.OneNote.Interfaces.InkAnalysisWordUpdateData
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents ink analysis data for an identified word formed by ink strokes.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkAnalysisWord
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_InkAnalysisWord: RequestContext = js.native
  
  /**
    * Gets the ID of the InkAnalysisWord object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
  /**
    * The id of the recognized language in this inkAnalysisWord. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val languageId: String = js.native
  
  /**
    * Reference to the parent InkAnalysisLine. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val line: InkAnalysisLine = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): InkAnalysisWord = js.native
  def load(options: InkAnalysisWordLoadOptions): InkAnalysisWord = js.native
  def load(propertyNamesAndPaths: Expand): InkAnalysisWord = js.native
  def load(propertyNames: String): InkAnalysisWord = js.native
  def load(propertyNames: js.Array[String]): InkAnalysisWord = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: InkAnalysisWord): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: InkAnalysisWordUpdateData): Unit = js.native
  def set(properties: InkAnalysisWordUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Weak references to the ink strokes that were recognized as part of this ink analysis word. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val strokePointers: js.Array[InkStrokePointer] = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.InkAnalysisWord object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.InkAnalysisWordData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): InkAnalysisWordData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): InkAnalysisWord = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): InkAnalysisWord = js.native
  
  /**
    * The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val wordAlternates: js.Array[String] = js.native
}
