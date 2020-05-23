package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the mapping level of a chart series. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapAreaLevel")
@js.native
object ChartMapAreaLevel extends js.Object {
  /* "Automatic" */ val automatic: typings.officeJs.Excel.ChartMapAreaLevel.automatic with String = js.native
  /* "City" */ val city: typings.officeJs.Excel.ChartMapAreaLevel.city with String = js.native
  /* "Continent" */ val continent: typings.officeJs.Excel.ChartMapAreaLevel.continent with String = js.native
  /* "Country" */ val country: typings.officeJs.Excel.ChartMapAreaLevel.country with String = js.native
  /* "County" */ val county: typings.officeJs.Excel.ChartMapAreaLevel.county with String = js.native
  /* "DataOnly" */ val dataOnly: typings.officeJs.Excel.ChartMapAreaLevel.dataOnly with String = js.native
  /* "State" */ val state: typings.officeJs.Excel.ChartMapAreaLevel.state with String = js.native
  /* "World" */ val world: typings.officeJs.Excel.ChartMapAreaLevel.world with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartMapAreaLevel with String] = js.native
}

