package typings.officeDashJs.ExcelNs

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.ExcelNs.InterfacesNs.RowColumnPivotHierarchyData
import typings.officeDashJs.ExcelNs.InterfacesNs.RowColumnPivotHierarchyLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.RowColumnPivotHierarchyUpdateData
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Excel RowColumnPivotHierarchy.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.RowColumnPivotHierarchy")
@js.native
class RowColumnPivotHierarchy () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RowColumnPivotHierarchy: RequestContext = js.native
  /**
    *
    * Returns the PivotFields associated with the RowColumnPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  val fields: PivotFieldCollection = js.native
  /**
    *
    * Id of the RowColumnPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  val id: String = js.native
  /**
    *
    * Name of the RowColumnPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: String = js.native
  /**
    *
    * Position of the RowColumnPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: Double = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RowColumnPivotHierarchy = js.native
  def load(options: RowColumnPivotHierarchyLoadOptions): RowColumnPivotHierarchy = js.native
  def load(propertyNamesAndPaths: Anon_Expand): RowColumnPivotHierarchy = js.native
  def load(propertyNames: String): RowColumnPivotHierarchy = js.native
  def load(propertyNames: js.Array[String]): RowColumnPivotHierarchy = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.RowColumnPivotHierarchy): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: RowColumnPivotHierarchyUpdateData): Unit = js.native
  def set(properties: RowColumnPivotHierarchyUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RowColumnPivotHierarchy): Unit = js.native
  /**
    *
    * Reset the RowColumnPivotHierarchy back to its default values.
    *
    * [Api set: ExcelApi 1.8]
    */
  def setToDefault(): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RowColumnPivotHierarchy object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RowColumnPivotHierarchyData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RowColumnPivotHierarchyData = js.native
}

