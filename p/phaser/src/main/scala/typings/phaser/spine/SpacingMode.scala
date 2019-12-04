package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpacingMode extends js.Object

@JSGlobal("spine.SpacingMode")
@js.native
object SpacingMode extends js.Object {
  @js.native
  sealed trait Fixed extends SpacingMode
  
  @js.native
  sealed trait Length extends SpacingMode
  
  @js.native
  sealed trait Percent extends SpacingMode
  
  /* 1 */ val Fixed: typings.phaser.spine.SpacingMode.Fixed with Double = js.native
  /* 0 */ val Length: typings.phaser.spine.SpacingMode.Length with Double = js.native
  /* 2 */ val Percent: typings.phaser.spine.SpacingMode.Percent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpacingMode with Double] = js.native
}

