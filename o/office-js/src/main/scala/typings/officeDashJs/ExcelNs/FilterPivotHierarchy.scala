package typings.officeDashJs.ExcelNs

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.ExcelNs.InterfacesNs.FilterPivotHierarchyData
import typings.officeDashJs.ExcelNs.InterfacesNs.FilterPivotHierarchyLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.FilterPivotHierarchyUpdateData
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Excel FilterPivotHierarchy.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.FilterPivotHierarchy")
@js.native
class FilterPivotHierarchy () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_FilterPivotHierarchy: RequestContext = js.native
  /**
    *
    * Determines whether to allow multiple filter items.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableMultipleFilterItems: Boolean = js.native
  /**
    *
    * Returns the PivotFields associated with the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  val fields: PivotFieldCollection = js.native
  /**
    *
    * Id of the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  val id: String = js.native
  /**
    *
    * Name of the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: String = js.native
  /**
    *
    * Position of the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: Double = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): FilterPivotHierarchy = js.native
  def load(options: FilterPivotHierarchyLoadOptions): FilterPivotHierarchy = js.native
  def load(propertyNamesAndPaths: Anon_Expand): FilterPivotHierarchy = js.native
  def load(propertyNames: String): FilterPivotHierarchy = js.native
  def load(propertyNames: js.Array[String]): FilterPivotHierarchy = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: FilterPivotHierarchy): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.FilterPivotHierarchy): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: FilterPivotHierarchyUpdateData): Unit = js.native
  def set(properties: FilterPivotHierarchyUpdateData, options: UpdateOptions): Unit = js.native
  /**
    *
    * Reset the FilterPivotHierarchy back to its default values.
    *
    * [Api set: ExcelApi 1.8]
    */
  def setToDefault(): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.FilterPivotHierarchy object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.FilterPivotHierarchyData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): FilterPivotHierarchyData = js.native
}

