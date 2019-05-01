package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PageBreak")
@js.native
class PageBreak ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Represents the column index for the page break
    *
    * [Api set: ExcelApi 1.9]
    */
  val columnIndex: scala.Double = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PageBreak: RequestContext = js.native
  /**
    *
    * Represents the row index for the page break
    *
    * [Api set: ExcelApi 1.9]
    */
  val rowIndex: scala.Double = js.native
  /**
    *
    * Deletes a page break object.
    *
    * [Api set: ExcelApi 1.9]
    */
  def delete(): scala.Unit = js.native
  /**
    *
    * Gets the first cell after the page break.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getCellAfterBreak(): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.PageBreak` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.PageBreak` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.PageBreak` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageBreak = js.native
  def load(option: java.lang.String): PageBreak = js.native
  def load(option: js.Array[java.lang.String]): PageBreak = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): PageBreak = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PageBreakLoadOptions): PageBreak = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PageBreak object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PageBreakData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PageBreakData = js.native
}

