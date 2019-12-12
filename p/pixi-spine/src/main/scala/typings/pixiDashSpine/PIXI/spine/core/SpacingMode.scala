package typings.pixiDashSpine.PIXI.spine.core

import org.scalablytyped.runtime.TopLevel
import typings.pixiDashSpine.PIXI.spine.core.SpacingMode.Fixed
import typings.pixiDashSpine.PIXI.spine.core.SpacingMode.Length
import typings.pixiDashSpine.PIXI.spine.core.SpacingMode.Percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpacingMode extends js.Object

@JSGlobal("PIXI.spine.core.SpacingMode")
@js.native
object SpacingMode extends js.Object {
  @js.native
  sealed trait Fixed extends SpacingMode
  
  @js.native
  sealed trait Length extends SpacingMode
  
  @js.native
  sealed trait Percent extends SpacingMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpacingMode with Double] = js.native
  /* 1 */ @js.native
  object Fixed extends TopLevel[Fixed with Double]
  
  /* 0 */ @js.native
  object Length extends TopLevel[Length with Double]
  
  /* 2 */ @js.native
  object Percent extends TopLevel[Percent with Double]
  
}

