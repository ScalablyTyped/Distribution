package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
