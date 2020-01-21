package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartLegendPosition extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartLegendPosition")
@js.native
object ChartLegendPosition extends js.Object {
  @js.native
  sealed trait bottom extends ChartLegendPosition
  
  @js.native
  sealed trait corner extends ChartLegendPosition
  
  @js.native
  sealed trait custom extends ChartLegendPosition
  
  @js.native
  sealed trait invalid extends ChartLegendPosition
  
  @js.native
  sealed trait left extends ChartLegendPosition
  
  @js.native
  sealed trait right extends ChartLegendPosition
  
  @js.native
  sealed trait top extends ChartLegendPosition
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartLegendPosition with String] = js.native
  /* "Bottom" */ @js.native
  object bottom extends TopLevel[bottom with String]
  
  /* "Corner" */ @js.native
  object corner extends TopLevel[corner with String]
  
  /* "Custom" */ @js.native
  object custom extends TopLevel[custom with String]
  
  /* "Invalid" */ @js.native
  object invalid extends TopLevel[invalid with String]
  
  /* "Left" */ @js.native
  object left extends TopLevel[left with String]
  
  /* "Right" */ @js.native
  object right extends TopLevel[right with String]
  
  /* "Top" */ @js.native
  object top extends TopLevel[top with String]
  
}

