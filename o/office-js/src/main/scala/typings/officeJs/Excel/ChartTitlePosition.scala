package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartTitlePosition extends js.Object

/**
  *
  * Represents the position of chart title.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTitlePosition")
@js.native
object ChartTitlePosition extends js.Object {
  @js.native
  sealed trait automatic extends ChartTitlePosition
  
  @js.native
  sealed trait bottom extends ChartTitlePosition
  
  @js.native
  sealed trait left extends ChartTitlePosition
  
  @js.native
  sealed trait right extends ChartTitlePosition
  
  @js.native
  sealed trait top extends ChartTitlePosition
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartTitlePosition with String] = js.native
  /* "Automatic" */ @js.native
  object automatic extends TopLevel[automatic with String]
  
  /* "Bottom" */ @js.native
  object bottom extends TopLevel[bottom with String]
  
  /* "Left" */ @js.native
  object left extends TopLevel[left with String]
  
  /* "Right" */ @js.native
  object right extends TopLevel[right with String]
  
  /* "Top" */ @js.native
  object top extends TopLevel[top with String]
  
}

