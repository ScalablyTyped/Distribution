package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents the border of an object.
     *
     * [Api set: ExcelApi 1.6]
     */
@JSGlobal("Excel.ConditionalRangeBorder")
@js.native
class ConditionalRangeBorder ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
           *
           * [Api set: ExcelApi 1.6]
           */
  var color: java.lang.String = js.native
  /**
           *
           * Constant value that indicates the specific side of the border. See Excel.ConditionalRangeBorderIndex for details. Read-only.
           *
           * [Api set: ExcelApi 1.6]
           */
  val sideIndex: ConditionalRangeBorderIndex | officeDashJsLib.officeDashJsLibStrings.EdgeTop | officeDashJsLib.officeDashJsLibStrings.EdgeBottom | officeDashJsLib.officeDashJsLibStrings.EdgeLeft | officeDashJsLib.officeDashJsLibStrings.EdgeRight = js.native
  /**
           *
           * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
           *
           * [Api set: ExcelApi 1.6]
           */
  var style: ConditionalRangeBorderLineStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Continuous | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.DashDot | officeDashJsLib.officeDashJsLibStrings.DashDotDot | officeDashJsLib.officeDashJsLibStrings.Dot = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ConditionalRangeBorder` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ConditionalRangeBorder` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ConditionalRangeBorder` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): ConditionalRangeBorder = js.native
  def load(option: java.lang.String): ConditionalRangeBorder = js.native
  def load(option: js.Array[java.lang.String]): ConditionalRangeBorder = js.native
  def load(option: officeDashJsLib.Anon_Select): ConditionalRangeBorder = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ConditionalRangeBorder` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ConditionalRangeBorder` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ConditionalRangeBorder` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.ConditionalRangeBorderLoadOptions): ConditionalRangeBorder = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ConditionalRangeBorder): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ConditionalRangeBorder): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.ConditionalRangeBorderUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ConditionalRangeBorder): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.ConditionalRangeBorderUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ConditionalRangeBorderData = js.native
}

