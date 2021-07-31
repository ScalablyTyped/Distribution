package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureWrap extends StObject
@JSGlobal("spine.TextureWrap")
@js.native
object TextureWrap extends StObject {
  
  @js.native
  sealed trait ClampToEdge
    extends StObject
       with TextureWrap
  
  @js.native
  sealed trait MirroredRepeat
    extends StObject
       with TextureWrap
  
  @js.native
  sealed trait Repeat
    extends StObject
       with TextureWrap
}
