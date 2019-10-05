package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowheadLength extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ArrowheadLength")
@js.native
object ArrowheadLength extends js.Object {
  @js.native
  sealed trait long extends ArrowheadLength
  
  @js.native
  sealed trait medium extends ArrowheadLength
  
  @js.native
  sealed trait short extends ArrowheadLength
  
  /* "Long" */ val long: typings.officeDashJs.Excel.ArrowheadLength.long with String = js.native
  /* "Medium" */ val medium: typings.officeDashJs.Excel.ArrowheadLength.medium with String = js.native
  /* "Short" */ val short: typings.officeDashJs.Excel.ArrowheadLength.short with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ArrowheadLength with String] = js.native
}

