package typings.phaser.spine

import org.scalablytyped.runtime.TopLevel
import typings.phaser.spine.TransformMode.NoRotationOrReflection
import typings.phaser.spine.TransformMode.NoScale
import typings.phaser.spine.TransformMode.NoScaleOrReflection
import typings.phaser.spine.TransformMode.Normal
import typings.phaser.spine.TransformMode.OnlyTranslation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransformMode extends js.Object

@JSGlobal("spine.TransformMode")
@js.native
object TransformMode extends js.Object {
  @js.native
  sealed trait NoRotationOrReflection extends TransformMode
  
  @js.native
  sealed trait NoScale extends TransformMode
  
  @js.native
  sealed trait NoScaleOrReflection extends TransformMode
  
  @js.native
  sealed trait Normal extends TransformMode
  
  @js.native
  sealed trait OnlyTranslation extends TransformMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransformMode with Double] = js.native
  /* 2 */ @js.native
  object NoRotationOrReflection extends TopLevel[NoRotationOrReflection with Double]
  
  /* 3 */ @js.native
  object NoScale extends TopLevel[NoScale with Double]
  
  /* 4 */ @js.native
  object NoScaleOrReflection extends TopLevel[NoScaleOrReflection with Double]
  
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
  /* 1 */ @js.native
  object OnlyTranslation extends TopLevel[OnlyTranslation with Double]
  
}

