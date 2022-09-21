package typings.officeJsPreview.PowerPoint

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.PowerPoint.Interfaces.SlideLayoutData
import typings.officeJsPreview.PowerPoint.Interfaces.SlideLayoutLoadOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the layout of a slide.
  *
  * @remarks
  * [Api set: PowerPointApi 1.3]
  */
@js.native
trait SlideLayout
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SlideLayout: RequestContext = js.native
  
  /**
    * Gets the unique ID of the slide layout.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SlideLayout = js.native
  def load(options: SlideLayoutLoadOptions): SlideLayout = js.native
  def load(propertyNamesAndPaths: Expand): SlideLayout = js.native
  def load(propertyNames: String): SlideLayout = js.native
  def load(propertyNames: js.Array[String]): SlideLayout = js.native
  
  /**
    * Gets the name of the slide layout.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val name: String = js.native
  
  /**
    * Returns a collection of shapes in the slide layout.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val shapes: ShapeCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original PowerPoint.SlideLayout object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.SlideLayoutData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): SlideLayoutData = js.native
}
