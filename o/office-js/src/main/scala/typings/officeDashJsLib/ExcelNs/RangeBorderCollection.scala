package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents the border objects that make up the range border.
     *
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.RangeBorderCollection")
@js.native
class RangeBorderCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Number of border objects in the collection. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val count: scala.Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[RangeBorder] = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  def getItem(index: BorderIndex): RangeBorder = js.native
  /**
           *
           * Gets a border object using its index.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the object to be retrieved. Zero-indexed.
           */
  def getItemAt(index: scala.Double): RangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  @JSName("getItem")
  def getItem_DiagonalDown(index: officeDashJsLib.officeDashJsLibStrings.DiagonalDown): RangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  @JSName("getItem")
  def getItem_DiagonalUp(index: officeDashJsLib.officeDashJsLibStrings.DiagonalUp): RangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  @JSName("getItem")
  def getItem_EdgeBottom(index: officeDashJsLib.officeDashJsLibStrings.EdgeBottom): RangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  @JSName("getItem")
  def getItem_EdgeLeft(index: officeDashJsLib.officeDashJsLibStrings.EdgeLeft): RangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  @JSName("getItem")
  def getItem_EdgeRight(index: officeDashJsLib.officeDashJsLibStrings.EdgeRight): RangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  @JSName("getItem")
  def getItem_EdgeTop(index: officeDashJsLib.officeDashJsLibStrings.EdgeTop): RangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  @JSName("getItem")
  def getItem_InsideHorizontal(index: officeDashJsLib.officeDashJsLibStrings.InsideHorizontal): RangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  @JSName("getItem")
  def getItem_InsideVertical(index: officeDashJsLib.officeDashJsLibStrings.InsideVertical): RangeBorder = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.RangeBorderCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.RangeBorderCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.RangeBorderCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): RangeBorderCollection = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.RangeBorderCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.RangeBorderCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.RangeBorderCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.RangeBorderCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): RangeBorderCollection = js.native
  def load(option: java.lang.String): RangeBorderCollection = js.native
  def load(option: js.Array[java.lang.String]): RangeBorderCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): RangeBorderCollection = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.RangeBorderCollectionData = js.native
}

