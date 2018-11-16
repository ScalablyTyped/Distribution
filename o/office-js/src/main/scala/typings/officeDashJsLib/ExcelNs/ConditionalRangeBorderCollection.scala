package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents the border objects that make up range border.
     *
     * [Api set: ExcelApi 1.6]
     */
@JSGlobal("Excel.ConditionalRangeBorderCollection")
@js.native
class ConditionalRangeBorderCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Gets the bottom border. Read-only.
           *
           * [Api set: ExcelApi 1.6]
           */
  val bottom: ConditionalRangeBorder = js.native
  /**
           *
           * Number of border objects in the collection. Read-only.
           *
           * [Api set: ExcelApi 1.6]
           */
  val count: scala.Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ConditionalRangeBorder] = js.native
  /**
           *
           * Gets the left border. Read-only.
           *
           * [Api set: ExcelApi 1.6]
           */
  val left: ConditionalRangeBorder = js.native
  /**
           *
           * Gets the right border. Read-only.
           *
           * [Api set: ExcelApi 1.6]
           */
  val right: ConditionalRangeBorder = js.native
  /**
           *
           * Gets the top border. Read-only.
           *
           * [Api set: ExcelApi 1.6]
           */
  val top: ConditionalRangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.6]
           *
           * @param index Index value of the border object to be retrieved. See Excel.ConditionalRangeBorderIndex for details.
           */
  def getItem(index: ConditionalRangeBorderIndex): ConditionalRangeBorder = js.native
  /**
           *
           * Gets a border object using its index.
           *
           * [Api set: ExcelApi 1.6]
           *
           * @param index Index value of the object to be retrieved. Zero-indexed.
           */
  def getItemAt(index: scala.Double): ConditionalRangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.6]
           *
           * @param index Index value of the border object to be retrieved. See Excel.ConditionalRangeBorderIndex for details.
           */
  @JSName("getItem")
  def getItem_EdgeBottom(index: officeDashJsLib.officeDashJsLibStrings.EdgeBottom): ConditionalRangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.6]
           *
           * @param index Index value of the border object to be retrieved. See Excel.ConditionalRangeBorderIndex for details.
           */
  @JSName("getItem")
  def getItem_EdgeLeft(index: officeDashJsLib.officeDashJsLibStrings.EdgeLeft): ConditionalRangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.6]
           *
           * @param index Index value of the border object to be retrieved. See Excel.ConditionalRangeBorderIndex for details.
           */
  @JSName("getItem")
  def getItem_EdgeRight(index: officeDashJsLib.officeDashJsLibStrings.EdgeRight): ConditionalRangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.6]
           *
           * @param index Index value of the border object to be retrieved. See Excel.ConditionalRangeBorderIndex for details.
           */
  @JSName("getItem")
  def getItem_EdgeTop(index: officeDashJsLib.officeDashJsLibStrings.EdgeTop): ConditionalRangeBorder = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ConditionalRangeBorderCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ConditionalRangeBorderCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ConditionalRangeBorderCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): ConditionalRangeBorderCollection = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ConditionalRangeBorderCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ConditionalRangeBorderCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ConditionalRangeBorderCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.ConditionalRangeBorderCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): ConditionalRangeBorderCollection = js.native
  def load(option: java.lang.String): ConditionalRangeBorderCollection = js.native
  def load(option: js.Array[java.lang.String]): ConditionalRangeBorderCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): ConditionalRangeBorderCollection = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ConditionalRangeBorderCollectionData = js.native
}

