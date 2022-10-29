package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "Matrix")
@js.native
open class Matrix protected ()
  extends typings.pixiMath.mod.Matrix {
  /**
    * @param a - x scale
    * @param b - y skew
    * @param c - x skew
    * @param d - y scale
    * @param tx - x translation
    * @param ty - y translation
    */
  def this(
    a: js.UndefOr[Double],
    b: js.UndefOr[Double],
    c: js.UndefOr[Double],
    d: js.UndefOr[Double],
    tx: js.UndefOr[Double],
    ty: js.UndefOr[Double]
  ) = this()
}
