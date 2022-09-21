package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.PageLayoutData
import typings.officeJsPreview.Excel.Interfaces.PageLayoutLoadOptions
import typings.officeJsPreview.Excel.Interfaces.PageLayoutUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.A3
import typings.officeJsPreview.officeJsPreviewStrings.A4
import typings.officeJsPreview.officeJsPreviewStrings.A4Small
import typings.officeJsPreview.officeJsPreviewStrings.A5
import typings.officeJsPreview.officeJsPreviewStrings.AsDisplayed
import typings.officeJsPreview.officeJsPreviewStrings.B4
import typings.officeJsPreview.officeJsPreviewStrings.B5
import typings.officeJsPreview.officeJsPreviewStrings.Blank
import typings.officeJsPreview.officeJsPreviewStrings.Centimeters
import typings.officeJsPreview.officeJsPreviewStrings.Csheet
import typings.officeJsPreview.officeJsPreviewStrings.Dash
import typings.officeJsPreview.officeJsPreviewStrings.DownThenOver
import typings.officeJsPreview.officeJsPreviewStrings.Dsheet
import typings.officeJsPreview.officeJsPreviewStrings.EndSheet
import typings.officeJsPreview.officeJsPreviewStrings.Envelope10
import typings.officeJsPreview.officeJsPreviewStrings.Envelope11
import typings.officeJsPreview.officeJsPreviewStrings.Envelope12
import typings.officeJsPreview.officeJsPreviewStrings.Envelope14
import typings.officeJsPreview.officeJsPreviewStrings.Envelope9
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeB4
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeB5
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeB6
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeC3
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeC4
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeC5
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeC6
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeC65
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeDL
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeItaly
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeMonarch
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopePersonal
import typings.officeJsPreview.officeJsPreviewStrings.Esheet
import typings.officeJsPreview.officeJsPreviewStrings.Executive
import typings.officeJsPreview.officeJsPreviewStrings.FanfoldLegalGerman
import typings.officeJsPreview.officeJsPreviewStrings.FanfoldStdGerman
import typings.officeJsPreview.officeJsPreviewStrings.FanfoldUS
import typings.officeJsPreview.officeJsPreviewStrings.Folio
import typings.officeJsPreview.officeJsPreviewStrings.InPlace
import typings.officeJsPreview.officeJsPreviewStrings.Inches
import typings.officeJsPreview.officeJsPreviewStrings.Landscape
import typings.officeJsPreview.officeJsPreviewStrings.Ledger
import typings.officeJsPreview.officeJsPreviewStrings.Legal
import typings.officeJsPreview.officeJsPreviewStrings.Letter
import typings.officeJsPreview.officeJsPreviewStrings.LetterSmall
import typings.officeJsPreview.officeJsPreviewStrings.NoComments
import typings.officeJsPreview.officeJsPreviewStrings.NotAvailable
import typings.officeJsPreview.officeJsPreviewStrings.Note
import typings.officeJsPreview.officeJsPreviewStrings.OverThenDown
import typings.officeJsPreview.officeJsPreviewStrings.Paper10x14
import typings.officeJsPreview.officeJsPreviewStrings.Paper11x17
import typings.officeJsPreview.officeJsPreviewStrings.Points
import typings.officeJsPreview.officeJsPreviewStrings.Portrait
import typings.officeJsPreview.officeJsPreviewStrings.Quatro
import typings.officeJsPreview.officeJsPreviewStrings.Statement
import typings.officeJsPreview.officeJsPreviewStrings.Tabloid
import typings.officeJsPreview.officeJsPreviewStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents layout and print settings that are not dependent on any printer-specific implementation. These settings include margins, orientation, page numbering, title rows, and print area.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait PageLayout
  extends StObject
     with ClientObject {
  
  /**
    * The worksheet's black and white print option.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var blackAndWhite: Boolean = js.native
  
  /**
    * The worksheet's bottom page margin to use for printing in points.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: Double = js.native
  
  /**
    * The worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var centerHorizontally: Boolean = js.native
  
  /**
    * The worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var centerVertically: Boolean = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PageLayout: RequestContext = js.native
  
  /**
    * The worksheet's draft mode option. If `true`, the sheet will be printed without graphics.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var draftMode: Boolean = js.native
  
  /**
    * The worksheet's first page number to print. A `null` value represents "auto" page numbering.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var firstPageNumber: Double | _empty = js.native
  
  /**
    * The worksheet's footer margin, in points, for use when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var footerMargin: Double = js.native
  
  /**
    * Gets the `RangeAreas` object, comprising one or more rectangular ranges, that represents the print area for the worksheet. If there is no print area, an `ItemNotFound` error will be thrown.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getPrintArea(): RangeAreas = js.native
  
  /**
    * Gets the `RangeAreas` object, comprising one or more rectangular ranges, that represents the print area for the worksheet. If there is no print area, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getPrintAreaOrNullObject(): RangeAreas = js.native
  
  /**
    * Gets the range object representing the title columns.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleColumns(): Range = js.native
  
  /**
    * Gets the range object representing the title columns. If not set, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleColumnsOrNullObject(): Range = js.native
  
  /**
    * Gets the range object representing the title rows.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleRows(): Range = js.native
  
  /**
    * Gets the range object representing the title rows. If not set, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleRowsOrNullObject(): Range = js.native
  
  /**
    * The worksheet's header margin, in points, for use when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var headerMargin: Double = js.native
  
  /**
    * Header and footer configuration for the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val headersFooters: HeaderFooterGroup = js.native
  
  /**
    * The worksheet's left margin, in points, for use when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: Double = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageLayout = js.native
  def load(options: PageLayoutLoadOptions): PageLayout = js.native
  def load(propertyNamesAndPaths: Expand): PageLayout = js.native
  def load(propertyNames: String): PageLayout = js.native
  def load(propertyNames: js.Array[String]): PageLayout = js.native
  
  /**
    * The worksheet's orientation of the page.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var orientation: PageOrientation | Portrait | Landscape = js.native
  
  /**
    * The worksheet's paper size of the page.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var paperSize: PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman = js.native
  
  /**
    * Specifies if the worksheet's comments should be displayed when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var printComments: PrintComments | NoComments | EndSheet | InPlace = js.native
  
  /**
    * The worksheet's print errors option.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var printErrors: PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable = js.native
  
  /**
    * Specifies if the worksheet's gridlines will be printed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var printGridlines: Boolean = js.native
  
  /**
    * Specifies if the worksheet's headings will be printed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var printHeadings: Boolean = js.native
  
  /**
    * The worksheet's page print order option. This specifies the order to use for processing the page number printed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var printOrder: PrintOrder | DownThenOver | OverThenDown = js.native
  
  /**
    * The worksheet's right margin, in points, for use when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: Double = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PageLayoutUpdateData): Unit = js.native
  def set(properties: PageLayoutUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PageLayout): Unit = js.native
  
  def setPrintArea(printArea: String): Unit = js.native
  /**
    * Sets the worksheet's print area.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param printArea The range or ranges of the content to print.
    */
  def setPrintArea(printArea: Range): Unit = js.native
  def setPrintArea(printArea: RangeAreas): Unit = js.native
  
  /**
    * Sets the worksheet's page margins with units.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param unit Measurement unit for the margins provided.
    * @param marginOptions Margin values to set. Margins not provided remain unchanged.
    */
  def setPrintMargins(unit: Points | Inches | Centimeters, marginOptions: PageLayoutMarginOptions): Unit = js.native
  /**
    * Sets the worksheet's page margins with units.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param unit Measurement unit for the margins provided.
    * @param marginOptions Margin values to set. Margins not provided remain unchanged.
    */
  def setPrintMargins(unit: PrintMarginUnit, marginOptions: PageLayoutMarginOptions): Unit = js.native
  
  def setPrintTitleColumns(printTitleColumns: String): Unit = js.native
  /**
    * Sets the columns that contain the cells to be repeated at the left of each page of the worksheet for printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param printTitleColumns The columns to be repeated to the left of each page. The range must span the entire column to be valid.
    */
  def setPrintTitleColumns(printTitleColumns: Range): Unit = js.native
  
  def setPrintTitleRows(printTitleRows: String): Unit = js.native
  /**
    * Sets the rows that contain the cells to be repeated at the top of each page of the worksheet for printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param printTitleRows The rows to be repeated at the top of each page. The range must span the entire row to be valid.
    */
  def setPrintTitleRows(printTitleRows: Range): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PageLayout object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PageLayoutData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PageLayoutData = js.native
  
  /**
    * The worksheet's top margin, in points, for use when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: Double = js.native
  
  /**
    * The worksheet's print zoom options.
    The `PageLayoutZoomOptions` object must be set as a JSON object (use `x.zoom = {...}` instead of `x.zoom.scale = ...`).
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var zoom: PageLayoutZoomOptions = js.native
}
