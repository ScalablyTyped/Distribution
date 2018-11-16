package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents a collection of all the columns that are part of the table.
     *
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.TableColumnCollection")
@js.native
class TableColumnCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Returns the number of columns in the table. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val count: scala.Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[TableColumn] = js.native
  /**
           *
           * Adds a new column to the table.
           *
           * [Api set: ExcelApi 1.1 requires an index smaller than the total column count; 1.4 allows index to be optional (null or -1) and will append a column at the end; 1.4 allows name parameter at creation time.]
           *
           * @param index Optional. Specifies the relative position of the new column. If null or -1, the addition happens at the end. Columns with a higher index will be shifted to the side. Zero-indexed.
           * @param values Optional. A 2-dimensional array of unformatted values of the table column.
           * @param name Optional. Specifies the name of the new column. If null, the default name will be used.
           */
  def add(): TableColumn = js.native
  /**
           *
           * Adds a new column to the table.
           *
           * [Api set: ExcelApi 1.1 requires an index smaller than the total column count; 1.4 allows index to be optional (null or -1) and will append a column at the end; 1.4 allows name parameter at creation time.]
           *
           * @param index Optional. Specifies the relative position of the new column. If null or -1, the addition happens at the end. Columns with a higher index will be shifted to the side. Zero-indexed.
           * @param values Optional. A 2-dimensional array of unformatted values of the table column.
           * @param name Optional. Specifies the name of the new column. If null, the default name will be used.
           */
  def add(index: scala.Double): TableColumn = js.native
  /**
           *
           * Adds a new column to the table.
           *
           * [Api set: ExcelApi 1.1 requires an index smaller than the total column count; 1.4 allows index to be optional (null or -1) and will append a column at the end; 1.4 allows name parameter at creation time.]
           *
           * @param index Optional. Specifies the relative position of the new column. If null or -1, the addition happens at the end. Columns with a higher index will be shifted to the side. Zero-indexed.
           * @param values Optional. A 2-dimensional array of unformatted values of the table column.
           * @param name Optional. Specifies the name of the new column. If null, the default name will be used.
           */
  def add(index: scala.Double, values: java.lang.String): TableColumn = js.native
  /**
           *
           * Adds a new column to the table.
           *
           * [Api set: ExcelApi 1.1 requires an index smaller than the total column count; 1.4 allows index to be optional (null or -1) and will append a column at the end; 1.4 allows name parameter at creation time.]
           *
           * @param index Optional. Specifies the relative position of the new column. If null or -1, the addition happens at the end. Columns with a higher index will be shifted to the side. Zero-indexed.
           * @param values Optional. A 2-dimensional array of unformatted values of the table column.
           * @param name Optional. Specifies the name of the new column. If null, the default name will be used.
           */
  def add(index: scala.Double, values: java.lang.String, name: java.lang.String): TableColumn = js.native
  /**
           *
           * Adds a new column to the table.
           *
           * [Api set: ExcelApi 1.1 requires an index smaller than the total column count; 1.4 allows index to be optional (null or -1) and will append a column at the end; 1.4 allows name parameter at creation time.]
           *
           * @param index Optional. Specifies the relative position of the new column. If null or -1, the addition happens at the end. Columns with a higher index will be shifted to the side. Zero-indexed.
           * @param values Optional. A 2-dimensional array of unformatted values of the table column.
           * @param name Optional. Specifies the name of the new column. If null, the default name will be used.
           */
  def add(index: scala.Double, values: js.Array[js.Array[scala.Boolean | java.lang.String | scala.Double]]): TableColumn = js.native
  /**
           *
           * Adds a new column to the table.
           *
           * [Api set: ExcelApi 1.1 requires an index smaller than the total column count; 1.4 allows index to be optional (null or -1) and will append a column at the end; 1.4 allows name parameter at creation time.]
           *
           * @param index Optional. Specifies the relative position of the new column. If null or -1, the addition happens at the end. Columns with a higher index will be shifted to the side. Zero-indexed.
           * @param values Optional. A 2-dimensional array of unformatted values of the table column.
           * @param name Optional. Specifies the name of the new column. If null, the default name will be used.
           */
  def add(
    index: scala.Double,
    values: js.Array[js.Array[scala.Boolean | java.lang.String | scala.Double]],
    name: java.lang.String
  ): TableColumn = js.native
  /**
           *
           * Adds a new column to the table.
           *
           * [Api set: ExcelApi 1.1 requires an index smaller than the total column count; 1.4 allows index to be optional (null or -1) and will append a column at the end; 1.4 allows name parameter at creation time.]
           *
           * @param index Optional. Specifies the relative position of the new column. If null or -1, the addition happens at the end. Columns with a higher index will be shifted to the side. Zero-indexed.
           * @param values Optional. A 2-dimensional array of unformatted values of the table column.
           * @param name Optional. Specifies the name of the new column. If null, the default name will be used.
           */
  def add(index: scala.Double, values: scala.Boolean): TableColumn = js.native
  /**
           *
           * Adds a new column to the table.
           *
           * [Api set: ExcelApi 1.1 requires an index smaller than the total column count; 1.4 allows index to be optional (null or -1) and will append a column at the end; 1.4 allows name parameter at creation time.]
           *
           * @param index Optional. Specifies the relative position of the new column. If null or -1, the addition happens at the end. Columns with a higher index will be shifted to the side. Zero-indexed.
           * @param values Optional. A 2-dimensional array of unformatted values of the table column.
           * @param name Optional. Specifies the name of the new column. If null, the default name will be used.
           */
  def add(index: scala.Double, values: scala.Boolean, name: java.lang.String): TableColumn = js.native
  /**
           *
           * Adds a new column to the table.
           *
           * [Api set: ExcelApi 1.1 requires an index smaller than the total column count; 1.4 allows index to be optional (null or -1) and will append a column at the end; 1.4 allows name parameter at creation time.]
           *
           * @param index Optional. Specifies the relative position of the new column. If null or -1, the addition happens at the end. Columns with a higher index will be shifted to the side. Zero-indexed.
           * @param values Optional. A 2-dimensional array of unformatted values of the table column.
           * @param name Optional. Specifies the name of the new column. If null, the default name will be used.
           */
  def add(index: scala.Double, values: scala.Double): TableColumn = js.native
  /**
           *
           * Adds a new column to the table.
           *
           * [Api set: ExcelApi 1.1 requires an index smaller than the total column count; 1.4 allows index to be optional (null or -1) and will append a column at the end; 1.4 allows name parameter at creation time.]
           *
           * @param index Optional. Specifies the relative position of the new column. If null or -1, the addition happens at the end. Columns with a higher index will be shifted to the side. Zero-indexed.
           * @param values Optional. A 2-dimensional array of unformatted values of the table column.
           * @param name Optional. Specifies the name of the new column. If null, the default name will be used.
           */
  def add(index: scala.Double, values: scala.Double, name: java.lang.String): TableColumn = js.native
  /**
           *
           * Gets the number of columns in the table.
           *
           * [Api set: ExcelApi 1.4]
           */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Gets a column object by Name or ID.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param key Column Name or ID.
           */
  def getItem(key: java.lang.String): TableColumn = js.native
  /**
           *
           * Gets a column object by Name or ID.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param key Column Name or ID.
           */
  def getItem(key: scala.Double): TableColumn = js.native
  /**
           *
           * Gets a column based on its position in the collection.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the object to be retrieved. Zero-indexed.
           */
  def getItemAt(index: scala.Double): TableColumn = js.native
  /**
           *
           * Gets a column object by Name or ID. If the column does not exist, will return a null object.
           *
           * [Api set: ExcelApi 1.4]
           *
           * @param key Column Name or ID.
           */
  def getItemOrNullObject(key: java.lang.String): TableColumn = js.native
  /**
           *
           * Gets a column object by Name or ID. If the column does not exist, will return a null object.
           *
           * [Api set: ExcelApi 1.4]
           *
           * @param key Column Name or ID.
           */
  def getItemOrNullObject(key: scala.Double): TableColumn = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.TableColumnCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.TableColumnCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.TableColumnCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): TableColumnCollection = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.TableColumnCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.TableColumnCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.TableColumnCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.TableColumnCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): TableColumnCollection = js.native
  def load(option: java.lang.String): TableColumnCollection = js.native
  def load(option: js.Array[java.lang.String]): TableColumnCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): TableColumnCollection = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.TableColumnCollectionData = js.native
}

