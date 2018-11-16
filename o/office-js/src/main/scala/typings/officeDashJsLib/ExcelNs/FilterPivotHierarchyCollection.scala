package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents a collection of FilterPivotHierarchy items associated with the PivotTable.
     *
     * [Api set: ExcelApi 1.8]
     */
@JSGlobal("Excel.FilterPivotHierarchyCollection")
@js.native
class FilterPivotHierarchyCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** Gets the loaded child items in this collection. */
  val items: js.Array[FilterPivotHierarchy] = js.native
  /**
           *
           * Adds the PivotHierarchy to the current axis. If the hierarchy is present elsewhere on the row, column,
              or filter axis, it will be removed from that location.
           *
           * [Api set: ExcelApi 1.8]
           */
  def add(pivotHierarchy: PivotHierarchy): FilterPivotHierarchy = js.native
  /**
           *
           * Gets the number of pivot hierarchies in the collection.
           *
           * [Api set: ExcelApi 1.8]
           */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Gets a FilterPivotHierarchy by its name or id.
           *
           * [Api set: ExcelApi 1.8]
           *
           * @param name Name of the PivotTable to be retrieved.
           */
  def getItem(name: java.lang.String): FilterPivotHierarchy = js.native
  /**
           *
           * Gets a FilterPivotHierarchy by name. If the FilterPivotHierarchy does not exist, will return a null object.
           *
           * [Api set: ExcelApi 1.8]
           *
           * @param name Name of the FilterPivotHierarchy to be retrieved.
           */
  def getItemOrNullObject(name: java.lang.String): FilterPivotHierarchy = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.FilterPivotHierarchyCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.FilterPivotHierarchyCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.FilterPivotHierarchyCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): FilterPivotHierarchyCollection = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.FilterPivotHierarchyCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.FilterPivotHierarchyCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.FilterPivotHierarchyCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.FilterPivotHierarchyCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): FilterPivotHierarchyCollection = js.native
  def load(option: java.lang.String): FilterPivotHierarchyCollection = js.native
  def load(option: js.Array[java.lang.String]): FilterPivotHierarchyCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): FilterPivotHierarchyCollection = js.native
  /**
           *
           * Removes the PivotHierarchy from the current axis.
           *
           * [Api set: ExcelApi 1.8]
           */
  def remove(filterPivotHierarchy: FilterPivotHierarchy): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.FilterPivotHierarchyCollectionData = js.native
}

