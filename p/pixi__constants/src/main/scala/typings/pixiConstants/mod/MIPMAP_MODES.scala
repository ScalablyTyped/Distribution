package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MIPMAP_MODES extends StObject
@JSImport("@pixi/constants", "MIPMAP_MODES")
@js.native
object MIPMAP_MODES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MIPMAP_MODES & Double] = js.native
  
  /**
    * No mipmaps.
    * @default 0
    */
  @js.native
  sealed trait OFF
    extends StObject
       with MIPMAP_MODES
  /* 0 */ val OFF: typings.pixiConstants.mod.MIPMAP_MODES.OFF & Double = js.native
  
  /**
    * Always generate mipmaps.
    * @default 2
    */
  @js.native
  sealed trait ON
    extends StObject
       with MIPMAP_MODES
  /* 2 */ val ON: typings.pixiConstants.mod.MIPMAP_MODES.ON & Double = js.native
  
  /**
    * Use mipmaps, but do not auto-generate them.
    * this is used with a resource that supports buffering each level-of-detail.
    * @default 3
    */
  @js.native
  sealed trait ON_MANUAL
    extends StObject
       with MIPMAP_MODES
  /* 3 */ val ON_MANUAL: typings.pixiConstants.mod.MIPMAP_MODES.ON_MANUAL & Double = js.native
  
  /**
    * Generate mipmaps if texture dimensions are powers of 2.
    * @default 1
    */
  @js.native
  sealed trait POW2
    extends StObject
       with MIPMAP_MODES
  /* 1 */ val POW2: typings.pixiConstants.mod.MIPMAP_MODES.POW2 & Double = js.native
}
