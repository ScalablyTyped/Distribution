package typings.phaser.spine

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PositionMode with Double] = js.native
  /* 0 */ @js.native
  object Fixed extends TopLevel[Fixed with Double]
  
  /* 1 */ @js.native
  object Percent extends TopLevel[Percent with Double]
  
}

