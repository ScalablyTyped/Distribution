package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeZOrder extends js.Object

/**
  *
  * Specifies where in the z-order a shape should be moved relative to other shapes.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeZOrder")
@js.native
object ShapeZOrder extends js.Object {
  @js.native
  sealed trait bringForward
    extends officeDashJsLib.ExcelNs.ShapeZOrder
  
  @js.native
  sealed trait bringToFront
    extends officeDashJsLib.ExcelNs.ShapeZOrder
  
  @js.native
  sealed trait sendBackward
    extends officeDashJsLib.ExcelNs.ShapeZOrder
  
  @js.native
  sealed trait sendToBack
    extends officeDashJsLib.ExcelNs.ShapeZOrder
  
  /* "BringForward" */ val bringForward: bringForward with java.lang.String = js.native
  /* "BringToFront" */ val bringToFront: bringToFront with java.lang.String = js.native
  /* "SendBackward" */ val sendBackward: sendBackward with java.lang.String = js.native
  /* "SendToBack" */ val sendToBack: sendToBack with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ShapeZOrder with java.lang.String] = js.native
}

