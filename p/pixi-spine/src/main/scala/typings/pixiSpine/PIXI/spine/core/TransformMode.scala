package typings.pixiSpine.PIXI.spine.core

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
  
}

