package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartMapAreaLevel extends StObject
/**
  *
  * Represents the mapping level of a chart series. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapAreaLevel")
@js.native
object ChartMapAreaLevel extends StObject {
  
  @js.native
  sealed trait automatic
    extends StObject
       with ChartMapAreaLevel
  
  @js.native
  sealed trait city
    extends StObject
       with ChartMapAreaLevel
  
  @js.native
  sealed trait continent
    extends StObject
       with ChartMapAreaLevel
  
  @js.native
  sealed trait country
    extends StObject
       with ChartMapAreaLevel
  
  @js.native
  sealed trait county
    extends StObject
       with ChartMapAreaLevel
  
  @js.native
  sealed trait dataOnly
    extends StObject
       with ChartMapAreaLevel
  
  @js.native
  sealed trait state
    extends StObject
       with ChartMapAreaLevel
  
  @js.native
  sealed trait world
    extends StObject
       with ChartMapAreaLevel
}
