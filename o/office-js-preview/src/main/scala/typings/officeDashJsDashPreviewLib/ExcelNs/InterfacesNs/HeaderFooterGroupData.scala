package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "headerFooterGroup.toJSON()". */
trait HeaderFooterGroupData extends js.Object {
  /**
    *
    * The general header/footer, used for all pages unless even/odd or first page is specified.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var defaultForAllPages: js.UndefOr[HeaderFooterData] = js.undefined
  /**
    *
    * The header/footer to use for even pages, odd header/footer needs to be specified for odd pages.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var evenPages: js.UndefOr[HeaderFooterData] = js.undefined
  /**
    *
    * The first page header/footer, for all other pages general or even/odd is used.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var firstPage: js.UndefOr[HeaderFooterData] = js.undefined
  /**
    *
    * The header/footer to use for odd pages, even header/footer needs to be specified for even pages.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var oddPages: js.UndefOr[HeaderFooterData] = js.undefined
  /**
    *
    * Gets or sets the state of which headers/footers are set. See Excel.HeaderFooterState for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var state: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.HeaderFooterState | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Default | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FirstAndDefault | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OddAndEven | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FirstOddAndEven
  ] = js.undefined
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

object HeaderFooterGroupData {
  @scala.inline
  def apply(
    defaultForAllPages: HeaderFooterData = null,
    evenPages: HeaderFooterData = null,
    firstPage: HeaderFooterData = null,
    oddPages: HeaderFooterData = null,
    state: officeDashJsDashPreviewLib.ExcelNs.HeaderFooterState | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Default | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FirstAndDefault | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OddAndEven | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FirstOddAndEven = null,
    useSheetMargins: js.UndefOr[scala.Boolean] = js.undefined,
    useSheetScale: js.UndefOr[scala.Boolean] = js.undefined
  ): HeaderFooterGroupData = {
    val __obj = js.Dynamic.literal()
    if (defaultForAllPages != null) __obj.updateDynamic("defaultForAllPages")(defaultForAllPages)
    if (evenPages != null) __obj.updateDynamic("evenPages")(evenPages)
    if (firstPage != null) __obj.updateDynamic("firstPage")(firstPage)
    if (oddPages != null) __obj.updateDynamic("oddPages")(oddPages)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(useSheetMargins)) __obj.updateDynamic("useSheetMargins")(useSheetMargins)
    if (!js.isUndefined(useSheetScale)) __obj.updateDynamic("useSheetScale")(useSheetScale)
    __obj.asInstanceOf[HeaderFooterGroupData]
  }
}

