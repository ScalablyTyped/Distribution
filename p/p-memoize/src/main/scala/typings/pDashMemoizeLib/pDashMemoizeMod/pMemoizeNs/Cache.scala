package typings
package pDashMemoizeLib.pDashMemoizeMod.pMemoizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache[K, V] extends js.Object {
  var clear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def delete(key: K): scala.Unit
  def get(key: K): V
  def has(key: K): scala.Boolean
  def set(key: K, value: V): scala.Unit
}

object Cache {
  @scala.inline
  def apply[K, V](
    delete: js.Function1[K, scala.Unit],
    get: js.Function1[K, V],
    has: js.Function1[K, scala.Boolean],
    set: js.Function2[K, V, scala.Unit],
    clear: js.Function0[scala.Unit] = null
  ): Cache[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("set")(set)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    __obj.asInstanceOf[Cache[K, V]]
  }
}

