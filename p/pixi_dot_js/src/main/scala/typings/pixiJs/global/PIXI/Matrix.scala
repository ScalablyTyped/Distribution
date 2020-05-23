package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The PixiJS Matrix as a class makes it a lot faster.
  *
  * Here is a representation of it:
  * ```js
  * | a | c | tx|
  * | b | d | ty|
  * | 0 | 0 | 1 |
  * ```
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.Matrix")
@js.native
class Matrix protected ()
  extends typings.pixiJs.PIXI.Matrix {
  def this(
    a: js.UndefOr[Double],
    b: js.UndefOr[Double],
    c: js.UndefOr[Double],
    d: js.UndefOr[Double],
    tx: js.UndefOr[Double],
    ty: js.UndefOr[Double]
  ) = this()
}

/* static members */
@JSGlobal("PIXI.Matrix")
@js.native
object Matrix extends js.Object {
  /**
    * A default (identity) matrix
    *
    * @static
    * @const
    * @member {PIXI.Matrix}
    */
  var IDENTITY: typings.pixiJs.PIXI.Matrix = js.native
  /**
    * A temp matrix
    *
    * @static
    * @const
    * @member {PIXI.Matrix}
    */
  var TEMP_MATRIX: typings.pixiJs.PIXI.Matrix = js.native
}

