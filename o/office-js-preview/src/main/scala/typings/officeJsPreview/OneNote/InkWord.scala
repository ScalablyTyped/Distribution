package typings.officeJsPreview.OneNote

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OneNote.Interfaces.InkWordData
import typings.officeJsPreview.OneNote.Interfaces.InkWordLoadOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * A container for the ink in a word in a paragraph.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkWord
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_InkWord: RequestContext = js.native
  
  /**
    *
    * Gets the ID of the InkWord object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
  /**
    *
    * The id of the recognized language in this ink word. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val languageId: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.InkWord` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.InkWord` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.InkWord` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): InkWord = js.native
  def load(option: String): InkWord = js.native
  def load(option: js.Array[String]): InkWord = js.native
  def load(option: InkWordLoadOptions): InkWord = js.native
  def load(option: Expand): InkWord = js.native
  
  /**
    *
    * The parent paragraph containing the ink word. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val paragraph: Paragraph = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.InkWord object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.InkWordData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): InkWordData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): InkWord = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): InkWord = js.native
  
  /**
    *
    * The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val wordAlternates: js.Array[String] = js.native
}
