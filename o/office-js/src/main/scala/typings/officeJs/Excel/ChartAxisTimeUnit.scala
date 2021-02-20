package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartAxisTimeUnit extends StObject
/**
  *
  * Specifies the unit of time for chart axes and data series.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisTimeUnit")
@js.native
object ChartAxisTimeUnit extends StObject {
  
  @js.native
  sealed trait days extends ChartAxisTimeUnit
  
  @js.native
  sealed trait months extends ChartAxisTimeUnit
  
  @js.native
  sealed trait years extends ChartAxisTimeUnit
}
