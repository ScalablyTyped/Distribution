package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureWrap extends StObject
@JSImport("@pixi-spine/base", "TextureWrap")
@js.native
object TextureWrap extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextureWrap & Double] = js.native
  
  @js.native
  sealed trait ClampToEdge
    extends StObject
       with TextureWrap
  /* 33071 */ val ClampToEdge: typings.pixiSpineBase.mod.TextureWrap.ClampToEdge & Double = js.native
  
  @js.native
  sealed trait MirroredRepeat
    extends StObject
       with TextureWrap
  /* 33648 */ val MirroredRepeat: typings.pixiSpineBase.mod.TextureWrap.MirroredRepeat & Double = js.native
  
  @js.native
  sealed trait Repeat
    extends StObject
       with TextureWrap
  /* 10497 */ val Repeat: typings.pixiSpineBase.mod.TextureWrap.Repeat & Double = js.native
}
