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
    delete: K => scala.Unit,
    get: K => V,
    has: K => scala.Boolean,
    set: (K, V) => scala.Unit,
    clear: () => scala.Unit = null
  ): Cache[K, V] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    __obj.asInstanceOf[Cache[K, V]]
  }
}

