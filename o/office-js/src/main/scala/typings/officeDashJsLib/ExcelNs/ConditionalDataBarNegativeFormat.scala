package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents a conditional format DataBar Format for the negative side of the data bar.
     *
     * [Api set: ExcelApi 1.6]
     */
@JSGlobal("Excel.ConditionalDataBarNegativeFormat")
@js.native
class ConditionalDataBarNegativeFormat ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
              "Empty String" if no border is present or set.
           *
           * [Api set: ExcelApi 1.6]
           */
  var borderColor: java.lang.String = js.native
  /**
           *
           * HTML color code representing the fill color, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
           *
           * [Api set: ExcelApi 1.6]
           */
  var fillColor: java.lang.String = js.native
  /**
           *
           * Boolean representation of whether or not the negative DataBar has the same border color as the positive DataBar.
           *
           * [Api set: ExcelApi 1.6]
           */
  var matchPositiveBorderColor: scala.Boolean = js.native
  /**
           *
           * Boolean representation of whether or not the negative DataBar has the same fill color as the positive DataBar.
           *
           * [Api set: ExcelApi 1.6]
           */
  var matchPositiveFillColor: scala.Boolean = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ConditionalDataBarNegativeFormat` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ConditionalDataBarNegativeFormat` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ConditionalDataBarNegativeFormat` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): ConditionalDataBarNegativeFormat = js.native
  def load(option: java.lang.String): ConditionalDataBarNegativeFormat = js.native
  def load(option: js.Array[java.lang.String]): ConditionalDataBarNegativeFormat = js.native
  def load(option: officeDashJsLib.Anon_Select): ConditionalDataBarNegativeFormat = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ConditionalDataBarNegativeFormat` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ConditionalDataBarNegativeFormat` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ConditionalDataBarNegativeFormat` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.ConditionalDataBarNegativeFormatLoadOptions): ConditionalDataBarNegativeFormat = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ConditionalDataBarNegativeFormat): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ConditionalDataBarNegativeFormat): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.ConditionalDataBarNegativeFormatUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ConditionalDataBarNegativeFormat): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.ConditionalDataBarNegativeFormatUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ConditionalDataBarNegativeFormatData = js.native
}

