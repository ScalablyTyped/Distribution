package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the data source type of the chart series.
  * 
  * @remarks
  * [Api set: ExcelApi 1.15]
  */
@JSGlobal("Excel.ChartDataSourceType")
@js.native
object ChartDataSourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartDataSourceType & String] = js.native
  
  /* "ExternalRange" */ val externalRange: typings.officeJs.Excel.ChartDataSourceType.externalRange & String = js.native
  
  /* "List" */ val list: typings.officeJs.Excel.ChartDataSourceType.list & String = js.native
  
  /* "LocalRange" */ val localRange: typings.officeJs.Excel.ChartDataSourceType.localRange & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJs.Excel.ChartDataSourceType.unknown & String = js.native
}
