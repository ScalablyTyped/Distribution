package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureFilter extends StObject
@JSGlobal("PIXI.spine.core.TextureFilter")
@js.native
object TextureFilter extends StObject {
  
  @js.native
  sealed trait Linear
    extends StObject
       with TextureFilter
  
  @js.native
  sealed trait MipMap
    extends StObject
       with TextureFilter
  
  @js.native
  sealed trait MipMapLinearLinear
    extends StObject
       with TextureFilter
  
  @js.native
  sealed trait MipMapLinearNearest
    extends StObject
       with TextureFilter
  
  @js.native
  sealed trait MipMapNearestLinear
    extends StObject
       with TextureFilter
  
  @js.native
  sealed trait MipMapNearestNearest
    extends StObject
       with TextureFilter
  
  @js.native
  sealed trait Nearest
    extends StObject
       with TextureFilter
}
