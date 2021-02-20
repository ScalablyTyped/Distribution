package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the region level of a chart series layout. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapLabelStrategy")
@js.native
object ChartMapLabelStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartMapLabelStrategy with String] = js.native
  
  /* "BestFit" */ val bestFit: typings.officeJs.Excel.ChartMapLabelStrategy.bestFit with String = js.native
  
  /* "None" */ val none: typings.officeJs.Excel.ChartMapLabelStrategy.none with String = js.native
  
  /* "ShowAll" */ val showAll: typings.officeJs.Excel.ChartMapLabelStrategy.showAll with String = js.native
}
