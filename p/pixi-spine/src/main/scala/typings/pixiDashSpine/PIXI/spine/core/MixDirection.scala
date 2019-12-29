package typings.pixiDashSpine.PIXI.spine.core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MixDirection extends js.Object

@JSGlobal("PIXI.spine.core.MixDirection")
@js.native
object MixDirection extends js.Object {
  @js.native
  sealed trait mixIn extends MixDirection
  
  @js.native
  sealed trait mixOut extends MixDirection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MixDirection with Double] = js.native
  /* 0 */ @js.native
  object mixIn extends TopLevel[mixIn with Double]
  
  /* 1 */ @js.native
  object mixOut extends TopLevel[mixOut with Double]
  
}

