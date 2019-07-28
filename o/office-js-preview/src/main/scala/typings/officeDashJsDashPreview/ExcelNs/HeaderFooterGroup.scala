package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.HeaderFooterGroupData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.HeaderFooterGroupLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.HeaderFooterGroupUpdateData
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.UpdateOptions
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Default
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FirstAndDefault
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FirstOddAndEven
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.OddAndEven
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.HeaderFooterGroup")
@js.native
class HeaderFooterGroup () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_HeaderFooterGroup: RequestContext = js.native
  /**
    *
    * The general header/footer, used for all pages unless even/odd or first page is specified.
    *
    * [Api set: ExcelApi 1.9]
    */
  val defaultForAllPages: HeaderFooter = js.native
  /**
    *
    * The header/footer to use for even pages, odd header/footer needs to be specified for odd pages.
    *
    * [Api set: ExcelApi 1.9]
    */
  val evenPages: HeaderFooter = js.native
  /**
    *
    * The first page header/footer, for all other pages general or even/odd is used.
    *
    * [Api set: ExcelApi 1.9]
    */
  val firstPage: HeaderFooter = js.native
  /**
    *
    * The header/footer to use for odd pages, even header/footer needs to be specified for even pages.
    *
    * [Api set: ExcelApi 1.9]
    */
  val oddPages: HeaderFooter = js.native
  /**
    *
    * Gets or sets the state of which headers/footers are set. See Excel.HeaderFooterState for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var state: HeaderFooterState | Default | FirstAndDefault | OddAndEven | FirstOddAndEven = js.native
  /**
    *
    * Gets or sets a flag indicating if headers/footers are aligned with the page margins set in the page layout options for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useSheetMargins: Boolean = js.native
  /**
    *
    * Gets or sets a flag indicating if headers/footers should be scaled by the page percentage scale set in the page layout options for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useSheetScale: Boolean = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.HeaderFooterGroup` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.HeaderFooterGroup` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.HeaderFooterGroup` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): HeaderFooterGroup = js.native
  def load(option: String): HeaderFooterGroup = js.native
  def load(option: js.Array[String]): HeaderFooterGroup = js.native
  def load(option: Anon_Expand): HeaderFooterGroup = js.native
  def load(option: HeaderFooterGroupLoadOptions): HeaderFooterGroup = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: HeaderFooterGroup): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.HeaderFooterGroup): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: HeaderFooterGroupUpdateData): Unit = js.native
  def set(properties: HeaderFooterGroupUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.HeaderFooterGroup object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.HeaderFooterGroupData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): HeaderFooterGroupData = js.native
}

