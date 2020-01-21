package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MixBlend extends js.Object

@JSGlobal("PIXI.spine.core.MixBlend")
@js.native
object MixBlend extends js.Object {
  @js.native
  sealed trait add extends MixBlend
  
  @js.native
  sealed trait first extends MixBlend
  
  @js.native
  sealed trait replace extends MixBlend
  
  @js.native
  sealed trait setup extends MixBlend
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MixBlend with Double] = js.native
  /* 3 */ @js.native
  object add extends TopLevel[add with Double]
  
  /* 1 */ @js.native
  object first extends TopLevel[first with Double]
  
  /* 2 */ @js.native
  object replace extends TopLevel[replace with Double]
  
  /* 0 */ @js.native
  object setup extends TopLevel[setup with Double]
  
}

