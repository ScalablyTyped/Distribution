package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureFilter extends StObject
@JSGlobal("PIXI.spine.core.TextureFilter")
@js.native
object TextureFilter extends StObject {
  
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
}
