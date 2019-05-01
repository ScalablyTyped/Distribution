package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a shape group inside a worksheet. To get the corresponding Shape object, use `ShapeGroup.shape`.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeGroup")
@js.native
class ShapeGroup ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeGroup: RequestContext = js.native
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val id: java.lang.String = js.native
  /**
    *
    * Returns the Shape object associated with the group. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val shape: Shape = js.native
  /**
    *
    * Returns the collection of Shape objects. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val shapes: GroupShapeCollection = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ShapeGroup` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ShapeGroup` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ShapeGroup` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeGroup = js.native
  def load(option: java.lang.String): ShapeGroup = js.native
  def load(option: js.Array[java.lang.String]): ShapeGroup = js.native
  def load(option: officeDashJsLib.Anon_Expand): ShapeGroup = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.ShapeGroupLoadOptions): ShapeGroup = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ShapeGroup object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ShapeGroupData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ShapeGroupData = js.native
  /**
    *
    * Ungroups any grouped shapes in the specified shape group.
    *
    * [Api set: ExcelApi 1.9]
    */
  def ungroup(): scala.Unit = js.native
}

