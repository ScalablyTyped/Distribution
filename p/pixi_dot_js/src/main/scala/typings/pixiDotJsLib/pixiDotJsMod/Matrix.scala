package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Matrix")
@js.native
class Matrix protected ()
  extends pixiDotJsLib.PIXINs.Matrix {
  def this(a: js.UndefOr[scala.Double], b: js.UndefOr[scala.Double], c: js.UndefOr[scala.Double], d: js.UndefOr[scala.Double], tx: js.UndefOr[scala.Double], ty: js.UndefOr[scala.Double]) = this()
}

@JSImport("pixi.js", "Matrix")
@js.native
object Matrix extends js.Object {
  var IDENTITY: pixiDotJsLib.PIXINs.Matrix = js.native
  var TEMP_MATRIX: pixiDotJsLib.PIXINs.Matrix = js.native
}

