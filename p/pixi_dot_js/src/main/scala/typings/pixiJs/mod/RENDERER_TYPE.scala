package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
object RENDERER_TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.RENDERER_TYPE & Double] = js.native
  
  /* 2 */ val CANVAS: typings.pixiJs.PIXI.RENDERER_TYPE.CANVAS & Double = js.native
  
  /* 0 */ val UNKNOWN: typings.pixiJs.PIXI.RENDERER_TYPE.UNKNOWN & Double = js.native
  
  /* 1 */ val WEBGL: typings.pixiJs.PIXI.RENDERER_TYPE.WEBGL & Double = js.native
}
