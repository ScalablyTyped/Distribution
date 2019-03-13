package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeZOrder extends js.Object

/**
  *
  * Specifies where in the z-order a shape should be moved relative to other shapes.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ShapeZOrder")
@js.native
object ShapeZOrder extends js.Object {
  @js.native
  sealed trait bringForward
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeZOrder
  
  @js.native
  sealed trait bringToFront
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeZOrder
  
  @js.native
  sealed trait sendBackward
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeZOrder
  
  @js.native
  sealed trait sendToBack
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeZOrder
  
  /* "BringForward" */ val bringForward: bringForward with java.lang.String = js.native
  /* "BringToFront" */ val bringToFront: bringToFront with java.lang.String = js.native
  /* "SendBackward" */ val sendBackward: sendBackward with java.lang.String = js.native
  /* "SendToBack" */ val sendToBack: sendToBack with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ShapeZOrder with java.lang.String] = js.native
}

