package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents the background of a range object.
     *
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.RangeFill")
@js.native
class RangeFill ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
           *
           * [Api set: ExcelApi 1.1]
           */
  var color: java.lang.String = js.native
  /**
           *
           * Resets the range background.
           *
           * [Api set: ExcelApi 1.1]
           */
  def clear(): scala.Unit = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.RangeFill` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.RangeFill` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.RangeFill` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): RangeFill = js.native
  def load(option: java.lang.String): RangeFill = js.native
  def load(option: js.Array[java.lang.String]): RangeFill = js.native
  def load(option: officeDashJsLib.Anon_Select): RangeFill = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.RangeFill` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.RangeFill` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.RangeFill` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.RangeFillLoadOptions): RangeFill = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.RangeFill): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.RangeFillUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.RangeFill): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.RangeFillUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeFill): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.RangeFillData = js.native
}

