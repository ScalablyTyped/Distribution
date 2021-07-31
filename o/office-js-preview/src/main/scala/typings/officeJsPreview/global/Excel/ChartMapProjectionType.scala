package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the region projection type of a chart series layout. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapProjectionType")
@js.native
object ChartMapProjectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartMapProjectionType & String] = js.native
  
  /* "Albers" */ val albers: typings.officeJsPreview.Excel.ChartMapProjectionType.albers & String = js.native
  
  /* "Automatic" */ val automatic: typings.officeJsPreview.Excel.ChartMapProjectionType.automatic & String = js.native
  
  /* "Mercator" */ val mercator: typings.officeJsPreview.Excel.ChartMapProjectionType.mercator & String = js.native
  
  /* "Miller" */ val miller: typings.officeJsPreview.Excel.ChartMapProjectionType.miller & String = js.native
  
  /* "Robinson" */ val robinson: typings.officeJsPreview.Excel.ChartMapProjectionType.robinson & String = js.native
}
