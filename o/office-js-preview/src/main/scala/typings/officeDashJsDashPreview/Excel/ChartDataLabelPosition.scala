package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartDataLabelPosition extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartDataLabelPosition")
@js.native
object ChartDataLabelPosition extends js.Object {
  @js.native
  sealed trait bestFit extends ChartDataLabelPosition
  
  @js.native
  sealed trait bottom extends ChartDataLabelPosition
  
  @js.native
  sealed trait callout extends ChartDataLabelPosition
  
  @js.native
  sealed trait center extends ChartDataLabelPosition
  
  @js.native
  sealed trait insideBase extends ChartDataLabelPosition
  
  @js.native
  sealed trait insideEnd extends ChartDataLabelPosition
  
  @js.native
  sealed trait invalid extends ChartDataLabelPosition
  
  @js.native
  sealed trait left extends ChartDataLabelPosition
  
  @js.native
  sealed trait none extends ChartDataLabelPosition
  
  @js.native
  sealed trait outsideEnd extends ChartDataLabelPosition
  
  @js.native
  sealed trait right extends ChartDataLabelPosition
  
  @js.native
  sealed trait top extends ChartDataLabelPosition
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartDataLabelPosition with String] = js.native
  /* "BestFit" */ @js.native
  object bestFit extends TopLevel[bestFit with String]
  
  /* "Bottom" */ @js.native
  object bottom extends TopLevel[bottom with String]
  
  /* "Callout" */ @js.native
  object callout extends TopLevel[callout with String]
  
  /* "Center" */ @js.native
  object center extends TopLevel[center with String]
  
  /* "InsideBase" */ @js.native
  object insideBase extends TopLevel[insideBase with String]
  
  /* "InsideEnd" */ @js.native
  object insideEnd extends TopLevel[insideEnd with String]
  
  /* "Invalid" */ @js.native
  object invalid extends TopLevel[invalid with String]
  
  /* "Left" */ @js.native
  object left extends TopLevel[left with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "OutsideEnd" */ @js.native
  object outsideEnd extends TopLevel[outsideEnd with String]
  
  /* "Right" */ @js.native
  object right extends TopLevel[right with String]
  
  /* "Top" */ @js.native
  object top extends TopLevel[top with String]
  
}

