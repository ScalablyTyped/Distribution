package typings.phaser.spine

import org.scalablytyped.runtime.TopLevel
import typings.phaser.spine.BlendMode.Additive
import typings.phaser.spine.BlendMode.Multiply
import typings.phaser.spine.BlendMode.Normal
import typings.phaser.spine.BlendMode.Screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendMode extends js.Object

@JSGlobal("spine.BlendMode")
@js.native
object BlendMode extends js.Object {
  @js.native
  sealed trait Additive extends BlendMode
  
  @js.native
  sealed trait Multiply extends BlendMode
  
  @js.native
  sealed trait Normal extends BlendMode
  
  @js.native
  sealed trait Screen extends BlendMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendMode with Double] = js.native
  /* 1 */ @js.native
  object Additive extends TopLevel[Additive with Double]
  
  /* 2 */ @js.native
  object Multiply extends TopLevel[Multiply with Double]
  
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
  /* 3 */ @js.native
  object Screen extends TopLevel[Screen with Double]
  
}

