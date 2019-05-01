package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait clip
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalOverflow
  
  @js.native
  sealed trait overflow
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalOverflow
  
  /* "Clip" */ val clip: clip with java.lang.String = js.native
  /* "Overflow" */ val overflow: overflow with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalOverflow with java.lang.String
  ] = js.native
}

