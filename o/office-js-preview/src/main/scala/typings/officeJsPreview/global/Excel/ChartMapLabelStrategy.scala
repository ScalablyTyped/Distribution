package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the region level of a chart series layout. This only applies to region map charts.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapLabelStrategy")
@js.native
object ChartMapLabelStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartMapLabelStrategy & String] = js.native
  
  /* "BestFit" */ val bestFit: typings.officeJsPreview.Excel.ChartMapLabelStrategy.bestFit & String = js.native
  
  /* "None" */ val none: typings.officeJsPreview.Excel.ChartMapLabelStrategy.none & String = js.native
  
  /* "ShowAll" */ val showAll: typings.officeJsPreview.Excel.ChartMapLabelStrategy.showAll & String = js.native
}
