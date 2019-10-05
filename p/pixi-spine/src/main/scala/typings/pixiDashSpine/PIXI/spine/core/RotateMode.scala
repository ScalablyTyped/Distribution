package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RotateMode extends js.Object

@JSGlobal("PIXI.spine.core.RotateMode")
@js.native
object RotateMode extends js.Object {
  @js.native
  sealed trait Chain extends RotateMode
  
  @js.native
  sealed trait ChainScale extends RotateMode
  
  @js.native
  sealed trait Tangent extends RotateMode
  
  /* 1 */ val Chain: typings.pixiDashSpine.PIXI.spine.core.RotateMode.Chain with Double = js.native
  /* 2 */ val ChainScale: typings.pixiDashSpine.PIXI.spine.core.RotateMode.ChainScale with Double = js.native
  /* 0 */ val Tangent: typings.pixiDashSpine.PIXI.spine.core.RotateMode.Tangent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RotateMode with Double] = js.native
}

