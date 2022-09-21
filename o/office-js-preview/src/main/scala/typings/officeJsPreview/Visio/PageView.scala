package typings.officeJsPreview.Visio

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.Visio.Interfaces.PageViewData
import typings.officeJsPreview.Visio.Interfaces.PageViewLoadOptions
import typings.officeJsPreview.Visio.Interfaces.PageViewUpdateData
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the PageView class.
  *
  * [Api set:  1.1]
  */
@js.native
trait PageView
  extends StObject
     with ClientObject {
  
  /**
    *
    * Pans the Visio drawing to place the specified shape in the center of the view.
    *
    * [Api set:  1.1]
    *
    * @param ShapeId ShapeId to be seen in the center.
    */
  def centerViewportOnShape(ShapeId: Double): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PageView: RequestContext = js.native
  
  /**
    *
    * Fit Page to current window.
    *
    * [Api set:  1.1]
    */
  def fitToWindow(): Unit = js.native
  
  /**
    *
    * Returns the position object that specifies the position of the page in the view.
    *
    * [Api set:  1.1]
    */
  def getPosition(): ClientResult[Position] = js.native
  
  /**
    *
    * Represents the Selection in the page.
    *
    * [Api set:  1.1]
    */
  def getSelection(): Selection = js.native
  
  /**
    *
    * To check if the shape is in view of the page or not.
    *
    * [Api set:  1.1]
    *
    * @param Shape Shape to be checked.
    */
  def isShapeInViewport(Shape: Shape): ClientResult[Boolean] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageView = js.native
  def load(options: PageViewLoadOptions): PageView = js.native
  def load(propertyNamesAndPaths: Expand): PageView = js.native
  def load(propertyNames: String): PageView = js.native
  def load(propertyNames: js.Array[String]): PageView = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Visio.PageView): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PageViewUpdateData): Unit = js.native
  def set(properties: PageViewUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PageView): Unit = js.native
  
  /**
    * Set mock data
    */
  def setMockData(data: PageViewData): Unit = js.native
  
  /**
    *
    * Sets the position of the page in the view.
    *
    * [Api set:  1.1]
    *
    * @param Position Position object that specifies the new position of the page in the view.
    */
  def setPosition(Position: Position): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Visio.PageView object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.PageViewData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PageViewData = js.native
  
  /**
    *
    * Get and set Page's Zoom level. The value can be between 10 and 400 and denotes the percentage of zoom.
    *
    * [Api set:  1.1]
    */
  var zoom: Double = js.native
}
