package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents the legendEntry in legendEntryCollection.
     *
     * [Api set: ExcelApi 1.7]
     */
@JSGlobal("Excel.ChartLegendEntry")
@js.native
class ChartLegendEntry ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Represents the height of the legendEntry on the chart Legend.
           *
           * [Api set: ExcelApi 1.8]
           */
  val height: scala.Double = js.native
  /**
           *
           * Represents the index of the LegendEntry in the Chart Legend.
           *
           * [Api set: ExcelApi 1.8]
           */
  val index: scala.Double = js.native
  /**
           *
           * Represents the left of a chart legendEntry.
           *
           * [Api set: ExcelApi 1.8]
           */
  val left: scala.Double = js.native
  /**
           *
           * Represents the top of a chart legendEntry.
           *
           * [Api set: ExcelApi 1.8]
           */
  val top: scala.Double = js.native
  /**
           *
           * Represents the visible of a chart legend entry.
           *
           * [Api set: ExcelApi 1.7]
           */
  var visible: scala.Boolean = js.native
  /**
           *
           * Represents the width of the legendEntry on the chart Legend.
           *
           * [Api set: ExcelApi 1.8]
           */
  val width: scala.Double = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartLegendEntry` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartLegendEntry` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartLegendEntry` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): ChartLegendEntry = js.native
  def load(option: java.lang.String): ChartLegendEntry = js.native
  def load(option: js.Array[java.lang.String]): ChartLegendEntry = js.native
  def load(option: officeDashJsLib.Anon_Select): ChartLegendEntry = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartLegendEntry` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartLegendEntry` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartLegendEntry` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.ChartLegendEntryLoadOptions): ChartLegendEntry = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartLegendEntry): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ChartLegendEntry): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartLegendEntryUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ChartLegendEntry): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartLegendEntryUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ChartLegendEntryData = js.native
}

