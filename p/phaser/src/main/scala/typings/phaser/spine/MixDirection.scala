package typings.phaser.spine

import org.scalablytyped.runtime.TopLevel
import typings.phaser.spine.MixDirection.mixIn
import typings.phaser.spine.MixDirection.mixOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MixDirection extends js.Object

@JSGlobal("spine.MixDirection")
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

