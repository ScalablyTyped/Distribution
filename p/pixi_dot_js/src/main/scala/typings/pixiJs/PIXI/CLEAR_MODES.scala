package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CLEAR_MODES extends StObject
/**
  * How to clear renderTextures in filter
  *
  * @name CLEAR_MODES
  * @memberof PIXI
  * @static
  * @enum {number}
  * @property {number} BLEND - Preserve the information in the texture, blend above
  * @property {number} CLEAR - Must use `gl.clear` operation
  * @property {number} BLIT - Clear or blit it, depends on device and level of paranoia
  * @property {number} NO - Alias for BLEND, same as `false` in earlier versions
  * @property {number} YES - Alias for CLEAR, same as `true` in earlier versions
  * @property {number} AUTO - Alias for BLIT
  */
@JSGlobal("PIXI.CLEAR_MODES")
@js.native
object CLEAR_MODES extends StObject {
  
  @js.native
  sealed trait AUTO
    extends StObject
       with CLEAR_MODES
  
  @js.native
  sealed trait BLEND
    extends StObject
       with CLEAR_MODES
  
  @js.native
  sealed trait BLIT
    extends StObject
       with CLEAR_MODES
  
  @js.native
  sealed trait CLEAR
    extends StObject
       with CLEAR_MODES
  
  @js.native
  sealed trait NO
    extends StObject
       with CLEAR_MODES
  
  @js.native
  sealed trait YES
    extends StObject
       with CLEAR_MODES
}
