package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionMode extends js.Object

@JSGlobal("spine.PositionMode")
@js.native
object PositionMode extends js.Object {
  @js.native
  sealed trait Fixed extends PositionMode
  
  @js.native
  sealed trait Percent extends PositionMode
  
  /* 0 */ val Fixed: typings.phaser.spine.PositionMode.Fixed with Double = js.native
  /* 1 */ val Percent: typings.phaser.spine.PositionMode.Percent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PositionMode with Double] = js.native
}

