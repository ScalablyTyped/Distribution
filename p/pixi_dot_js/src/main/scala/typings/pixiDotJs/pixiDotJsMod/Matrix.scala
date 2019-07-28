package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Matrix")
@js.native
class Matrix protected ()
  extends typings.pixiDotJs.PIXINs.Matrix {
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
@JSImport("pixi.js", "Matrix")
@js.native
object Matrix extends js.Object {
  var IDENTITY: typings.pixiDotJs.PIXINs.Matrix = js.native
  var TEMP_MATRIX: typings.pixiDotJs.PIXINs.Matrix = js.native
}

