package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /* 1 */ val WEBGL: typings.pixiJs.PIXI.ENV.WEBGL with Double = js.native
  /* 2 */ val WEBGL2: typings.pixiJs.PIXI.ENV.WEBGL2 with Double = js.native
  /* 0 */ val WEBGL_LEGACY: typings.pixiJs.PIXI.ENV.WEBGL_LEGACY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.ENV with Double] = js.native
}

