package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.ChartAxisTickLabelPosition.high
import typings.officeDashJsDashPreview.Excel.ChartAxisTickLabelPosition.low
import typings.officeDashJsDashPreview.Excel.ChartAxisTickLabelPosition.nextToAxis
import typings.officeDashJsDashPreview.Excel.ChartAxisTickLabelPosition.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisTickLabelPosition extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisTickLabelPosition")
@js.native
object ChartAxisTickLabelPosition extends js.Object {
  @js.native
  sealed trait high extends ChartAxisTickLabelPosition
  
  @js.native
  sealed trait low extends ChartAxisTickLabelPosition
  
  @js.native
  sealed trait nextToAxis extends ChartAxisTickLabelPosition
  
  @js.native
  sealed trait none extends ChartAxisTickLabelPosition
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisTickLabelPosition with String] = js.native
  /* "High" */ @js.native
  object high extends TopLevel[high with String]
  
  /* "Low" */ @js.native
  object low extends TopLevel[low with String]
  
  /* "NextToAxis" */ @js.native
  object nextToAxis extends TopLevel[nextToAxis with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
}

