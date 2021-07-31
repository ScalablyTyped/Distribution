package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartAxisTickLabelPosition extends StObject
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisTickLabelPosition")
@js.native
object ChartAxisTickLabelPosition extends StObject {
  
  @js.native
  sealed trait high
    extends StObject
       with ChartAxisTickLabelPosition
  
  @js.native
  sealed trait low
    extends StObject
       with ChartAxisTickLabelPosition
  
  @js.native
  sealed trait nextToAxis
    extends StObject
       with ChartAxisTickLabelPosition
  
  @js.native
  sealed trait none
    extends StObject
       with ChartAxisTickLabelPosition
}
