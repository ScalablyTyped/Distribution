package typings.officeDashJsDashPreview.Excel

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
  
  /* "Bottom" */ val bottom: typings.officeDashJsDashPreview.Excel.ShapeTextVerticalAlignment.bottom with String = js.native
  /* "Distributed" */ val distributed: typings.officeDashJsDashPreview.Excel.ShapeTextVerticalAlignment.distributed with String = js.native
  /* "Justified" */ val justified: typings.officeDashJsDashPreview.Excel.ShapeTextVerticalAlignment.justified with String = js.native
  /* "Middle" */ val middle: typings.officeDashJsDashPreview.Excel.ShapeTextVerticalAlignment.middle with String = js.native
  /* "Top" */ val top: typings.officeDashJsDashPreview.Excel.ShapeTextVerticalAlignment.top with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeTextVerticalAlignment with String] = js.native
}

