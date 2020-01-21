package typings.officeJs.Excel

import typings.officeJs.AnonExpand
import typings.officeJs.Excel.Interfaces.TableStyleData
import typings.officeJs.Excel.Interfaces.TableStyleLoadOptions
import typings.officeJs.Excel.Interfaces.TableStyleUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a TableStyle, which defines the style elements by region of the Table.
  *
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.TableStyle")
@js.native
class TableStyle () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableStyle: RequestContext = js.native
  /**
    *
    * Gets the name of the TableStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: String = js.native
  /**
    *
    * Specifies whether this TableStyle object is read-only. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  val readOnly: Boolean = js.native
  /**
    *
    * Deletes the TableStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  def delete(): Unit = js.native
  /**
    *
    * Creates a duplicate of this TableStyle with copies of all the style elements.
    *
    * [Api set: ExcelApi 1.10]
    * @returns The new TableStyle object that has been duplicated from this TableStyle.
    */
  def duplicate(): TableStyle = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableStyle = js.native
  def load(options: TableStyleLoadOptions): TableStyle = js.native
  def load(propertyNamesAndPaths: AnonExpand): TableStyle = js.native
  def load(propertyNames: String): TableStyle = js.native
  def load(propertyNames: js.Array[String]): TableStyle = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.TableStyle): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TableStyleUpdateData): Unit = js.native
  def set(properties: TableStyleUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TableStyle): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TableStyle object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableStyleData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableStyleData = js.native
}

