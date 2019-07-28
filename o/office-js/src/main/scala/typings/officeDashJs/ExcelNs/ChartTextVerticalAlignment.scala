package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartTextVerticalAlignment extends js.Object

/**
  *
  * Represents the vertical alignment for the specified object.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTextVerticalAlignment")
@js.native
object ChartTextVerticalAlignment extends js.Object {
  @js.native
  sealed trait bottom extends ChartTextVerticalAlignment
  
  @js.native
  sealed trait center extends ChartTextVerticalAlignment
  
  @js.native
  sealed trait distributed extends ChartTextVerticalAlignment
  
  @js.native
  sealed trait justify extends ChartTextVerticalAlignment
  
  @js.native
  sealed trait top extends ChartTextVerticalAlignment
  
  /* "Bottom" */ val bottom: typings.officeDashJs.ExcelNs.ChartTextVerticalAlignment.bottom with String = js.native
  /* "Center" */ val center: typings.officeDashJs.ExcelNs.ChartTextVerticalAlignment.center with String = js.native
  /* "Distributed" */ val distributed: typings.officeDashJs.ExcelNs.ChartTextVerticalAlignment.distributed with String = js.native
  /* "Justify" */ val justify: typings.officeDashJs.ExcelNs.ChartTextVerticalAlignment.justify with String = js.native
  /* "Top" */ val top: typings.officeDashJs.ExcelNs.ChartTextVerticalAlignment.top with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartTextVerticalAlignment with String] = js.native
}

