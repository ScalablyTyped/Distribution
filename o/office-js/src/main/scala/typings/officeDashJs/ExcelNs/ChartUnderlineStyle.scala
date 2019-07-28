package typings.officeDashJs.ExcelNs

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
  
  /* "None" */ val none: typings.officeDashJs.ExcelNs.ChartUnderlineStyle.none with String = js.native
  /* "Single" */ val single: typings.officeDashJs.ExcelNs.ChartUnderlineStyle.single with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartUnderlineStyle with String] = js.native
}

