package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents an object containing values and types of a named item.
     *
     * [Api set: ExcelApi 1.7]
     */
@JSGlobal("Excel.NamedItemArrayValues")
@js.native
class NamedItemArrayValues ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Represents the types for each item in the named item array
           *
           * [Api set: ExcelApi 1.7]
           */
  val types: js.Array[js.Array[RangeValueType]] = js.native
  /**
           *
           * Represents the values of each item in the named item array.
           *
           * [Api set: ExcelApi 1.7]
           */
  val values: js.Array[js.Array[_]] = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.NamedItemArrayValues` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.NamedItemArrayValues` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.NamedItemArrayValues` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): NamedItemArrayValues = js.native
  def load(option: java.lang.String): NamedItemArrayValues = js.native
  def load(option: js.Array[java.lang.String]): NamedItemArrayValues = js.native
  def load(option: officeDashJsLib.Anon_Select): NamedItemArrayValues = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.NamedItemArrayValues` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.NamedItemArrayValues` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.NamedItemArrayValues` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.NamedItemArrayValuesLoadOptions): NamedItemArrayValues = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.NamedItemArrayValuesData = js.native
}

