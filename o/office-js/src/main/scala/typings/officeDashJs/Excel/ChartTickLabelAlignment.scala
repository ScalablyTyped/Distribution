package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.ChartTickLabelAlignment.center
import typings.officeDashJs.Excel.ChartTickLabelAlignment.left
import typings.officeDashJs.Excel.ChartTickLabelAlignment.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartTickLabelAlignment extends js.Object

/**
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ChartTickLabelAlignment")
@js.native
object ChartTickLabelAlignment extends js.Object {
  @js.native
  sealed trait center extends ChartTickLabelAlignment
  
  @js.native
  sealed trait left extends ChartTickLabelAlignment
  
  @js.native
  sealed trait right extends ChartTickLabelAlignment
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartTickLabelAlignment with String] = js.native
  /* "Center" */ @js.native
  object center extends TopLevel[center with String]
  
  /* "Left" */ @js.native
  object left extends TopLevel[left with String]
  
  /* "Right" */ @js.native
  object right extends TopLevel[right with String]
  
}

