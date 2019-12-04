package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextureFilter extends js.Object

@JSGlobal("spine.TextureFilter")
@js.native
object TextureFilter extends js.Object {
  @js.native
  sealed trait Linear extends TextureFilter
  
  @js.native
  sealed trait MipMap extends TextureFilter
  
  @js.native
  sealed trait MipMapLinearLinear extends TextureFilter
  
  @js.native
  sealed trait MipMapLinearNearest extends TextureFilter
  
  @js.native
  sealed trait MipMapNearestLinear extends TextureFilter
  
  @js.native
  sealed trait MipMapNearestNearest extends TextureFilter
  
  @js.native
  sealed trait Nearest extends TextureFilter
  
  /* 9729 */ val Linear: typings.phaser.spine.TextureFilter.Linear with Double = js.native
  /* 9987 */ val MipMap: typings.phaser.spine.TextureFilter.MipMap with Double = js.native
  /* 9987 */ val MipMapLinearLinear: typings.phaser.spine.TextureFilter.MipMapLinearLinear with Double = js.native
  /* 9985 */ val MipMapLinearNearest: typings.phaser.spine.TextureFilter.MipMapLinearNearest with Double = js.native
  /* 9986 */ val MipMapNearestLinear: typings.phaser.spine.TextureFilter.MipMapNearestLinear with Double = js.native
  /* 9984 */ val MipMapNearestNearest: typings.phaser.spine.TextureFilter.MipMapNearestNearest with Double = js.native
  /* 9728 */ val Nearest: typings.phaser.spine.TextureFilter.Nearest with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextureFilter with Double] = js.native
}

