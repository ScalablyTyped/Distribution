package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendMode extends js.Object

@JSGlobal("PIXI.spine.core.BlendMode")
@js.native
object BlendMode extends js.Object {
  @js.native
  sealed trait Additive extends BlendMode
  
  @js.native
  sealed trait Multiply extends BlendMode
  
  @js.native
  sealed trait Normal extends BlendMode
  
  @js.native
  sealed trait Screen extends BlendMode
  
  /* 1 */ val Additive: typings.pixiDashSpine.PIXI.spine.core.BlendMode.Additive with Double = js.native
  /* 2 */ val Multiply: typings.pixiDashSpine.PIXI.spine.core.BlendMode.Multiply with Double = js.native
  /* 0 */ val Normal: typings.pixiDashSpine.PIXI.spine.core.BlendMode.Normal with Double = js.native
  /* 3 */ val Screen: typings.pixiDashSpine.PIXI.spine.core.BlendMode.Screen with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendMode with Double] = js.native
}

