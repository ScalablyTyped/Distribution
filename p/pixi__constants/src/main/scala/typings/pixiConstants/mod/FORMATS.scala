package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FORMATS extends StObject
@JSImport("@pixi/constants", "FORMATS")
@js.native
object FORMATS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FORMATS & Double] = js.native
  
  @js.native
  sealed trait ALPHA
    extends StObject
       with FORMATS
  /* 6406 */ val ALPHA: typings.pixiConstants.mod.FORMATS.ALPHA & Double = js.native
  
  @js.native
  sealed trait DEPTH_COMPONENT
    extends StObject
       with FORMATS
  /* 6402 */ val DEPTH_COMPONENT: typings.pixiConstants.mod.FORMATS.DEPTH_COMPONENT & Double = js.native
  
  @js.native
  sealed trait DEPTH_STENCIL
    extends StObject
       with FORMATS
  /* 34041 */ val DEPTH_STENCIL: typings.pixiConstants.mod.FORMATS.DEPTH_STENCIL & Double = js.native
  
  @js.native
  sealed trait LUMINANCE
    extends StObject
       with FORMATS
  /* 6409 */ val LUMINANCE: typings.pixiConstants.mod.FORMATS.LUMINANCE & Double = js.native
  
  @js.native
  sealed trait LUMINANCE_ALPHA
    extends StObject
       with FORMATS
  /* 6410 */ val LUMINANCE_ALPHA: typings.pixiConstants.mod.FORMATS.LUMINANCE_ALPHA & Double = js.native
  
  @js.native
  sealed trait RED
    extends StObject
       with FORMATS
  /* 6403 */ val RED: typings.pixiConstants.mod.FORMATS.RED & Double = js.native
  
  @js.native
  sealed trait RED_INTEGER
    extends StObject
       with FORMATS
  /* 36244 */ val RED_INTEGER: typings.pixiConstants.mod.FORMATS.RED_INTEGER & Double = js.native
  
  @js.native
  sealed trait RG
    extends StObject
       with FORMATS
  /* 33319 */ val RG: typings.pixiConstants.mod.FORMATS.RG & Double = js.native
  
  @js.native
  sealed trait RGB
    extends StObject
       with FORMATS
  /* 6407 */ val RGB: typings.pixiConstants.mod.FORMATS.RGB & Double = js.native
  
  @js.native
  sealed trait RGBA
    extends StObject
       with FORMATS
  /* 6408 */ val RGBA: typings.pixiConstants.mod.FORMATS.RGBA & Double = js.native
  
  @js.native
  sealed trait RGBA_INTEGER
    extends StObject
       with FORMATS
  /* 36249 */ val RGBA_INTEGER: typings.pixiConstants.mod.FORMATS.RGBA_INTEGER & Double = js.native
  
  @js.native
  sealed trait RGB_INTEGER
    extends StObject
       with FORMATS
  /* 36248 */ val RGB_INTEGER: typings.pixiConstants.mod.FORMATS.RGB_INTEGER & Double = js.native
  
  @js.native
  sealed trait RG_INTEGER
    extends StObject
       with FORMATS
  /* 33320 */ val RG_INTEGER: typings.pixiConstants.mod.FORMATS.RG_INTEGER & Double = js.native
}
