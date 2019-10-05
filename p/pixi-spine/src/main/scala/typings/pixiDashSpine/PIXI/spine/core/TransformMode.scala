package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransformMode extends js.Object

@JSGlobal("PIXI.spine.core.TransformMode")
@js.native
object TransformMode extends js.Object {
  @js.native
  sealed trait NoRotationOrReflection extends TransformMode
  
  @js.native
  sealed trait NoScale extends TransformMode
  
  @js.native
  sealed trait NoScaleOrReflection extends TransformMode
  
  @js.native
  sealed trait Normal extends TransformMode
  
  @js.native
  sealed trait OnlyTranslation extends TransformMode
  
  /* 2 */ val NoRotationOrReflection: typings.pixiDashSpine.PIXI.spine.core.TransformMode.NoRotationOrReflection with Double = js.native
  /* 3 */ val NoScale: typings.pixiDashSpine.PIXI.spine.core.TransformMode.NoScale with Double = js.native
  /* 4 */ val NoScaleOrReflection: typings.pixiDashSpine.PIXI.spine.core.TransformMode.NoScaleOrReflection with Double = js.native
  /* 0 */ val Normal: typings.pixiDashSpine.PIXI.spine.core.TransformMode.Normal with Double = js.native
  /* 1 */ val OnlyTranslation: typings.pixiDashSpine.PIXI.spine.core.TransformMode.OnlyTranslation with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransformMode with Double] = js.native
}

