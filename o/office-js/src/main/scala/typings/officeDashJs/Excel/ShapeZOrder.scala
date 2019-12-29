package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeZOrder with String] = js.native
  /* "BringForward" */ @js.native
  object bringForward extends TopLevel[bringForward with String]
  
  /* "BringToFront" */ @js.native
  object bringToFront extends TopLevel[bringToFront with String]
  
  /* "SendBackward" */ @js.native
  object sendBackward extends TopLevel[sendBackward with String]
  
  /* "SendToBack" */ @js.native
  object sendToBack extends TopLevel[sendToBack with String]
  
}

