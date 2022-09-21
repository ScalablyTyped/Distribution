package typings.officeJsPreview.OneNote

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OneNote.Interfaces.PointData
import typings.officeJsPreview.OneNote.Interfaces.PointLoadOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single point of ink stroke
  *
  * @remarks
  * [Api set: OneNoteApi 1.9]
  */
@js.native
trait Point
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Point: RequestContext = js.native
  
  /**
    * Gets the ID of the Point object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.9]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Point = js.native
  def load(options: PointLoadOptions): Point = js.native
  def load(propertyNamesAndPaths: Expand): Point = js.native
  def load(propertyNames: String): Point = js.native
  def load(propertyNames: js.Array[String]): Point = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.Point object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.PointData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PointData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Point = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Point = js.native
  
  val x: Double = js.native
  
  val y: Double = js.native
}
