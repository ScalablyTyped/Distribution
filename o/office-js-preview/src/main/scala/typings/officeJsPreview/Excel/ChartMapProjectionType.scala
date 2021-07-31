package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartMapProjectionType extends StObject
/**
  *
  * Represents the region projection type of a chart series layout. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapProjectionType")
@js.native
object ChartMapProjectionType extends StObject {
  
  @js.native
  sealed trait albers
    extends StObject
       with ChartMapProjectionType
  
  @js.native
  sealed trait automatic
    extends StObject
       with ChartMapProjectionType
  
  @js.native
  sealed trait mercator
    extends StObject
       with ChartMapProjectionType
  
  @js.native
  sealed trait miller
    extends StObject
       with ChartMapProjectionType
  
  @js.native
  sealed trait robinson
    extends StObject
       with ChartMapProjectionType
}
