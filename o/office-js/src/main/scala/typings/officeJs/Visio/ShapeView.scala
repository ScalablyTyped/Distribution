package typings.officeJs.Visio

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Visio.Interfaces.ShapeViewData
import typings.officeJs.Visio.Interfaces.ShapeViewLoadOptions
import typings.officeJs.Visio.Interfaces.ShapeViewUpdateData
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Bottom
import typings.officeJs.officeJsStrings.Center
import typings.officeJs.officeJsStrings.Html
import typings.officeJs.officeJsStrings.Image
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.Middle
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.Text
import typings.officeJs.officeJsStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the ShapeView class.
  *
  * [Api set:  1.1]
  */
@js.native
trait ShapeView
  extends StObject
     with ClientObject {
  
  /**
    *
    * Adds an overlay on top of the shape.
    *
    * [Api set:  1.1]
    *
    * @param OverlayType An Overlay Type. Can be 'Text', 'Image' or 'Html'.
    * @param Content Content of Overlay.
    * @param OverlayHorizontalAlignment Horizontal Alignment of Overlay. Can be 'Left', 'Center', or 'Right'.
    * @param OverlayVerticalAlignment Vertical Alignment of Overlay. Can be 'Top', 'Middle', 'Bottom'.
    * @param Width Overlay Width.
    * @param Height Overlay Height.
    */
  def addOverlay(
    OverlayType: Text | Image | Html,
    Content: String,
    OverlayHorizontalAlignment: Left | Center | Right,
    OverlayVerticalAlignment: Top | Middle | Bottom,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  /**
    *
    * Adds an overlay on top of the shape.
    *
    * [Api set:  1.1]
    *
    * @param OverlayType An Overlay Type. Can be 'Text', 'Image' or 'Html'.
    * @param Content Content of Overlay.
    * @param OverlayHorizontalAlignment Horizontal Alignment of Overlay. Can be 'Left', 'Center', or 'Right'.
    * @param OverlayVerticalAlignment Vertical Alignment of Overlay. Can be 'Top', 'Middle', 'Bottom'.
    * @param Width Overlay Width.
    * @param Height Overlay Height.
    */
  def addOverlay(
    OverlayType: OverlayType,
    Content: String,
    OverlayHorizontalAlignment: OverlayHorizontalAlignment,
    OverlayVerticalAlignment: OverlayVerticalAlignment,
    Width: Double,
    Height: Double
  ): ClientResult[Double] = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeView: RequestContext = js.native
  
  /**
    *
    * Represents the highlight around the shape.
    *
    * [Api set:  1.1]
    */
  var highlight: Highlight = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeView = js.native
  def load(options: ShapeViewLoadOptions): ShapeView = js.native
  def load(propertyNamesAndPaths: Expand): ShapeView = js.native
  def load(propertyNames: String): ShapeView = js.native
  def load(propertyNames: js.Array[String]): ShapeView = js.native
  
  /**
    *
    * Removes particular overlay or all overlays on the Shape.
    *
    * [Api set:  1.1]
    *
    * @param OverlayId An Overlay Id. Removes the specific overlay id from the shape.
    */
  def removeOverlay(OverlayId: Double): Unit = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Visio.ShapeView): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ShapeViewUpdateData): Unit = js.native
  def set(properties: ShapeViewUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ShapeView): Unit = js.native
  
  /**
    * Set mock data
    */
  def setMockData(data: ShapeViewData): Unit = js.native
  
  /**
    *
    * Shows particular overlay on the Shape.
    *
    * [Api set:  1.1]
    *
    * @param overlayId overlay id in context
    * @param show to show or hide
    */
  def showOverlay(overlayId: Double, show: Boolean): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Visio.ShapeView object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.ShapeViewData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ShapeViewData = js.native
}
