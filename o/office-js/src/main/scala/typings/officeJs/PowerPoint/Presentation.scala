package typings.officeJs.PowerPoint

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.PowerPoint.Interfaces.PresentationData
import typings.officeJs.PowerPoint.Interfaces.PresentationLoadOptions
import typings.officeJs.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: PowerPointApi 1.0]
  */
@js.native
trait Presentation extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Presentation: RequestContext = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Presentation = js.native
  def load(options: PresentationLoadOptions): Presentation = js.native
  def load(propertyNamesAndPaths: Expand): Presentation = js.native
  def load(propertyNames: String): Presentation = js.native
  def load(propertyNames: js.Array[String]): Presentation = js.native
  
  val title: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original PowerPoint.Presentation object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.PresentationData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PresentationData = js.native
}
