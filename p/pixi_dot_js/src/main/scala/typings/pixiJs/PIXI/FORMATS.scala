package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FORMATS extends StObject
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
object FORMATS extends StObject {
  
  @js.native
  sealed trait ALPHA
    extends StObject
       with FORMATS
  
  @js.native
  sealed trait DEPTH_COMPONENT
    extends StObject
       with FORMATS
  
  @js.native
  sealed trait DEPTH_STENCIL
    extends StObject
       with FORMATS
  
  @js.native
  sealed trait LUMINANCE
    extends StObject
       with FORMATS
  
  @js.native
  sealed trait LUMINANCE_ALPHA
    extends StObject
       with FORMATS
  
  @js.native
  sealed trait RGB
    extends StObject
       with FORMATS
  
  @js.native
  sealed trait RGBA
    extends StObject
       with FORMATS
}
