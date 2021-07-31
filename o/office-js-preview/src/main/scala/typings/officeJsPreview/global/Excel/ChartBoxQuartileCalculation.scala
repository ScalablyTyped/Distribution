package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the quartile calculation type of chart series layout. Only applies to a box and whisker chart.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartBoxQuartileCalculation")
@js.native
object ChartBoxQuartileCalculation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartBoxQuartileCalculation & String] = js.native
  
  /* "Exclusive" */ val exclusive: typings.officeJsPreview.Excel.ChartBoxQuartileCalculation.exclusive & String = js.native
  
  /* "Inclusive" */ val inclusive: typings.officeJsPreview.Excel.ChartBoxQuartileCalculation.inclusive & String = js.native
}
