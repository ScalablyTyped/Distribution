package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /* 2 */ val HIGH: typings.pixiJs.PIXI.PRECISION.HIGH with Double = js.native
  /* 0 */ val LOW: typings.pixiJs.PIXI.PRECISION.LOW with Double = js.native
  /* 1 */ val MEDIUM: typings.pixiJs.PIXI.PRECISION.MEDIUM with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.PRECISION with Double] = js.native
}

