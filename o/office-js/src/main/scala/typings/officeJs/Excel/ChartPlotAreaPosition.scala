package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartPlotAreaPosition extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ChartPlotAreaPosition")
@js.native
object ChartPlotAreaPosition extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait automatic
    extends StObject
       with ChartPlotAreaPosition
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait custom
    extends StObject
       with ChartPlotAreaPosition
}
