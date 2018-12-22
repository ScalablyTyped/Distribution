package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartMapAreaLevel extends js.Object

/**
     *
     * Represents the mapping level of chart series, only applicable in RegionMap chart.
     *
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */
@JSGlobal("Excel.ChartMapAreaLevel")
@js.native
object ChartMapAreaLevel extends js.Object {
  @js.native
  sealed trait automatic
    extends officeDashJsDashPreviewLib.ExcelNs.ChartMapAreaLevel
  
  @js.native
  sealed trait city
    extends officeDashJsDashPreviewLib.ExcelNs.ChartMapAreaLevel
  
  @js.native
  sealed trait continent
    extends officeDashJsDashPreviewLib.ExcelNs.ChartMapAreaLevel
  
  @js.native
  sealed trait country
    extends officeDashJsDashPreviewLib.ExcelNs.ChartMapAreaLevel
  
  @js.native
  sealed trait county
    extends officeDashJsDashPreviewLib.ExcelNs.ChartMapAreaLevel
  
  @js.native
  sealed trait dataOnly
    extends officeDashJsDashPreviewLib.ExcelNs.ChartMapAreaLevel
  
  @js.native
  sealed trait state
    extends officeDashJsDashPreviewLib.ExcelNs.ChartMapAreaLevel
  
  @js.native
  sealed trait world
    extends officeDashJsDashPreviewLib.ExcelNs.ChartMapAreaLevel
  
  /* "Automatic" */ val automatic: automatic with java.lang.String = js.native
  /* "City" */ val city: city with java.lang.String = js.native
  /* "Continent" */ val continent: continent with java.lang.String = js.native
  /* "Country" */ val country: country with java.lang.String = js.native
  /* "County" */ val county: county with java.lang.String = js.native
  /* "DataOnly" */ val dataOnly: dataOnly with java.lang.String = js.native
  /* "State" */ val state: state with java.lang.String = js.native
  /* "World" */ val world: world with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ChartMapAreaLevel with java.lang.String] = js.native
}

