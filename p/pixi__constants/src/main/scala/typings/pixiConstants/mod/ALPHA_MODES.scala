package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ALPHA_MODES extends StObject
@JSImport("@pixi/constants", "ALPHA_MODES")
@js.native
object ALPHA_MODES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ALPHA_MODES & Double] = js.native
  
  /**
    * Source is not premultiplied, leave it like that.
    * Option for compressed and data textures that are created from typed arrays.
    * @type {number}
    * @default 0
    */
  @js.native
  sealed trait NO_PREMULTIPLIED_ALPHA
    extends StObject
       with ALPHA_MODES
  /* 0 */ val NO_PREMULTIPLIED_ALPHA: typings.pixiConstants.mod.ALPHA_MODES.NO_PREMULTIPLIED_ALPHA & Double = js.native
  
  /**
    * Alias for NO_PREMULTIPLIED_ALPHA.
    * @type {number}
    * @default 0
    */
  @js.native
  sealed trait NPM
    extends StObject
       with ALPHA_MODES
  /* 0 */ val NPM: typings.pixiConstants.mod.ALPHA_MODES.NPM & Double = js.native
  
  /**
    * Alias for PREMULTIPLIED_ALPHA.
    * @type {number}
    * @default 2
    */
  @js.native
  sealed trait PMA
    extends StObject
       with ALPHA_MODES
  /* 2 */ val PMA: typings.pixiConstants.mod.ALPHA_MODES.PMA & Double = js.native
  
  /**
    * Source is already premultiplied. Example: spine atlases with `_pma` suffix.
    * @type {number}
    * @default 2
    */
  @js.native
  sealed trait PREMULTIPLIED_ALPHA
    extends StObject
       with ALPHA_MODES
  /* 2 */ val PREMULTIPLIED_ALPHA: typings.pixiConstants.mod.ALPHA_MODES.PREMULTIPLIED_ALPHA & Double = js.native
  
  /**
    * Source is not premultiplied, premultiply on upload.
    * Default option, used for all loaded images.
    * @type {number}
    * @default 1
    */
  @js.native
  sealed trait PREMULTIPLY_ON_UPLOAD
    extends StObject
       with ALPHA_MODES
  /* 1 */ val PREMULTIPLY_ON_UPLOAD: typings.pixiConstants.mod.ALPHA_MODES.PREMULTIPLY_ON_UPLOAD & Double = js.native
  
  /**
    * Default option, alias for PREMULTIPLY_ON_UPLOAD.
    * @type {number}
    * @default 1
    */
  @js.native
  sealed trait UNPACK
    extends StObject
       with ALPHA_MODES
  /* 1 */ val UNPACK: typings.pixiConstants.mod.ALPHA_MODES.UNPACK & Double = js.native
}
