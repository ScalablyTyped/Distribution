package typings.officeDashJs.ExcelNs

import typings.officeDashJs.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.PageBreakCollectionData
import typings.officeDashJs.ExcelNs.InterfacesNs.PageBreakCollectionLoadOptions
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.ClientResult
import typings.officeDashJs.OfficeExtensionNs.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PageBreakCollection")
@js.native
class PageBreakCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PageBreakCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[PageBreak] = js.native
  def add(pageBreakRange: String): PageBreak = js.native
  /**
    *
    * Adds a page break before the top-left cell of the range specified.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param pageBreakRange The range immediately after the page break to be added.
    */
  def add(pageBreakRange: Range): PageBreak = js.native
  /**
    *
    * Gets the number of page breaks in the collection.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Gets a page break object via the index.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param index Index of the page break.
    */
  def getItem(index: Double): PageBreak = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.PageBreakCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.PageBreakCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.PageBreakCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageBreakCollection = js.native
  def load(option: PageBreakCollectionLoadOptions with CollectionLoadOptions): PageBreakCollection = js.native
  def load(option: String): PageBreakCollection = js.native
  def load(option: js.Array[String]): PageBreakCollection = js.native
  def load(option: LoadOption): PageBreakCollection = js.native
  /**
    *
    * Resets all manual page breaks in the collection.
    *
    * [Api set: ExcelApi 1.9]
    */
  def removePageBreaks(): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.PageBreakCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PageBreakCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): PageBreakCollectionData = js.native
}

