package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.ChartUnderlineStyle.none
import typings.officeDashJs.Excel.ChartUnderlineStyle.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartUnderlineStyle extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartUnderlineStyle")
@js.native
object ChartUnderlineStyle extends js.Object {
  @js.native
  sealed trait none extends ChartUnderlineStyle
  
  @js.native
  sealed trait single extends ChartUnderlineStyle
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartUnderlineStyle with String] = js.native
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "Single" */ @js.native
  object single extends TopLevel[single with String]
  
}

