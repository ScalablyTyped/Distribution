package typings.pixiJs.PIXI

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ENV with Double] = js.native
  /* 1 */ @js.native
  object WEBGL extends TopLevel[WEBGL with Double]
  
  /* 2 */ @js.native
  object WEBGL2 extends TopLevel[WEBGL2 with Double]
  
  /* 0 */ @js.native
  object WEBGL_LEGACY extends TopLevel[WEBGL_LEGACY with Double]
  
}

