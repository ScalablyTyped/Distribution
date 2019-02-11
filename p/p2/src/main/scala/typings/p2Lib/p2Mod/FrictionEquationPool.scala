package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "FrictionEquationPool")
@js.native
class FrictionEquationPool ()
  extends p2Lib.p2Mod.p2Ns.FrictionEquationPool {
  /* CompleteClass */
  override var objects: js.Array[_] = js.native
  /* CompleteClass */
  override def create(): p2Lib.p2Mod.p2Ns.FrictionEquation = js.native
  /* CompleteClass */
  override def destroy(equation: p2Lib.p2Mod.p2Ns.FrictionEquation): p2Lib.p2Mod.p2Ns.FrictionEquationPool = js.native
  /* CompleteClass */
  override def get(): js.Any = js.native
  /* CompleteClass */
  override def release(`object`: js.Any): p2Lib.p2Mod.p2Ns.Pool = js.native
  /* CompleteClass */
  override def resize(size: scala.Double): p2Lib.p2Mod.p2Ns.Pool = js.native
}

