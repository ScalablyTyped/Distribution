package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.SortOn.cellColor
import typings.officeDashJsDashPreview.Excel.SortOn.fontColor
import typings.officeDashJsDashPreview.Excel.SortOn.icon
import typings.officeDashJsDashPreview.Excel.SortOn.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOn extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.SortOn")
@js.native
object SortOn extends js.Object {
  @js.native
  sealed trait cellColor extends SortOn
  
  @js.native
  sealed trait fontColor extends SortOn
  
  @js.native
  sealed trait icon extends SortOn
  
  @js.native
  sealed trait value extends SortOn
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortOn with String] = js.native
  /* "CellColor" */ @js.native
  object cellColor extends TopLevel[cellColor with String]
  
  /* "FontColor" */ @js.native
  object fontColor extends TopLevel[fontColor with String]
  
  /* "Icon" */ @js.native
  object icon extends TopLevel[icon with String]
  
  /* "Value" */ @js.native
  object value extends TopLevel[value with String]
  
}

