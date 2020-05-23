package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PRECISION extends js.Object

/**
  * Constants that specify float precision in shaders.
  *
  * @name PRECISION
  * @memberof PIXI
  * @constant
  * @static
  * @enum {string}
  * @property {string} LOW='lowp'
  * @property {string} MEDIUM='mediump'
  * @property {string} HIGH='highp'
  */
@JSGlobal("PIXI.PRECISION")
@js.native
object PRECISION extends js.Object {
  @js.native
  sealed trait HIGH extends PRECISION
  
  @js.native
  sealed trait LOW extends PRECISION
  
  @js.native
  sealed trait MEDIUM extends PRECISION
  
}

