package typings.officeJsPreview.PowerPoint

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.PowerPoint.Interfaces.SlideData
import typings.officeJsPreview.PowerPoint.Interfaces.SlideLoadOptions
import typings.officeJsPreview.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a single slide of a presentation.
  *
  * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait Slide extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Slide: RequestContext = js.native
  
  /**
    * Deletes the slide from the presentation. Does nothing if the slide does not exist.
    *
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def delete(): Unit = js.native
  
  /**
    *
    * Gets the unique ID of the slide.
    *
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val id: String = js.native
  
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
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original PowerPoint.Slide object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.SlideData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): SlideData = js.native
}
