package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.PageLayout")
@js.native
class PageLayout ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Gets or sets the worksheet's black and white print option.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var blackAndWhite: scala.Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's bottom page margin to use for printing in points.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var bottomMargin: scala.Double = js.native
  /**
    *
    * Gets or sets the worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var centerHorizontally: scala.Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var centerVertically: scala.Boolean = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PageLayout: RequestContext = js.native
  /**
    *
    * Gets or sets the worksheet's draft mode option. If true the sheet will be printed without graphics.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var draftMode: scala.Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's first page number to print. Null value represents "auto" page numbering.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var firstPageNumber: scala.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Empty = js.native
  /**
    *
    * Gets or sets the worksheet's footer margin, in points, for use when printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var footerMargin: scala.Double = js.native
  /**
    *
    * Gets or sets the worksheet's header margin, in points, for use when printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var headerMargin: scala.Double = js.native
  /**
    *
    * Header and footer configuration for the worksheet.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val headersFooters: HeaderFooterGroup = js.native
  /**
    *
    * Gets or sets the worksheet's left margin, in points, for use when printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var leftMargin: scala.Double = js.native
  /**
    *
    * Gets or sets the worksheet's orientation of the page.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var orientation: PageOrientation | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Portrait | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Landscape = js.native
  /**
    *
    * Gets or sets the worksheet's paper size of the page.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var paperSize: PaperType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Letter | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LetterSmall | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Tabloid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Ledger | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Legal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Statement | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Executive | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.A3 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.A4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.A4Small | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.A5 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.B4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.B5 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Folio | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Quatro | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Paper10x14 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Paper11x17 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Note | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Envelope9 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Envelope10 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Envelope11 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Envelope12 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Envelope14 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Csheet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dsheet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Esheet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeDL | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeC5 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeC3 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeC4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeC6 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeC65 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeB4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeB5 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeB6 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeItaly | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeMonarch | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopePersonal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FanfoldUS | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FanfoldStdGerman | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FanfoldLegalGerman = js.native
  /**
    *
    * Gets or sets whether the worksheet's comments should be displayed when printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var printComments: PrintComments | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NoComments | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EndSheet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.InPlace = js.native
  /**
    *
    * Gets or sets the worksheet's print errors option.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var printErrors: PrintErrorType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AsDisplayed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Blank | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NotAvailable = js.native
  /**
    *
    * Gets or sets the worksheet's print gridlines flag. This flag determines whether gridlines will be printed or not.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var printGridlines: scala.Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's print headings flag. This flag determines whether headings will be printed or not.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var printHeadings: scala.Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's page print order option. This specifies the order to use for processing the page number printed.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var printOrder: PrintOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DownThenOver | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OverThenDown = js.native
  /**
    *
    * Gets or sets the worksheet's right margin, in points, for use when printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var rightMargin: scala.Double = js.native
  /**
    *
    * Gets or sets the worksheet's top margin, in points, for use when printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var topMargin: scala.Double = js.native
  /**
    *
    * Gets or sets the worksheet's print zoom options.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var zoom: PageLayoutZoomOptions = js.native
  /**
    *
    * Gets the RangeAreas object, comprising one or more rectangular ranges, that represents the print area for the worksheet. If there is no print area, an ItemNotFound error will be thrown.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getPrintArea(): RangeAreas = js.native
  /**
    *
    * Gets the RangeAreas object, comprising one or more rectangular ranges, that represents the print area for the worksheet. If there is no print area, a null object will be returned.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getPrintAreaOrNullObject(): RangeAreas = js.native
  /**
    *
    * Gets the range object representing the title columns.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getPrintTitleColumns(): Range = js.native
  /**
    *
    * Gets the range object representing the title columns. If not set, this will return a null object.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getPrintTitleColumnsOrNullObject(): Range = js.native
  /**
    *
    * Gets the range object representing the title rows.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getPrintTitleRows(): Range = js.native
  /**
    *
    * Gets the range object representing the title rows. If not set, this will return a null object.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getPrintTitleRowsOrNullObject(): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.PageLayout` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.PageLayout` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.PageLayout` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageLayout = js.native
  def load(option: java.lang.String): PageLayout = js.native
  def load(option: js.Array[java.lang.String]): PageLayout = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): PageLayout = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PageLayoutLoadOptions): PageLayout = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.PageLayout): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PageLayoutUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PageLayoutUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PageLayout): scala.Unit = js.native
  def setPrintArea(printArea: java.lang.String): scala.Unit = js.native
  /**
    *
    * Sets the worksheet's print area.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param printArea The range, or RangeAreas of the content to print.
    */
  def setPrintArea(printArea: Range): scala.Unit = js.native
  def setPrintArea(printArea: RangeAreas): scala.Unit = js.native
  /**
    *
    * Sets the worksheet's page margins with units.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param unit Measurement unit for the margins provided.
    * @param marginOptions Margin values to set, margins not provided will remain unchanged.
    */
  def setPrintMargins(unit: PrintMarginUnit, marginOptions: PageLayoutMarginOptions): scala.Unit = js.native
  @JSName("setPrintMargins")
  def setPrintMargins_Centimeters(
    unit: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Centimeters,
    marginOptions: PageLayoutMarginOptions
  ): scala.Unit = js.native
  @JSName("setPrintMargins")
  def setPrintMargins_Inches(
    unit: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Inches,
    marginOptions: PageLayoutMarginOptions
  ): scala.Unit = js.native
  /**
    *
    * Sets the worksheet's page margins with units.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param unit Measurement unit for the margins provided.
    * @param marginOptions Margin values to set, margins not provided will remain unchanged.
    */
  @JSName("setPrintMargins")
  def setPrintMargins_Points(
    unit: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Points,
    marginOptions: PageLayoutMarginOptions
  ): scala.Unit = js.native
  def setPrintTitleColumns(printTitleColumns: java.lang.String): scala.Unit = js.native
  /**
    *
    * Sets the columns that contain the cells to be repeated at the left of each page of the worksheet for printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param printTitleColumns The columns to be repeated to the left of each page, range must span the entire column to be valid.
    */
  def setPrintTitleColumns(printTitleColumns: Range): scala.Unit = js.native
  def setPrintTitleRows(printTitleRows: java.lang.String): scala.Unit = js.native
  /**
    *
    * Sets the rows that contain the cells to be repeated at the top of each page of the worksheet for printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param printTitleRows The rows to be repeated at the top of each page, range must span the entire row to be valid.
    */
  def setPrintTitleRows(printTitleRows: Range): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PageLayout object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PageLayoutData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PageLayoutData = js.native
}

