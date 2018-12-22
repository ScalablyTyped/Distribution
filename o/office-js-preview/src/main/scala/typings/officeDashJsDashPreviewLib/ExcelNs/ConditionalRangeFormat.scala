package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * A format object encapsulating the conditional formats range's font, fill, borders, and other properties.
     *
     * [Api set: ExcelApi 1.6]
     */
@JSGlobal("Excel.ConditionalRangeFormat")
@js.native
class ConditionalRangeFormat ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Collection of border objects that apply to the overall conditional format range. Read-only.
           *
           * [Api set: ExcelApi 1.6]
           */
  val borders: ConditionalRangeBorderCollection = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ConditionalRangeFormat: RequestContext = js.native
  /**
           *
           * Returns the fill object defined on the overall conditional format range. Read-only.
           *
           * [Api set: ExcelApi 1.6]
           */
  val fill: ConditionalRangeFill = js.native
  /**
           *
           * Returns the font object defined on the overall conditional format range. Read-only.
           *
           * [Api set: ExcelApi 1.6]
           */
  val font: ConditionalRangeFont = js.native
  /**
           *
           * Represents Excel's number format code for the given range. Cleared if null is passed in.
           *
           * [Api set: ExcelApi 1.6]
           */
  var numberFormat: js.Any = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ConditionalRangeFormat` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ConditionalRangeFormat` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ConditionalRangeFormat` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): ConditionalRangeFormat = js.native
  def load(option: java.lang.String): ConditionalRangeFormat = js.native
  def load(option: js.Array[java.lang.String]): ConditionalRangeFormat = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Select): ConditionalRangeFormat = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ConditionalRangeFormat` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ConditionalRangeFormat` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ConditionalRangeFormat` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ConditionalRangeFormatLoadOptions): ConditionalRangeFormat = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ConditionalRangeFormat): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ConditionalRangeFormat): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ConditionalRangeFormatUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ConditionalRangeFormat): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ConditionalRangeFormatUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
          * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
          * Whereas the original Excel.ConditionalRangeFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ConditionalRangeFormatData`) that contains shallow copies of any loaded child properties from the original object.
          */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ConditionalRangeFormatData = js.native
}

