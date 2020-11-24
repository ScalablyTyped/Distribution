package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
