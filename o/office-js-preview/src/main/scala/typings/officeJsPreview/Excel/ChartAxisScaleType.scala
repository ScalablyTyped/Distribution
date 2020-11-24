package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartAxisScaleType extends js.Object
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisScaleType")
@js.native
object ChartAxisScaleType extends js.Object {
  
  @js.native
  sealed trait linear extends ChartAxisScaleType
  
  @js.native
  sealed trait logarithmic extends ChartAxisScaleType
}
