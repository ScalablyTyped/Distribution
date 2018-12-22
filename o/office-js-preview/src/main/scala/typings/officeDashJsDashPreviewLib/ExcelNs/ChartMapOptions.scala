package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Encapsulates the properties for Map chart.
     *
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */
@JSGlobal("Excel.ChartMapOptions")
@js.native
class ChartMapOptions ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartMapOptions: RequestContext = js.native
  /**
           *
           * Returns or sets series map labels strategy of a region map chart. Read/Write.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var labelStrategy: ChartMapLabelStrategy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BestFit | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShowAll = js.native
  /**
           *
           * Returns or sets series map area of a region map chart. Read/Write.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var level: ChartMapAreaLevel | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DataOnly | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.City | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.County | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.State | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Country | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Continent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.World = js.native
  /**
           *
           * Returns or sets series projection type of a region map chart. Read/Write.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var projectionType: ChartMapProjectionType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mercator | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Miller | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Robinson | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Albers = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartMapOptions` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartMapOptions` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartMapOptions` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): ChartMapOptions = js.native
  def load(option: java.lang.String): ChartMapOptions = js.native
  def load(option: js.Array[java.lang.String]): ChartMapOptions = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Select): ChartMapOptions = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartMapOptions` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartMapOptions` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartMapOptions` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartMapOptionsLoadOptions): ChartMapOptions = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartMapOptions): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ChartMapOptions): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartMapOptionsUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ChartMapOptions): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartMapOptionsUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
          * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
          * Whereas the original Excel.ChartMapOptions object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartMapOptionsData`) that contains shallow copies of any loaded child properties from the original object.
          */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartMapOptionsData = js.native
}

