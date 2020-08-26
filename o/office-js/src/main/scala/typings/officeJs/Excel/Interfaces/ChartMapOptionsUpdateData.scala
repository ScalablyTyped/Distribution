package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartMapAreaLevel
import typings.officeJs.Excel.ChartMapLabelStrategy
import typings.officeJs.Excel.ChartMapProjectionType
import typings.officeJs.officeJsStrings.Albers
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.BestFit
import typings.officeJs.officeJsStrings.City
import typings.officeJs.officeJsStrings.Continent
import typings.officeJs.officeJsStrings.Country
import typings.officeJs.officeJsStrings.County
import typings.officeJs.officeJsStrings.DataOnly
import typings.officeJs.officeJsStrings.Mercator
import typings.officeJs.officeJsStrings.Miller
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Robinson
import typings.officeJs.officeJsStrings.ShowAll
import typings.officeJs.officeJsStrings.State
import typings.officeJs.officeJsStrings.World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartMapOptions object, for use in `chartMapOptions.set({ ... })`. */
@js.native
trait ChartMapOptionsUpdateData extends js.Object {
  /**
    *
    * Specifies the series map labels strategy of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: js.UndefOr[ChartMapLabelStrategy | None | BestFit | ShowAll] = js.native
  /**
    *
    * Specifies the series mapping level of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[
    ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
  ] = js.native
  /**
    *
    * Specifies the series projection type of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: js.UndefOr[ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers] = js.native
}

object ChartMapOptionsUpdateData {
  @scala.inline
  def apply(): ChartMapOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartMapOptionsUpdateData]
  }
  @scala.inline
  implicit class ChartMapOptionsUpdateDataOps[Self <: ChartMapOptionsUpdateData] (val x: Self) extends AnyVal {
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
    def setLabelStrategy(value: ChartMapLabelStrategy | None | BestFit | ShowAll): Self = this.set("labelStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStrategy: Self = this.set("labelStrategy", js.undefined)
    @scala.inline
    def setLevel(
      value: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
    ): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setProjectionType(value: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers): Self = this.set("projectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectionType: Self = this.set("projectionType", js.undefined)
  }
  
}

