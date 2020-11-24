package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("pixi.js", "RENDERER_TYPE")
@js.native
object RENDERER_TYPE extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.RENDERER_TYPE with Double] = js.native
  
  /* 2 */ val CANVAS: typings.pixiJs.PIXI.RENDERER_TYPE.CANVAS with Double = js.native
  
  /* 0 */ val UNKNOWN: typings.pixiJs.PIXI.RENDERER_TYPE.UNKNOWN with Double = js.native
  
  /* 1 */ val WEBGL: typings.pixiJs.PIXI.RENDERER_TYPE.WEBGL with Double = js.native
}
