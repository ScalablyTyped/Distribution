package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeBorderCollection: RequestContext = js.native
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
           * Returns or sets a double that lightens or darkens a color for Range Borders, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
              A null value indicates that the entire border collections don't have uniform tintAndShade setting.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var tintAndShade: scala.Double = js.native
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
  def getItem_DiagonalDown(index: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DiagonalDown): RangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  @JSName("getItem")
  def getItem_DiagonalUp(index: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DiagonalUp): RangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  @JSName("getItem")
  def getItem_EdgeBottom(index: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeBottom): RangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  @JSName("getItem")
  def getItem_EdgeLeft(index: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeLeft): RangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  @JSName("getItem")
  def getItem_EdgeRight(index: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeRight): RangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  @JSName("getItem")
  def getItem_EdgeTop(index: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeTop): RangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  @JSName("getItem")
  def getItem_InsideHorizontal(index: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.InsideHorizontal): RangeBorder = js.native
  /**
           *
           * Gets a border object using its name.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
           */
  @JSName("getItem")
  def getItem_InsideVertical(index: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.InsideVertical): RangeBorder = js.native
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
    option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.RangeBorderCollectionLoadOptions with officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): RangeBorderCollection = js.native
  def load(option: java.lang.String): RangeBorderCollection = js.native
  def load(option: js.Array[java.lang.String]): RangeBorderCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): RangeBorderCollection = js.native
  /**
          * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
          * Whereas the original `Excel.RangeBorderCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeBorderCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
          */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.RangeBorderCollectionData = js.native
}

