package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the mapping level of a chart series. This only applies to region map charts.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapAreaLevel")
@js.native
object ChartMapAreaLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartMapAreaLevel & String] = js.native
  
  /* "Automatic" */ val automatic: typings.officeJs.Excel.ChartMapAreaLevel.automatic & String = js.native
  
  /* "City" */ val city: typings.officeJs.Excel.ChartMapAreaLevel.city & String = js.native
  
  /* "Continent" */ val continent: typings.officeJs.Excel.ChartMapAreaLevel.continent & String = js.native
  
  /* "Country" */ val country: typings.officeJs.Excel.ChartMapAreaLevel.country & String = js.native
  
  /* "County" */ val county: typings.officeJs.Excel.ChartMapAreaLevel.county & String = js.native
  
  /* "DataOnly" */ val dataOnly: typings.officeJs.Excel.ChartMapAreaLevel.dataOnly & String = js.native
  
  /* "State" */ val state: typings.officeJs.Excel.ChartMapAreaLevel.state & String = js.native
  
  /* "World" */ val world: typings.officeJs.Excel.ChartMapAreaLevel.world & String = js.native
}
