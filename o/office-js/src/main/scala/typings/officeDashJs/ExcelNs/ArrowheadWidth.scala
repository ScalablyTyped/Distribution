package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowheadWidth extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ArrowheadWidth")
@js.native
object ArrowheadWidth extends js.Object {
  @js.native
  sealed trait medium extends ArrowheadWidth
  
  @js.native
  sealed trait narrow extends ArrowheadWidth
  
  @js.native
  sealed trait wide extends ArrowheadWidth
  
  /* "Medium" */ val medium: typings.officeDashJs.ExcelNs.ArrowheadWidth.medium with String = js.native
  /* "Narrow" */ val narrow: typings.officeDashJs.ExcelNs.ArrowheadWidth.narrow with String = js.native
  /* "Wide" */ val wide: typings.officeDashJs.ExcelNs.ArrowheadWidth.wide with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ArrowheadWidth with String] = js.native
}

