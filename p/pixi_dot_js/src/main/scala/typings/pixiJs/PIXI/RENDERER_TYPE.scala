package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RENDERER_TYPE extends StObject
/**
  * Constant to identify the Renderer Type.
  *
  * @static
  * @memberof PIXI
  * @name RENDERER_TYPE
  * @enum {number}
  * @property {number} UNKNOWN - Unknown render type.
  * @property {number} WEBGL - WebGL render type.
  * @property {number} CANVAS - Canvas render type.
  */
@JSGlobal("PIXI.RENDERER_TYPE")
@js.native
object RENDERER_TYPE extends StObject {
  
  @js.native
  sealed trait CANVAS
    extends StObject
       with RENDERER_TYPE
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with RENDERER_TYPE
  
  @js.native
  sealed trait WEBGL
    extends StObject
       with RENDERER_TYPE
}
