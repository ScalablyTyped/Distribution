package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Various GL texture/resources formats.
  *
  * @memberof PIXI
  * @static
  * @name FORMATS
  * @enum {number}
  * @property {number} RGBA=6408
  * @property {number} RGB=6407
  * @property {number} ALPHA=6406
  * @property {number} LUMINANCE=6409
  * @property {number} LUMINANCE_ALPHA=6410
  * @property {number} DEPTH_COMPONENT=6402
  * @property {number} DEPTH_STENCIL=34041
  */
@JSImport("pixi.js", "FORMATS")
@js.native
object FORMATS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.FORMATS with Double] = js.native
  
  /* 2 */ val ALPHA: typings.pixiJs.PIXI.FORMATS.ALPHA with Double = js.native
  
  /* 5 */ val DEPTH_COMPONENT: typings.pixiJs.PIXI.FORMATS.DEPTH_COMPONENT with Double = js.native
  
  /* 6 */ val DEPTH_STENCIL: typings.pixiJs.PIXI.FORMATS.DEPTH_STENCIL with Double = js.native
  
  /* 3 */ val LUMINANCE: typings.pixiJs.PIXI.FORMATS.LUMINANCE with Double = js.native
  
  /* 4 */ val LUMINANCE_ALPHA: typings.pixiJs.PIXI.FORMATS.LUMINANCE_ALPHA with Double = js.native
  
  /* 1 */ val RGB: typings.pixiJs.PIXI.FORMATS.RGB with Double = js.native
  
  /* 0 */ val RGBA: typings.pixiJs.PIXI.FORMATS.RGBA with Double = js.native
}
