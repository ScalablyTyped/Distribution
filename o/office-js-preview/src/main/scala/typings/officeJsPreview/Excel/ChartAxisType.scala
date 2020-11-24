package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartAxisType extends js.Object
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisType")
@js.native
object ChartAxisType extends js.Object {
  
  /**
    * Axis displays categories.
    *
    */
  @js.native
  sealed trait category extends ChartAxisType
  
  @js.native
  sealed trait invalid extends ChartAxisType
  
  /**
    * Axis displays data series.
    *
    */
  @js.native
  sealed trait series extends ChartAxisType
  
  /**
    * Axis displays values.
    *
    */
  @js.native
  sealed trait value extends ChartAxisType
}
