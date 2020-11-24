package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RENDERER_TYPE extends js.Object
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
object RENDERER_TYPE extends js.Object {
  
  @js.native
  sealed trait CANVAS extends RENDERER_TYPE
  
  @js.native
  sealed trait UNKNOWN extends RENDERER_TYPE
  
  @js.native
  sealed trait WEBGL extends RENDERER_TYPE
}
