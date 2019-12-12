package typings.pixiDashSpine.PIXI.spine.core

import org.scalablytyped.runtime.TopLevel
import typings.pixiDashSpine.PIXI.spine.core.TextureFilter.Linear
import typings.pixiDashSpine.PIXI.spine.core.TextureFilter.MipMap
import typings.pixiDashSpine.PIXI.spine.core.TextureFilter.MipMapLinearLinear
import typings.pixiDashSpine.PIXI.spine.core.TextureFilter.MipMapLinearNearest
import typings.pixiDashSpine.PIXI.spine.core.TextureFilter.MipMapNearestLinear
import typings.pixiDashSpine.PIXI.spine.core.TextureFilter.MipMapNearestNearest
import typings.pixiDashSpine.PIXI.spine.core.TextureFilter.Nearest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextureFilter extends js.Object

@JSGlobal("PIXI.spine.core.TextureFilter")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextureFilter with Double] = js.native
  /* 9729 */ @js.native
  object Linear extends TopLevel[Linear with Double]
  
  /* 9987 */ @js.native
  object MipMap extends TopLevel[MipMap with Double]
  
  /* 9987 */ @js.native
  object MipMapLinearLinear extends TopLevel[MipMapLinearLinear with Double]
  
  /* 9985 */ @js.native
  object MipMapLinearNearest extends TopLevel[MipMapLinearNearest with Double]
  
  /* 9986 */ @js.native
  object MipMapNearestLinear extends TopLevel[MipMapNearestLinear with Double]
  
  /* 9984 */ @js.native
  object MipMapNearestNearest extends TopLevel[MipMapNearestNearest with Double]
  
  /* 9728 */ @js.native
  object Nearest extends TopLevel[Nearest with Double]
  
}

