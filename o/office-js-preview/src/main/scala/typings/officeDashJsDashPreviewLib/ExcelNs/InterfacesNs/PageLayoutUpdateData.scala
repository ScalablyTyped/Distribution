package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PageLayout object, for use in "pageLayout.set({ ... })". */

trait PageLayoutUpdateData extends js.Object {
  /**
               *
               * Gets or sets the worksheet's black and white print option.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var blackAndWhite: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets the worksheet's bottom page margin to use for printing in points.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var bottomMargin: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Gets or sets the worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var centerHorizontally: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets the worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var centerVertically: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets the worksheet's draft mode option. If true the sheet will be printed without graphics.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var draftMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets the worksheet's first page number to print. Null value represents "auto" page numbering.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var firstPageNumber: js.UndefOr[
    scala.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Empty
  ] = js.undefined
  /**
               *
               * Gets or sets the worksheet's footer margin, in points, for use when printing.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var footerMargin: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Gets or sets the worksheet's header margin, in points, for use when printing.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var headerMargin: js.UndefOr[scala.Double] = js.undefined
  /**
              *
              * Header and footer configuration for the worksheet.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var headersFooters: js.UndefOr[HeaderFooterGroupUpdateData] = js.undefined
  /**
               *
               * Gets or sets the worksheet's left margin, in points, for use when printing.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var leftMargin: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Gets or sets the worksheet's orientation of the page.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var orientation: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.PageOrientation | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Portrait | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Landscape
  ] = js.undefined
  /**
               *
               * Gets or sets the worksheet's paper size of the page.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var paperSize: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.PaperType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Letter | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LetterSmall | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Tabloid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Ledger | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Legal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Statement | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Executive | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.A3 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.A4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.A4Small | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.A5 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.B4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.B5 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Folio | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Quatro | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Paper10x14 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Paper11x17 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Note | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Envelope9 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Envelope10 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Envelope11 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Envelope12 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Envelope14 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Csheet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dsheet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Esheet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeDL | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeC5 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeC3 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeC4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeC6 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeC65 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeB4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeB5 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeB6 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeItaly | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopeMonarch | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EnvelopePersonal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FanfoldUS | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FanfoldStdGerman | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FanfoldLegalGerman
  ] = js.undefined
  /**
               *
               * Gets or sets whether the worksheet's comments should be displayed when printing.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var printComments: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.PrintComments | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NoComments | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EndSheet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.InPlace
  ] = js.undefined
  /**
               *
               * Gets or sets the worksheet's print errors option.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var printErrors: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.PrintErrorType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AsDisplayed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Blank | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NotAvailable
  ] = js.undefined
  /**
               *
               * Gets or sets the worksheet's print gridlines flag. This flag determines whether gridlines will be printed or not.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var printGridlines: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets the worksheet's print headings flag. This flag determines whether headings will be printed or not.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var printHeadings: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets the worksheet's page print order option. This specifies the order to use for processing the page number printed.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var printOrder: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.PrintOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DownThenOver | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OverThenDown
  ] = js.undefined
  /**
               *
               * Gets or sets the worksheet's right margin, in points, for use when printing.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var rightMargin: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Gets or sets the worksheet's top margin, in points, for use when printing.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var topMargin: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Gets or sets the worksheet's print zoom options.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var zoom: js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.PageLayoutZoomOptions] = js.undefined
}

