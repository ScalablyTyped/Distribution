package typings.officeDashJs.ExcelNs

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.ExcelNs.InterfacesNs.LineData
import typings.officeDashJs.ExcelNs.InterfacesNs.LineLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.LineUpdateData
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.UpdateOptions
import typings.officeDashJs.officeDashJsStrings.Curve
import typings.officeDashJs.officeDashJsStrings.Diamond
import typings.officeDashJs.officeDashJsStrings.Elbow
import typings.officeDashJs.officeDashJsStrings.Long
import typings.officeDashJs.officeDashJsStrings.Medium
import typings.officeDashJs.officeDashJsStrings.Narrow
import typings.officeDashJs.officeDashJsStrings.None
import typings.officeDashJs.officeDashJsStrings.Open
import typings.officeDashJs.officeDashJsStrings.Oval
import typings.officeDashJs.officeDashJsStrings.Short
import typings.officeDashJs.officeDashJsStrings.Stealth
import typings.officeDashJs.officeDashJsStrings.Straight
import typings.officeDashJs.officeDashJsStrings.Triangle
import typings.officeDashJs.officeDashJsStrings.Wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a line inside a worksheet. To get the corresponding Shape object, use `Line.shape`.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.Line")
@js.native
class Line () extends ClientObject {
  /**
    *
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: ArrowheadLength | Short | Medium | Long = js.native
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open = js.native
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: ArrowheadWidth | Narrow | Medium | Wide = js.native
  /**
    *
    * Represents the shape to which the beginning of the specified line is attached. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val beginConnectedShape: Shape = js.native
  /**
    *
    * Represents the connection site to which the beginning of a connector is connected. Read-only. Returns null when the beginning of the line is not attached to any shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  val beginConnectedSite: Double = js.native
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: ConnectorType | Straight | Elbow | Curve = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Line: RequestContext = js.native
  /**
    *
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: ArrowheadLength | Short | Medium | Long = js.native
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open = js.native
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: ArrowheadWidth | Narrow | Medium | Wide = js.native
  /**
    *
    * Represents the shape to which the end of the specified line is attached. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val endConnectedShape: Shape = js.native
  /**
    *
    * Represents the connection site to which the end of a connector is connected. Read-only. Returns null when the end of the line is not attached to any shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  val endConnectedSite: Double = js.native
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val id: String = js.native
  /**
    *
    * Specifies whether or not the beginning of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val isBeginConnected: Boolean = js.native
  /**
    *
    * Specifies whether or not the end of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val isEndConnected: Boolean = js.native
  /**
    *
    * Returns the Shape object associated with the line. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val shape: Shape = js.native
  /**
    *
    * Attaches the beginning of the specified connector to a specified shape.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param shape The shape to connect.
    * @param connectionSite The connection site on the shape to which the beginning of the connector is attached. Must be an integer between 0 (inclusive) and the connection-site count of the specified shape (exclusive).
    */
  def connectBeginShape(shape: Shape, connectionSite: Double): Unit = js.native
  /**
    *
    * Attaches the end of the specified connector to a specified shape.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param shape The shape to connect.
    * @param connectionSite The connection site on the shape to which the end of the connector is attached. Must be an integer between 0 (inclusive) and the connection-site count of the specified shape (exclusive).
    */
  def connectEndShape(shape: Shape, connectionSite: Double): Unit = js.native
  /**
    *
    * Detaches the beginning of the specified connector from a shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  def disconnectBeginShape(): Unit = js.native
  /**
    *
    * Detaches the end of the specified connector from a shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  def disconnectEndShape(): Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Line = js.native
  def load(options: LineLoadOptions): Line = js.native
  def load(propertyNamesAndPaths: Anon_Expand): Line = js.native
  def load(propertyNames: String): Line = js.native
  def load(propertyNames: js.Array[String]): Line = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.Line): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: LineUpdateData): Unit = js.native
  def set(properties: LineUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Line): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Line object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.LineData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): LineData = js.native
}

