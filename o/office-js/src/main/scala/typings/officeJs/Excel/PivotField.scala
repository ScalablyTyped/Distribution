package typings.officeJs.Excel

import typings.officeJs.AnonExpand
import typings.officeJs.Excel.Interfaces.PivotFieldData
import typings.officeJs.Excel.Interfaces.PivotFieldLoadOptions
import typings.officeJs.Excel.Interfaces.PivotFieldUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.officeJsStrings.Ascending
import typings.officeJs.officeJsStrings.Descending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Excel PivotField.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.PivotField")
@js.native
class PivotField () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotField: RequestContext = js.native
  /**
    *
    * Id of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  val id: String = js.native
  /**
    *
    * Returns the PivotFields associated with the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  val items: PivotItemCollection = js.native
  /**
    *
    * Name of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: String = js.native
  /**
    *
    * Determines whether to show all items of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAllItems: Boolean = js.native
  /**
    *
    * Subtotals of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotals: Subtotals = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotField = js.native
  def load(options: PivotFieldLoadOptions): PivotField = js.native
  def load(propertyNamesAndPaths: AnonExpand): PivotField = js.native
  def load(propertyNames: String): PivotField = js.native
  def load(propertyNames: js.Array[String]): PivotField = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.PivotField): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PivotFieldUpdateData): Unit = js.native
  def set(properties: PivotFieldUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PivotField): Unit = js.native
  /**
    *
    * Sorts the PivotField. If a DataPivotHierarchy is specified, then sort will be applied based on it, if not sort will be based on the PivotField itself.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param sortBy Represents whether the sorting is done in an ascending or descending order.
    */
  def sortByLabels(sortBy: SortBy): Unit = js.native
  /**
    *
    * Sorts the PivotField by specified values in a given scope. The scope defines which specific values will be used to sort when
    there are multiple values from the same DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param sortBy Represents whether the sorting is done in an ascending or descending order.
    * @param valuesHierarchy Specifies the values hierarchy on the data axis to be used for sorting.
    * @param pivotItemScope The items that should be used for the scope of the sorting. These will be the
    items that make up the row or column that you want to sort on. If a string is used instead of a PivotItem,
    the string represents the ID of the PivotItem. If there are no items other than data hierarchy on the axis
    you want to sort on, this can be empty.
    */
  def sortByValues(sortBy: SortBy, valuesHierarchy: DataPivotHierarchy): Unit = js.native
  def sortByValues(sortBy: SortBy, valuesHierarchy: DataPivotHierarchy, pivotItemScope: js.Array[PivotItem | String]): Unit = js.native
  /**
    *
    * Sorts the PivotField by specified values in a given scope. The scope defines which specific values will be used to sort when
    there are multiple values from the same DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param sortBy Represents whether the sorting is done in an ascending or descending order.
    * @param valuesHierarchy Specifies the values hierarchy on the data axis to be used for sorting.
    * @param pivotItemScope The items that should be used for the scope of the sorting. These will be the
    items that make up the row or column that you want to sort on. If a string is used instead of a PivotItem,
    the string represents the ID of the PivotItem. If there are no items other than data hierarchy on the axis
    you want to sort on, this can be empty.
    */
  @JSName("sortByValues")
  def sortByValues_Ascending(sortBy: Ascending, valuesHierarchy: DataPivotHierarchy): Unit = js.native
  @JSName("sortByValues")
  def sortByValues_Ascending(
    sortBy: Ascending,
    valuesHierarchy: DataPivotHierarchy,
    pivotItemScope: js.Array[PivotItem | String]
  ): Unit = js.native
  @JSName("sortByValues")
  def sortByValues_Descending(sortBy: Descending, valuesHierarchy: DataPivotHierarchy): Unit = js.native
  @JSName("sortByValues")
  def sortByValues_Descending(
    sortBy: Descending,
    valuesHierarchy: DataPivotHierarchy,
    pivotItemScope: js.Array[PivotItem | String]
  ): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PivotField object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotFieldData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PivotFieldData = js.native
}

