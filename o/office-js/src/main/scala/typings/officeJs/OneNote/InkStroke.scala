package typings.officeJs.OneNote

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OneNote.Interfaces.InkStrokeData
import typings.officeJs.OneNote.Interfaces.InkStrokeLoadOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single stroke of ink.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkStroke
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_InkStroke: RequestContext = js.native
  
  /**
    * Gets the ID of the InkStroke object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val floatingInk: FloatingInk = js.native
  
  /**
    * Gets the ID of the InkStroke object. Read-only.
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
  def load(): InkStroke = js.native
  def load(options: InkStrokeLoadOptions): InkStroke = js.native
  def load(propertyNamesAndPaths: Expand): InkStroke = js.native
  def load(propertyNames: String): InkStroke = js.native
  def load(propertyNames: js.Array[String]): InkStroke = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.InkStroke object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.InkStrokeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): InkStrokeData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): InkStroke = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): InkStroke = js.native
}
