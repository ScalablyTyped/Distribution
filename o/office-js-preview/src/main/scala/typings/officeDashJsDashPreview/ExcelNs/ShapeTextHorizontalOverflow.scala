package typings.officeDashJsDashPreview.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextHorizontalOverflow extends js.Object

/**
  *
  * Specifies the horizontal overflow for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextHorizontalOverflow")
@js.native
object ShapeTextHorizontalOverflow extends js.Object {
  @js.native
  sealed trait clip extends ShapeTextHorizontalOverflow
  
  @js.native
  sealed trait overflow extends ShapeTextHorizontalOverflow
  
  /* "Clip" */ val clip: typings.officeDashJsDashPreview.ExcelNs.ShapeTextHorizontalOverflow.clip with String = js.native
  /* "Overflow" */ val overflow: typings.officeDashJsDashPreview.ExcelNs.ShapeTextHorizontalOverflow.overflow with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeTextHorizontalOverflow with String] = js.native
}

