package typings
package officeDashJsLib.ExcelNs

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
class Line ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: ArrowheadLength | officeDashJsLib.officeDashJsLibStrings.Short | officeDashJsLib.officeDashJsLibStrings.Medium | officeDashJsLib.officeDashJsLibStrings.Long = js.native
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: ArrowheadStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Triangle | officeDashJsLib.officeDashJsLibStrings.Stealth | officeDashJsLib.officeDashJsLibStrings.Diamond | officeDashJsLib.officeDashJsLibStrings.Oval | officeDashJsLib.officeDashJsLibStrings.Open = js.native
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: ArrowheadWidth | officeDashJsLib.officeDashJsLibStrings.Narrow | officeDashJsLib.officeDashJsLibStrings.Medium | officeDashJsLib.officeDashJsLibStrings.Wide = js.native
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
  val beginConnectedSite: scala.Double = js.native
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: ConnectorType | officeDashJsLib.officeDashJsLibStrings.Straight | officeDashJsLib.officeDashJsLibStrings.Elbow | officeDashJsLib.officeDashJsLibStrings.Curve = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Line: RequestContext = js.native
  /**
    *
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: ArrowheadLength | officeDashJsLib.officeDashJsLibStrings.Short | officeDashJsLib.officeDashJsLibStrings.Medium | officeDashJsLib.officeDashJsLibStrings.Long = js.native
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: ArrowheadStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Triangle | officeDashJsLib.officeDashJsLibStrings.Stealth | officeDashJsLib.officeDashJsLibStrings.Diamond | officeDashJsLib.officeDashJsLibStrings.Oval | officeDashJsLib.officeDashJsLibStrings.Open = js.native
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: ArrowheadWidth | officeDashJsLib.officeDashJsLibStrings.Narrow | officeDashJsLib.officeDashJsLibStrings.Medium | officeDashJsLib.officeDashJsLibStrings.Wide = js.native
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
  val endConnectedSite: scala.Double = js.native
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val id: java.lang.String = js.native
  /**
    *
    * Specifies whether or not the beginning of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val isBeginConnected: scala.Boolean = js.native
  /**
    *
    * Specifies whether or not the end of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val isEndConnected: scala.Boolean = js.native
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
  def connectBeginShape(shape: Shape, connectionSite: scala.Double): scala.Unit = js.native
  /**
    *
    * Attaches the end of the specified connector to a specified shape.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param shape The shape to connect.
    * @param connectionSite The connection site on the shape to which the end of the connector is attached. Must be an integer between 0 (inclusive) and the connection-site count of the specified shape (exclusive).
    */
  def connectEndShape(shape: Shape, connectionSite: scala.Double): scala.Unit = js.native
  /**
    *
    * Detaches the beginning of the specified connector from a shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  def disconnectBeginShape(): scala.Unit = js.native
  /**
    *
    * Detaches the end of the specified connector from a shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  def disconnectEndShape(): scala.Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.Line` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.Line` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Line` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Line = js.native
  def load(option: java.lang.String): Line = js.native
  def load(option: js.Array[java.lang.String]): Line = js.native
  def load(option: officeDashJsLib.Anon_Expand): Line = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.LineLoadOptions): Line = js.native
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
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.LineUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.LineUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Line): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Line object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.LineData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.LineData = js.native
}

