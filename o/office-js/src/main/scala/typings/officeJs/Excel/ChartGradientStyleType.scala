package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartGradientStyleType extends StObject
/**
  *
  * Represents the gradient style type of a chart series. This is only applicable for region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartGradientStyleType")
@js.native
object ChartGradientStyleType extends StObject {
  
  @js.native
  sealed trait extremeValue
    extends StObject
       with ChartGradientStyleType
  
  @js.native
  sealed trait number
    extends StObject
       with ChartGradientStyleType
  
  @js.native
  sealed trait percent
    extends StObject
       with ChartGradientStyleType
}
