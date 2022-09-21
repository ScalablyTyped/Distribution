package typings.officeJs.PowerPoint

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.PowerPoint.Interfaces.SlideData
import typings.officeJs.PowerPoint.Interfaces.SlideLoadOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single slide of a presentation.
  *
  * @remarks
  * [Api set: PowerPointApi 1.2]
  */
@js.native
trait Slide
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Slide: RequestContext = js.native
  
  /**
    * Deletes the slide from the presentation. Does nothing if the slide does not exist.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    */
  def delete(): Unit = js.native
  
  /**
    * Gets the unique ID of the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    */
  val id: String = js.native
  
  /**
    * Gets the layout of the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val layout: SlideLayout = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Slide = js.native
  def load(options: SlideLoadOptions): Slide = js.native
  def load(propertyNamesAndPaths: Expand): Slide = js.native
  def load(propertyNames: String): Slide = js.native
  def load(propertyNames: js.Array[String]): Slide = js.native
  
  /**
    * Returns a collection of shapes in the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val shapes: ShapeCollection = js.native
  
  /**
    * Gets the `SlideMaster` object that represents the slide's default content.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val slideMaster: SlideMaster = js.native
  
  /**
    * Returns a collection of tags in the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val tags: TagCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original PowerPoint.Slide object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.SlideData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): SlideData = js.native
}
