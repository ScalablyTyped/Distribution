package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.PivotLayoutType
import typings.officeJs.Excel.SubtotalLocationType
import typings.officeJs.officeJsStrings.AtBottom
import typings.officeJs.officeJsStrings.AtTop
import typings.officeJs.officeJsStrings.Compact
import typings.officeJs.officeJsStrings.Off
import typings.officeJs.officeJsStrings.Outline
import typings.officeJs.officeJsStrings.Tabular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pivotLayout.toJSON()`. */
@js.native
trait PivotLayoutData extends js.Object {
  /**
    *
    * Specifies if formatting will be automatically formatted when it’s refreshed or when fields are moved.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the field list can be shown in the UI.
    *
    * [Api set: ExcelApi 1.10]
    */
  var enableFieldList: js.UndefOr[Boolean] = js.native
  /**
    *
    * This property indicates the PivotLayoutType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var layoutType: js.UndefOr[PivotLayoutType | Compact | Tabular | Outline] = js.native
  /**
    *
    * Specifies if formatting is preserved when the report is refreshed or recalculated by operations such as pivoting, sorting, or changing page field items.
    *
    * [Api set: ExcelApi 1.9]
    */
  var preserveFormatting: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the PivotTable report shows grand totals for columns.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showColumnGrandTotals: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the PivotTable report shows grand totals for rows.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRowGrandTotals: js.UndefOr[Boolean] = js.native
  /**
    *
    * This property indicates the SubtotalLocationType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotalLocation: js.UndefOr[SubtotalLocationType | AtTop | AtBottom | Off] = js.native
}

object PivotLayoutData {
  @scala.inline
  def apply(): PivotLayoutData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotLayoutData]
  }
  @scala.inline
  implicit class PivotLayoutDataOps[Self <: PivotLayoutData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoFormat(value: Boolean): Self = this.set("autoFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFormat: Self = this.set("autoFormat", js.undefined)
    @scala.inline
    def setEnableFieldList(value: Boolean): Self = this.set("enableFieldList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableFieldList: Self = this.set("enableFieldList", js.undefined)
    @scala.inline
    def setLayoutType(value: PivotLayoutType | Compact | Tabular | Outline): Self = this.set("layoutType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutType: Self = this.set("layoutType", js.undefined)
    @scala.inline
    def setPreserveFormatting(value: Boolean): Self = this.set("preserveFormatting", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveFormatting: Self = this.set("preserveFormatting", js.undefined)
    @scala.inline
    def setShowColumnGrandTotals(value: Boolean): Self = this.set("showColumnGrandTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowColumnGrandTotals: Self = this.set("showColumnGrandTotals", js.undefined)
    @scala.inline
    def setShowRowGrandTotals(value: Boolean): Self = this.set("showRowGrandTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRowGrandTotals: Self = this.set("showRowGrandTotals", js.undefined)
    @scala.inline
    def setSubtotalLocation(value: SubtotalLocationType | AtTop | AtBottom | Off): Self = this.set("subtotalLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtotalLocation: Self = this.set("subtotalLocation", js.undefined)
  }
  
}

