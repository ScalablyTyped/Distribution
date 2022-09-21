package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.PivotFieldData
import typings.officeJs.Excel.Interfaces.PivotFieldLoadOptions
import typings.officeJs.Excel.Interfaces.PivotFieldUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Ascending
import typings.officeJs.officeJsStrings.Date
import typings.officeJs.officeJsStrings.Descending
import typings.officeJs.officeJsStrings.Label
import typings.officeJs.officeJsStrings.Manual
import typings.officeJs.officeJsStrings.Unknown_
import typings.officeJs.officeJsStrings.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the Excel PivotField.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait PivotField
  extends StObject
     with ClientObject {
  
  /**
    * Sets one or more of the field's current PivotFilters and applies them to the field.
    If the provided filters are invalid or cannot be applied, an exception is thrown.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    *
    * @param filter A configured specific PivotFilter, or a PivotFilters interface containing multiple configured filters.
    */
  def applyFilter(filter: PivotFilters): Unit = js.native
  
  /**
    * Clears all criteria from all of the field's filters. This removes any active filtering on the field.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  def clearAllFilters(): Unit = js.native
  
  /**
    * Clears all existing criteria from the field's filter of the given type (if one is currently applied).
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    *
    * @param filterType The type of filter on the field of which to clear all criteria.
    */
  def clearFilter(filterType: Unknown_ | Value | Manual | Label | Date): Unit = js.native
  /**
    * Clears all existing criteria from the field's filter of the given type (if one is currently applied).
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    *
    * @param filterType The type of filter on the field of which to clear all criteria.
    */
  def clearFilter(filterType: PivotFilterType): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotField: RequestContext = js.native
  
  /**
    * Gets all filters currently applied on the field.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    * @returns A PivotFilters interface with all active filters.
    */
  def getFilters(): ClientResult[PivotFilters] = js.native
  
  /**
    * ID of the PivotField.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val id: String = js.native
  
  /**
    * Checks if there are any applied filters on the field.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    *
    * @param filterType The filter type to check. If no type is provided, this method will check if any filter is applied.
    * @returns True if the field has a filter of type `filterType` applied. If `filterType` is not specified, `true` is returned if the field has any applied filters.
    */
  def isFiltered(): ClientResult[Boolean] = js.native
  def isFiltered(filterType: Unknown_ | Value | Manual | Label | Date): ClientResult[Boolean] = js.native
  def isFiltered(filterType: PivotFilterType): ClientResult[Boolean] = js.native
  
  /**
    * Returns the PivotItems associated with the PivotField.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val items: PivotItemCollection = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotField = js.native
  def load(options: PivotFieldLoadOptions): PivotField = js.native
  def load(propertyNamesAndPaths: Expand): PivotField = js.native
  def load(propertyNames: String): PivotField = js.native
  def load(propertyNames: js.Array[String]): PivotField = js.native
  
  /**
    * Name of the PivotField.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var name: String = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PivotFieldUpdateData): Unit = js.native
  def set(properties: PivotFieldUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PivotField): Unit = js.native
  
  /**
    * Determines whether to show all items of the PivotField.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showAllItems: Boolean = js.native
  
  /**
    * Sorts the PivotField. If a DataPivotHierarchy is specified, then sort will be applied based on it, if not sort will be based on the PivotField itself.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    *
    * @param sortBy Specifies if the sorting is done in ascending or descending order.
    */
  def sortByLabels(sortBy: SortBy): Unit = js.native
  
  /**
    * Sorts the PivotField by specified values in a given scope. The scope defines which specific values will be used to sort when
    there are multiple values from the same DataPivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param sortBy Specifies if the sorting is done in ascending or descending order.
    * @param valuesHierarchy Specifies the values hierarchy on the data axis to be used for sorting.
    * @param pivotItemScope The items that should be used for the scope of the sorting. These will be the
    items that make up the row or column that you want to sort on. If a string is used instead of a PivotItem,
    the string represents the ID of the PivotItem. If there are no items other than data hierarchy on the axis
    you want to sort on, this can be empty.
    */
  def sortByValues(sortBy: Ascending | Descending, valuesHierarchy: DataPivotHierarchy): Unit = js.native
  def sortByValues(
    sortBy: Ascending | Descending,
    valuesHierarchy: DataPivotHierarchy,
    pivotItemScope: js.Array[PivotItem | String]
  ): Unit = js.native
  /**
    * Sorts the PivotField by specified values in a given scope. The scope defines which specific values will be used to sort when
    there are multiple values from the same DataPivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param sortBy Specifies if the sorting is done in ascending or descending order.
    * @param valuesHierarchy Specifies the values hierarchy on the data axis to be used for sorting.
    * @param pivotItemScope The items that should be used for the scope of the sorting. These will be the
    items that make up the row or column that you want to sort on. If a string is used instead of a PivotItem,
    the string represents the ID of the PivotItem. If there are no items other than data hierarchy on the axis
    you want to sort on, this can be empty.
    */
  def sortByValues(sortBy: SortBy, valuesHierarchy: DataPivotHierarchy): Unit = js.native
  def sortByValues(sortBy: SortBy, valuesHierarchy: DataPivotHierarchy, pivotItemScope: js.Array[PivotItem | String]): Unit = js.native
  
  /**
    * Subtotals of the PivotField.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var subtotals: Subtotals = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PivotField object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotFieldData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PivotFieldData = js.native
}
