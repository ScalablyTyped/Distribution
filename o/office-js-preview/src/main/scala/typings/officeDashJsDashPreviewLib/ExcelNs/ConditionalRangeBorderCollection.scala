package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Gets the bottom border. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  val bottom: ConditionalRangeBorder = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ConditionalRangeBorderCollection: RequestContext = js.native
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
  @JSName("getItem")
  def getItem_EdgeBottom(index: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeBottom): ConditionalRangeBorder = js.native
  @JSName("getItem")
  def getItem_EdgeLeft(index: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeLeft): ConditionalRangeBorder = js.native
  @JSName("getItem")
  def getItem_EdgeRight(index: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeRight): ConditionalRangeBorder = js.native
  /**
    *
    * Gets a border object using its name.
    *
    * [Api set: ExcelApi 1.6]
    *
    * @param index Index value of the border object to be retrieved. See Excel.ConditionalRangeBorderIndex for details.
    */
  @JSName("getItem")
  def getItem_EdgeTop(index: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeTop): ConditionalRangeBorder = js.native
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
  def load(
    option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ConditionalRangeBorderCollectionLoadOptions with officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): ConditionalRangeBorderCollection = js.native
  def load(option: java.lang.String): ConditionalRangeBorderCollection = js.native
  def load(option: js.Array[java.lang.String]): ConditionalRangeBorderCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): ConditionalRangeBorderCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ConditionalRangeBorderCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ConditionalRangeBorderCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ConditionalRangeBorderCollectionData = js.native
}

