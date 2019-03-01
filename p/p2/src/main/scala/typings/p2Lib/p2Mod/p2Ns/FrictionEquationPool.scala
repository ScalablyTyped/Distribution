package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrictionEquationPool extends Pool {
  def create(): FrictionEquation
  def destroy(equation: FrictionEquation): FrictionEquationPool
}

object FrictionEquationPool {
  @scala.inline
  def apply(
    create: js.Function0[FrictionEquation],
    destroy: js.Function1[FrictionEquation, FrictionEquationPool],
    get: js.Function0[js.Any],
    objects: js.Array[_],
    release: js.Function1[js.Any, Pool],
    resize: js.Function1[scala.Double, Pool]
  ): FrictionEquationPool = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("objects")(objects)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("resize")(resize)
    __obj.asInstanceOf[FrictionEquationPool]
  }
}

