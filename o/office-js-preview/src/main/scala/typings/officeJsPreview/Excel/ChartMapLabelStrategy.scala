package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartMapLabelStrategy extends StObject
/**
  *
  * Represents the region level of a chart series layout. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapLabelStrategy")
@js.native
object ChartMapLabelStrategy extends StObject {
  
  @js.native
  sealed trait bestFit
    extends StObject
       with ChartMapLabelStrategy
  
  @js.native
  sealed trait none
    extends StObject
       with ChartMapLabelStrategy
  
  @js.native
  sealed trait showAll
    extends StObject
       with ChartMapLabelStrategy
}
