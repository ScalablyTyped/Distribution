package typings.officeDashJsDashPreview.ExcelNs

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
  
  /* "Automatic" */ val automatic: typings.officeDashJsDashPreview.ExcelNs.ChartMapAreaLevel.automatic with String = js.native
  /* "City" */ val city: typings.officeDashJsDashPreview.ExcelNs.ChartMapAreaLevel.city with String = js.native
  /* "Continent" */ val continent: typings.officeDashJsDashPreview.ExcelNs.ChartMapAreaLevel.continent with String = js.native
  /* "Country" */ val country: typings.officeDashJsDashPreview.ExcelNs.ChartMapAreaLevel.country with String = js.native
  /* "County" */ val county: typings.officeDashJsDashPreview.ExcelNs.ChartMapAreaLevel.county with String = js.native
  /* "DataOnly" */ val dataOnly: typings.officeDashJsDashPreview.ExcelNs.ChartMapAreaLevel.dataOnly with String = js.native
  /* "State" */ val state: typings.officeDashJsDashPreview.ExcelNs.ChartMapAreaLevel.state with String = js.native
  /* "World" */ val world: typings.officeDashJsDashPreview.ExcelNs.ChartMapAreaLevel.world with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartMapAreaLevel with String] = js.native
}

