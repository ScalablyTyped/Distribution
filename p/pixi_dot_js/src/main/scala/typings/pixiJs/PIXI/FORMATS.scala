package typings.pixiJs.PIXI

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FORMATS extends js.Object

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
@JSGlobal("PIXI.FORMATS")
@js.native
object FORMATS extends js.Object {
  @js.native
  sealed trait ALPHA extends FORMATS
  
  @js.native
  sealed trait DEPTH_COMPONENT extends FORMATS
  
  @js.native
  sealed trait DEPTH_STENCIL extends FORMATS
  
  @js.native
  sealed trait LUMINANCE extends FORMATS
  
  @js.native
  sealed trait LUMINANCE_ALPHA extends FORMATS
  
  @js.native
  sealed trait RGB extends FORMATS
  
  @js.native
  sealed trait RGBA extends FORMATS
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FORMATS with Double] = js.native
  /* 2 */ @js.native
  object ALPHA extends TopLevel[ALPHA with Double]
  
  /* 5 */ @js.native
  object DEPTH_COMPONENT extends TopLevel[DEPTH_COMPONENT with Double]
  
  /* 6 */ @js.native
  object DEPTH_STENCIL extends TopLevel[DEPTH_STENCIL with Double]
  
  /* 3 */ @js.native
  object LUMINANCE extends TopLevel[LUMINANCE with Double]
  
  /* 4 */ @js.native
  object LUMINANCE_ALPHA extends TopLevel[LUMINANCE_ALPHA with Double]
  
  /* 1 */ @js.native
  object RGB extends TopLevel[RGB with Double]
  
  /* 0 */ @js.native
  object RGBA extends TopLevel[RGBA with Double]
  
}

