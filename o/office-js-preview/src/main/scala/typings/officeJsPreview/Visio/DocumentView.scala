package typings.officeJsPreview.Visio

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.Visio.Interfaces.DocumentViewData
import typings.officeJsPreview.Visio.Interfaces.DocumentViewLoadOptions
import typings.officeJsPreview.Visio.Interfaces.DocumentViewUpdateData
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the DocumentView class.
  *
  * [Api set:  1.1]
  */
@js.native
trait DocumentView
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DocumentView: RequestContext = js.native
  
  /**
    *
    * Disable Hyperlinks.
    *
    * [Api set:  1.1]
    */
  var disableHyperlinks: Boolean = js.native
  
  /**
    *
    * Disable Pan.
    *
    * [Api set:  1.1]
    */
  var disablePan: Boolean = js.native
  
  /**
    *
    * Disable PanZoomWindow.
    *
    * [Api set:  1.1]
    */
  var disablePanZoomWindow: Boolean = js.native
  
  /**
    *
    * Disable Zoom.
    *
    * [Api set:  1.1]
    */
  var disableZoom: Boolean = js.native
  
  /**
    *
    * Hide Diagram Boundary.
    *
    * [Api set:  1.1]
    */
  var hideDiagramBoundary: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DocumentView = js.native
  def load(options: DocumentViewLoadOptions): DocumentView = js.native
  def load(propertyNamesAndPaths: Expand): DocumentView = js.native
  def load(propertyNames: String): DocumentView = js.native
  def load(propertyNames: js.Array[String]): DocumentView = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: DocumentView): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Visio.DocumentView): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: DocumentViewUpdateData): Unit = js.native
  def set(properties: DocumentViewUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Set mock data
    */
  def setMockData(data: DocumentViewData): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Visio.DocumentView object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.DocumentViewData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): DocumentViewData = js.native
}
