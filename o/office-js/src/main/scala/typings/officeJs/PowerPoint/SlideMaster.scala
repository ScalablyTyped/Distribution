package typings.officeJs.PowerPoint

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.PowerPoint.Interfaces.SlideMasterData
import typings.officeJs.PowerPoint.Interfaces.SlideMasterLoadOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the Slide Master of a slide.
  *
  * @remarks
  * [Api set: PowerPointApi 1.3]
  */
@js.native
trait SlideMaster
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SlideMaster: RequestContext = js.native
  
  /**
    * Gets the unique ID of the Slide Master.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val id: String = js.native
  
  /**
    * Gets the collection of layouts provided by the Slide Master for slides.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val layouts: SlideLayoutCollection = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SlideMaster = js.native
  def load(options: SlideMasterLoadOptions): SlideMaster = js.native
  def load(propertyNamesAndPaths: Expand): SlideMaster = js.native
  def load(propertyNames: String): SlideMaster = js.native
  def load(propertyNames: js.Array[String]): SlideMaster = js.native
  
  /**
    * Gets the unique name of the Slide Master.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val name: String = js.native
  
  /**
    * Returns a collection of shapes in the Slide Master.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val shapes: ShapeCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original PowerPoint.SlideMaster object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.SlideMasterData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): SlideMasterData = js.native
}
