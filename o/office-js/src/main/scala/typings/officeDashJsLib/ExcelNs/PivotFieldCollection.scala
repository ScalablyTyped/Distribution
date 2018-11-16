package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents a collection of all the PivotTables that are part of the workbook or worksheet.
     *
     * [Api set: ExcelApi 1.8]
     */
@JSGlobal("Excel.PivotFieldCollection")
@js.native
class PivotFieldCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** Gets the loaded child items in this collection. */
  val items: js.Array[PivotField] = js.native
  /**
           *
           * Gets the number of pivot hierarchies in the collection.
           *
           * [Api set: ExcelApi 1.8]
           */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Gets a PivotHierarchy by its name or id.
           *
           * [Api set: ExcelApi 1.8]
           *
           * @param name Name of the PivotTable to be retrieved.
           */
  def getItem(name: java.lang.String): PivotField = js.native
  /**
           *
           * Gets a PivotHierarchy by name. If the PivotHierarchy does not exist, will return a null object.
           *
           * [Api set: ExcelApi 1.8]
           *
           * @param name Name of the PivotHierarchy to be retrieved.
           */
  def getItemOrNullObject(name: java.lang.String): PivotField = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.PivotFieldCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.PivotFieldCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.PivotFieldCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): PivotFieldCollection = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.PivotFieldCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.PivotFieldCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.PivotFieldCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.PivotFieldCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): PivotFieldCollection = js.native
  def load(option: java.lang.String): PivotFieldCollection = js.native
  def load(option: js.Array[java.lang.String]): PivotFieldCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): PivotFieldCollection = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.PivotFieldCollectionData = js.native
}

