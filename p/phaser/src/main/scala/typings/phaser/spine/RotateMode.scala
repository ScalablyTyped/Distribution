package typings.phaser.spine

import org.scalablytyped.runtime.TopLevel
import typings.phaser.spine.RotateMode.Chain
import typings.phaser.spine.RotateMode.ChainScale
import typings.phaser.spine.RotateMode.Tangent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RotateMode extends js.Object

@JSGlobal("spine.RotateMode")
@js.native
object RotateMode extends js.Object {
  @js.native
  sealed trait Chain extends RotateMode
  
  @js.native
  sealed trait ChainScale extends RotateMode
  
  @js.native
  sealed trait Tangent extends RotateMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RotateMode with Double] = js.native
  /* 1 */ @js.native
  object Chain extends TopLevel[Chain with Double]
  
  /* 2 */ @js.native
  object ChainScale extends TopLevel[ChainScale with Double]
  
  /* 0 */ @js.native
  object Tangent extends TopLevel[Tangent with Double]
  
}

