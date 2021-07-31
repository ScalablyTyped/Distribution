package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartAxisScaleType extends StObject
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisScaleType")
@js.native
object ChartAxisScaleType extends StObject {
  
  @js.native
  sealed trait linear
    extends StObject
       with ChartAxisScaleType
  
  @js.native
  sealed trait logarithmic
    extends StObject
       with ChartAxisScaleType
}
