package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartAxisTickMark extends StObject
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisTickMark")
@js.native
object ChartAxisTickMark extends StObject {
  
  @js.native
  sealed trait cross
    extends StObject
       with ChartAxisTickMark
  
  @js.native
  sealed trait inside
    extends StObject
       with ChartAxisTickMark
  
  @js.native
  sealed trait none
    extends StObject
       with ChartAxisTickMark
  
  @js.native
  sealed trait outside
    extends StObject
       with ChartAxisTickMark
}
