package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the parent label strategy of the chart series layout. This only applies to treemap charts
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartParentLabelStrategy")
@js.native
object ChartParentLabelStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartParentLabelStrategy & String] = js.native
  
  /* "Banner" */ val banner: typings.officeJsPreview.Excel.ChartParentLabelStrategy.banner & String = js.native
  
  /* "None" */ val none: typings.officeJsPreview.Excel.ChartParentLabelStrategy.none & String = js.native
  
  /* "Overlapping" */ val overlapping: typings.officeJsPreview.Excel.ChartParentLabelStrategy.overlapping & String = js.native
}
