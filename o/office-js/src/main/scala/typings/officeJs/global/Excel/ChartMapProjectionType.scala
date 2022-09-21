package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the region projection type of a chart series layout. This only applies to region map charts.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapProjectionType")
@js.native
object ChartMapProjectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartMapProjectionType & String] = js.native
  
  /* "Albers" */ val albers: typings.officeJs.Excel.ChartMapProjectionType.albers & String = js.native
  
  /* "Automatic" */ val automatic: typings.officeJs.Excel.ChartMapProjectionType.automatic & String = js.native
  
  /* "Mercator" */ val mercator: typings.officeJs.Excel.ChartMapProjectionType.mercator & String = js.native
  
  /* "Miller" */ val miller: typings.officeJs.Excel.ChartMapProjectionType.miller & String = js.native
  
  /* "Robinson" */ val robinson: typings.officeJs.Excel.ChartMapProjectionType.robinson & String = js.native
}
