package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartMapAreaLevel extends js.Object

/**
  *
  * Represents the mapping level of a chart series. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapAreaLevel")
@js.native
object ChartMapAreaLevel extends js.Object {
  @js.native
  sealed trait automatic extends ChartMapAreaLevel
  
  @js.native
  sealed trait city extends ChartMapAreaLevel
  
  @js.native
  sealed trait continent extends ChartMapAreaLevel
  
  @js.native
  sealed trait country extends ChartMapAreaLevel
  
  @js.native
  sealed trait county extends ChartMapAreaLevel
  
  @js.native
  sealed trait dataOnly extends ChartMapAreaLevel
  
  @js.native
  sealed trait state extends ChartMapAreaLevel
  
  @js.native
  sealed trait world extends ChartMapAreaLevel
  
  /* "Automatic" */ val automatic: typings.officeDashJs.Excel.ChartMapAreaLevel.automatic with String = js.native
  /* "City" */ val city: typings.officeDashJs.Excel.ChartMapAreaLevel.city with String = js.native
  /* "Continent" */ val continent: typings.officeDashJs.Excel.ChartMapAreaLevel.continent with String = js.native
  /* "Country" */ val country: typings.officeDashJs.Excel.ChartMapAreaLevel.country with String = js.native
  /* "County" */ val county: typings.officeDashJs.Excel.ChartMapAreaLevel.county with String = js.native
  /* "DataOnly" */ val dataOnly: typings.officeDashJs.Excel.ChartMapAreaLevel.dataOnly with String = js.native
  /* "State" */ val state: typings.officeDashJs.Excel.ChartMapAreaLevel.state with String = js.native
  /* "World" */ val world: typings.officeDashJs.Excel.ChartMapAreaLevel.world with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartMapAreaLevel with String] = js.native
}

