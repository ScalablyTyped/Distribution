package typings.officeDashJsDashPreview.ExcelNs

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
  sealed trait bringForward extends ShapeZOrder
  
  @js.native
  sealed trait bringToFront extends ShapeZOrder
  
  @js.native
  sealed trait sendBackward extends ShapeZOrder
  
  @js.native
  sealed trait sendToBack extends ShapeZOrder
  
  /* "BringForward" */ val bringForward: typings.officeDashJsDashPreview.ExcelNs.ShapeZOrder.bringForward with String = js.native
  /* "BringToFront" */ val bringToFront: typings.officeDashJsDashPreview.ExcelNs.ShapeZOrder.bringToFront with String = js.native
  /* "SendBackward" */ val sendBackward: typings.officeDashJsDashPreview.ExcelNs.ShapeZOrder.sendBackward with String = js.native
  /* "SendToBack" */ val sendToBack: typings.officeDashJsDashPreview.ExcelNs.ShapeZOrder.sendToBack with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeZOrder with String] = js.native
}

