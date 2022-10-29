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
  
  @js.native
  sealed trait NO_PREMULTIPLIED_ALPHA
    extends StObject
       with ALPHA_MODES
  /* 0 */ val NO_PREMULTIPLIED_ALPHA: typings.pixiConstants.mod.ALPHA_MODES.NO_PREMULTIPLIED_ALPHA & Double = js.native
  
  @js.native
  sealed trait NPM
    extends StObject
       with ALPHA_MODES
  /* 0 */ val NPM: typings.pixiConstants.mod.ALPHA_MODES.NPM & Double = js.native
  
  @js.native
  sealed trait PMA
    extends StObject
       with ALPHA_MODES
  /* 2 */ val PMA: typings.pixiConstants.mod.ALPHA_MODES.PMA & Double = js.native
  
  @js.native
  sealed trait PREMULTIPLIED_ALPHA
    extends StObject
       with ALPHA_MODES
  /* 2 */ val PREMULTIPLIED_ALPHA: typings.pixiConstants.mod.ALPHA_MODES.PREMULTIPLIED_ALPHA & Double = js.native
  
  @js.native
  sealed trait PREMULTIPLY_ON_UPLOAD
    extends StObject
       with ALPHA_MODES
  /* 1 */ val PREMULTIPLY_ON_UPLOAD: typings.pixiConstants.mod.ALPHA_MODES.PREMULTIPLY_ON_UPLOAD & Double = js.native
  
  @js.native
  sealed trait UNPACK
    extends StObject
       with ALPHA_MODES
  /* 1 */ val UNPACK: typings.pixiConstants.mod.ALPHA_MODES.UNPACK & Double = js.native
}
