package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureFilter extends StObject
@JSImport("@pixi-spine/base", "TextureFilter")
@js.native
object TextureFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextureFilter & Double] = js.native
  
  @js.native
  sealed trait Linear
    extends StObject
       with TextureFilter
  /* 9729 */ val Linear: typings.pixiSpineBase.mod.TextureFilter.Linear & Double = js.native
  
  @js.native
  sealed trait MipMap
    extends StObject
       with TextureFilter
  /* 9987 */ val MipMap: typings.pixiSpineBase.mod.TextureFilter.MipMap & Double = js.native
  
  @js.native
  sealed trait MipMapLinearLinear
    extends StObject
       with TextureFilter
  /* 9987 */ val MipMapLinearLinear: typings.pixiSpineBase.mod.TextureFilter.MipMapLinearLinear & Double = js.native
  
  @js.native
  sealed trait MipMapLinearNearest
    extends StObject
       with TextureFilter
  /* 9985 */ val MipMapLinearNearest: typings.pixiSpineBase.mod.TextureFilter.MipMapLinearNearest & Double = js.native
  
  @js.native
  sealed trait MipMapNearestLinear
    extends StObject
       with TextureFilter
  /* 9986 */ val MipMapNearestLinear: typings.pixiSpineBase.mod.TextureFilter.MipMapNearestLinear & Double = js.native
  
  @js.native
  sealed trait MipMapNearestNearest
    extends StObject
       with TextureFilter
  /* 9984 */ val MipMapNearestNearest: typings.pixiSpineBase.mod.TextureFilter.MipMapNearestNearest & Double = js.native
  
  @js.native
  sealed trait Nearest
    extends StObject
       with TextureFilter
  /* 9728 */ val Nearest: typings.pixiSpineBase.mod.TextureFilter.Nearest & Double = js.native
}
