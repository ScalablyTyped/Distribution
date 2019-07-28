package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextVerticalAlignment extends js.Object

/**
  *
  * Specifies the vertical alignment for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextVerticalAlignment")
@js.native
object ShapeTextVerticalAlignment extends js.Object {
  @js.native
  sealed trait bottom extends ShapeTextVerticalAlignment
  
  @js.native
  sealed trait distributed extends ShapeTextVerticalAlignment
  
  @js.native
  sealed trait justified extends ShapeTextVerticalAlignment
  
  @js.native
  sealed trait middle extends ShapeTextVerticalAlignment
  
  @js.native
  sealed trait top extends ShapeTextVerticalAlignment
  
  /* "Bottom" */ val bottom: typings.officeDashJs.ExcelNs.ShapeTextVerticalAlignment.bottom with String = js.native
  /* "Distributed" */ val distributed: typings.officeDashJs.ExcelNs.ShapeTextVerticalAlignment.distributed with String = js.native
  /* "Justified" */ val justified: typings.officeDashJs.ExcelNs.ShapeTextVerticalAlignment.justified with String = js.native
  /* "Middle" */ val middle: typings.officeDashJs.ExcelNs.ShapeTextVerticalAlignment.middle with String = js.native
  /* "Top" */ val top: typings.officeDashJs.ExcelNs.ShapeTextVerticalAlignment.top with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeTextVerticalAlignment with String] = js.native
}

