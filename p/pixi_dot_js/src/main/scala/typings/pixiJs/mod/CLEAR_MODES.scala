package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("pixi.js", "CLEAR_MODES")
@js.native
object CLEAR_MODES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.CLEAR_MODES & Double] = js.native
  
  /* 5 */ val AUTO: typings.pixiJs.PIXI.CLEAR_MODES.AUTO & Double = js.native
  
  /* 0 */ val BLEND: typings.pixiJs.PIXI.CLEAR_MODES.BLEND & Double = js.native
  
  /* 2 */ val BLIT: typings.pixiJs.PIXI.CLEAR_MODES.BLIT & Double = js.native
  
  /* 1 */ val CLEAR: typings.pixiJs.PIXI.CLEAR_MODES.CLEAR & Double = js.native
  
  /* 3 */ val NO: typings.pixiJs.PIXI.CLEAR_MODES.NO & Double = js.native
  
  /* 4 */ val YES: typings.pixiJs.PIXI.CLEAR_MODES.YES & Double = js.native
}
