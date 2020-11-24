package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ENV extends js.Object
/**
  * Different types of environments for WebGL.
  *
  * @static
  * @memberof PIXI
  * @name ENV
  * @enum {number}
  * @property {number} WEBGL_LEGACY - Used for older v1 WebGL devices. PixiJS will aim to ensure compatibility
  *  with older / less advanced devices. If you experience unexplained flickering prefer this environment.
  * @property {number} WEBGL - Version 1 of WebGL
  * @property {number} WEBGL2 - Version 2 of WebGL
  */
@JSGlobal("PIXI.ENV")
@js.native
object ENV extends js.Object {
  
  @js.native
  sealed trait WEBGL extends ENV
  
  @js.native
  sealed trait WEBGL2 extends ENV
  
  @js.native
  sealed trait WEBGL_LEGACY extends ENV
}
