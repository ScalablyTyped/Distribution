package typings.officeJs.OneNote

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.OneNote.Interfaces.InkAnalysisParagraphData
import typings.officeJs.OneNote.Interfaces.InkAnalysisParagraphLoadOptions
import typings.officeJs.OneNote.Interfaces.InkAnalysisParagraphUpdateData
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents ink analysis data for an identified paragraph formed by ink strokes.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkAnalysisParagraph
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_InkAnalysisParagraph: RequestContext = js.native
  
  /**
    *
    * Gets the ID of the InkAnalysisParagraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
  /**
    *
    * Reference to the parent InkAnalysisPage. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val inkAnalysis: InkAnalysis = js.native
  
  /**
    *
    * Gets the ink analysis lines in this ink analysis paragraph. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val lines: InkAnalysisLineCollection = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.InkAnalysisParagraph` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.InkAnalysisParagraph` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.InkAnalysisParagraph` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): InkAnalysisParagraph = js.native
  def load(option: String): InkAnalysisParagraph = js.native
  def load(option: js.Array[String]): InkAnalysisParagraph = js.native
  def load(option: InkAnalysisParagraphLoadOptions): InkAnalysisParagraph = js.native
  def load(option: Expand): InkAnalysisParagraph = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: InkAnalysisParagraph): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: OneNote.InkAnalysisParagraph): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: InkAnalysisParagraphUpdateData): Unit = js.native
  def set(properties: InkAnalysisParagraphUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.InkAnalysisParagraph object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.InkAnalysisParagraphData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): InkAnalysisParagraphData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): InkAnalysisParagraph = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): InkAnalysisParagraph = js.native
}
