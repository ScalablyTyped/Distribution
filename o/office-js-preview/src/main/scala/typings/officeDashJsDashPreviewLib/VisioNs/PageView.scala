package typings
package officeDashJsDashPreviewLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the PageView class.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.PageView")
@js.native
class PageView ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Get and set Page's Zoom level. The value can be between 10 and 400 and denotes the percentage of zoom.
    *
    * [Api set:  1.1]
    */
  var zoom: scala.Double = js.native
  /**
    *
    * Pans the Visio drawing to place the specified shape in the center of the view.
    *
    * [Api set:  1.1]
    *
    * @param ShapeId ShapeId to be seen in the center.
    */
  def centerViewportOnShape(ShapeId: scala.Double): scala.Unit = js.native
  /**
    *
    * Fit Page to current window.
    *
    * [Api set:  1.1]
    */
  def fitToWindow(): scala.Unit = js.native
  /**
    *
    * Returns the position object that specifies the position of the page in the view.
    *
    * [Api set:  1.1]
    */
  def getPosition(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[Position] = js.native
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
  def isShapeInViewport(Shape: Shape): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Boolean] = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.PageView` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.PageView` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.PageView` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageView = js.native
  def load(option: java.lang.String): PageView = js.native
  def load(option: js.Array[java.lang.String]): PageView = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): PageView = js.native
  def load(option: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.PageViewLoadOptions): PageView = js.native
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
  def set(properties: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.PageViewUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.PageViewUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PageView): scala.Unit = js.native
  /**
    *
    * Sets the position of the page in the view.
    *
    * [Api set:  1.1]
    *
    * @param Position Position object that specifies the new position of the page in the view.
    */
  def setPosition(Position: Position): scala.Unit = js.native
  def toJSON(): officeDashJsDashPreviewLib.VisioNs.InterfacesNs.PageViewData = js.native
}

