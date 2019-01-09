package typings
package officeDashJsDashPreviewLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Shape class.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.Shape")
@js.native
class Shape ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Returns the Comments Collection. Read-only.
    *
    * [Api set:  1.1]
    */
  val comments: CommentCollection = js.native
  /**
    *
    * Returns the Hyperlinks collection for a Shape object. Read-only.
    *
    * [Api set:  1.1]
    */
  val hyperlinks: HyperlinkCollection = js.native
  /**
    *
    * Shape's identifier. Read-only.
    *
    * [Api set:  1.1]
    */
  val id: scala.Double = js.native
  /**
    *
    * Shape's name. Read-only.
    *
    * [Api set:  1.1]
    */
  val name: java.lang.String = js.native
  /**
    *
    * Returns true, if shape is selected. User can set true to select the shape explicitly.
    *
    * [Api set:  1.1]
    */
  var select: scala.Boolean = js.native
  /**
    *
    * Returns the Shape's Data Section. Read-only.
    *
    * [Api set:  1.1]
    */
  val shapeDataItems: ShapeDataItemCollection = js.native
  /**
    *
    * Gets SubShape Collection. Read-only.
    *
    * [Api set:  1.1]
    */
  val subShapes: ShapeCollection = js.native
  /**
    *
    * Shape's text. Read-only.
    *
    * [Api set:  1.1]
    */
  val text: java.lang.String = js.native
  /**
    *
    * Returns the view of the shape. Read-only.
    *
    * [Api set:  1.1]
    */
  val view: ShapeView = js.native
  /**
    *
    * Returns the BoundingBox object that specifies bounding box of the shape.
    *
    * [Api set:  1.1]
    */
  def getBounds(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[BoundingBox] = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.Shape` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.Shape` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.Shape` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Shape = js.native
  def load(option: java.lang.String): Shape = js.native
  def load(option: js.Array[java.lang.String]): Shape = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): Shape = js.native
  def load(option: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.ShapeLoadOptions): Shape = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Visio.Shape): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.ShapeUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.ShapeUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Shape): scala.Unit = js.native
  def toJSON(): officeDashJsDashPreviewLib.VisioNs.InterfacesNs.ShapeData = js.native
}

