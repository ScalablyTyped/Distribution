package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Workbook object, for use in `workbook.set({ ... })`. */
trait WorkbookUpdateData extends js.Object {
  /**
    *
    * True if all charts in the workbook are tracking the actual data points to which they are attached.
    False if the charts track the index of the data points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var chartDataPointTrack: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not changes have been made since the workbook was last saved.
    You can set this property to true if you want to close a modified workbook without either saving it or being prompted to save it.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isDirty: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the workbook properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var properties: js.UndefOr[DocumentPropertiesUpdateData] = js.undefined
  /**
    *
    * True if calculations in this workbook will be done using only the precision of the numbers as they're displayed.
    Data will permanently lose accuracy when switching this property from false to true.
    *
    * [Api set: ExcelApi 1.9]
    */
  var usePrecisionAsDisplayed: js.UndefOr[Boolean] = js.undefined
}

object WorkbookUpdateData {
  @scala.inline
  def apply(
    chartDataPointTrack: js.UndefOr[Boolean] = js.undefined,
    isDirty: js.UndefOr[Boolean] = js.undefined,
    properties: DocumentPropertiesUpdateData = null,
    usePrecisionAsDisplayed: js.UndefOr[Boolean] = js.undefined
  ): WorkbookUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chartDataPointTrack)) __obj.updateDynamic("chartDataPointTrack")(chartDataPointTrack.asInstanceOf[js.Any])
    if (!js.isUndefined(isDirty)) __obj.updateDynamic("isDirty")(isDirty.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(usePrecisionAsDisplayed)) __obj.updateDynamic("usePrecisionAsDisplayed")(usePrecisionAsDisplayed.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookUpdateData]
  }
}

