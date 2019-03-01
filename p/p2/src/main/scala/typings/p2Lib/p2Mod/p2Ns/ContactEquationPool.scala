package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactEquationPool extends Pool {
  def create(): ContactEquation
  def destroy(equation: ContactEquation): ContactEquationPool
}

object ContactEquationPool {
  @scala.inline
  def apply(
    create: js.Function0[ContactEquation],
    destroy: js.Function1[ContactEquation, ContactEquationPool],
    get: js.Function0[js.Any],
    objects: js.Array[_],
    release: js.Function1[js.Any, Pool],
    resize: js.Function1[scala.Double, Pool]
  ): ContactEquationPool = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("objects")(objects)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("resize")(resize)
    __obj.asInstanceOf[ContactEquationPool]
  }
}

