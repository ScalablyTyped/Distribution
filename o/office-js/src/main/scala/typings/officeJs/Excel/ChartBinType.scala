package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartBinType extends StObject
/**
  *
  * Specifies the bin's type of a histogram chart or pareto chart series.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartBinType")
@js.native
object ChartBinType extends StObject {
  
  @js.native
  sealed trait auto
    extends StObject
       with ChartBinType
  
  @js.native
  sealed trait binCount
    extends StObject
       with ChartBinType
  
  @js.native
  sealed trait binWidth
    extends StObject
       with ChartBinType
  
  @js.native
  sealed trait category
    extends StObject
       with ChartBinType
}
