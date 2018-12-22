package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * [Api set: ExcelApi BETA (PREVIEW ONLY)]
         * @beta
         */

trait HeaderFooterGroupLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * The general header/footer, used for all pages unless even/odd or first page is specified.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var defaultForAllPages: js.UndefOr[HeaderFooterLoadOptions] = js.undefined
  /**
              *
              * The header/footer to use for even pages, odd header/footer needs to be specified for odd pages.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var evenPages: js.UndefOr[HeaderFooterLoadOptions] = js.undefined
  /**
              *
              * The first page header/footer, for all other pages general or even/odd is used.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var firstPage: js.UndefOr[HeaderFooterLoadOptions] = js.undefined
  /**
              *
              * The header/footer to use for odd pages, even header/footer needs to be specified for even pages.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var oddPages: js.UndefOr[HeaderFooterLoadOptions] = js.undefined
  /**
               *
               * Gets or sets the state of which headers/footers are set. See Excel.HeaderFooterState for details.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var state: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets a flag indicating if headers/footers are aligned with the page margins set in the page layout options for the worksheet.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var useSheetMargins: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets a flag indicating if headers/footers should be scaled by the page percentage scale set in the page layout options for the worksheet.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var useSheetScale: js.UndefOr[scala.Boolean] = js.undefined
}

