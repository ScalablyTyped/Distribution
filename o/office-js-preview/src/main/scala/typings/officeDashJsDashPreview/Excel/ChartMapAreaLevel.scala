package typings.officeDashJsDashPreview.Excel

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
  
  /* "Automatic" */ val automatic: typings.officeDashJsDashPreview.Excel.ChartMapAreaLevel.automatic with String = js.native
  /* "City" */ val city: typings.officeDashJsDashPreview.Excel.ChartMapAreaLevel.city with String = js.native
  /* "Continent" */ val continent: typings.officeDashJsDashPreview.Excel.ChartMapAreaLevel.continent with String = js.native
  /* "Country" */ val country: typings.officeDashJsDashPreview.Excel.ChartMapAreaLevel.country with String = js.native
  /* "County" */ val county: typings.officeDashJsDashPreview.Excel.ChartMapAreaLevel.county with String = js.native
  /* "DataOnly" */ val dataOnly: typings.officeDashJsDashPreview.Excel.ChartMapAreaLevel.dataOnly with String = js.native
  /* "State" */ val state: typings.officeDashJsDashPreview.Excel.ChartMapAreaLevel.state with String = js.native
  /* "World" */ val world: typings.officeDashJsDashPreview.Excel.ChartMapAreaLevel.world with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartMapAreaLevel with String] = js.native
}

