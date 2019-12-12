package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.ChartBinType.auto
import typings.officeDashJsDashPreview.Excel.ChartBinType.binCount
import typings.officeDashJsDashPreview.Excel.ChartBinType.binWidth
import typings.officeDashJsDashPreview.Excel.ChartBinType.category
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartBinType extends js.Object

/**
  *
  * Specifies the bin's type of a histogram chart or pareto chart series.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartBinType")
@js.native
object ChartBinType extends js.Object {
  @js.native
  sealed trait auto extends ChartBinType
  
  @js.native
  sealed trait binCount extends ChartBinType
  
  @js.native
  sealed trait binWidth extends ChartBinType
  
  @js.native
  sealed trait category extends ChartBinType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartBinType with String] = js.native
  /* "Auto" */ @js.native
  object auto extends TopLevel[auto with String]
  
  /* "BinCount" */ @js.native
  object binCount extends TopLevel[binCount with String]
  
  /* "BinWidth" */ @js.native
  object binWidth extends TopLevel[binWidth with String]
  
  /* "Category" */ @js.native
  object category extends TopLevel[category with String]
  
}

