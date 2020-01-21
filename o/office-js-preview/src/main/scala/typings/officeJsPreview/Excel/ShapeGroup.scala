package typings.officeJsPreview.Excel

import typings.officeJsPreview.AnonExpand
import typings.officeJsPreview.Excel.Interfaces.ShapeGroupData
import typings.officeJsPreview.Excel.Interfaces.ShapeGroupLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
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
class ShapeGroup () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeGroup: RequestContext = js.native
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val id: String = js.native
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
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeGroup = js.native
  def load(options: ShapeGroupLoadOptions): ShapeGroup = js.native
  def load(propertyNamesAndPaths: AnonExpand): ShapeGroup = js.native
  def load(propertyNames: String): ShapeGroup = js.native
  def load(propertyNames: js.Array[String]): ShapeGroup = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ShapeGroup object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ShapeGroupData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ShapeGroupData = js.native
  /**
    *
    * Ungroups any grouped shapes in the specified shape group.
    *
    * [Api set: ExcelApi 1.9]
    */
  def ungroup(): Unit = js.native
}

