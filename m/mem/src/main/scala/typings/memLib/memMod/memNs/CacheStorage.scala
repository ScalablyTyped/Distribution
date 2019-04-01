package typings
package memLib.memMod.memNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheStorage[KeyType /* <: js.Any */, ValueType /* <: js.Any */] extends js.Object {
  var clear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def delete(key: KeyType): scala.Unit
  def get(key: KeyType): js.UndefOr[ValueType]
  def has(key: KeyType): scala.Boolean
  def set(key: KeyType, value: ValueType): scala.Unit
}

object CacheStorage {
  @scala.inline
  def apply[KeyType /* <: js.Any */, ValueType /* <: js.Any */](
    delete: KeyType => scala.Unit,
    get: KeyType => js.UndefOr[ValueType],
    has: KeyType => scala.Boolean,
    set: (KeyType, ValueType) => scala.Unit,
    clear: () => scala.Unit = null
  ): CacheStorage[KeyType, ValueType] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    __obj.asInstanceOf[CacheStorage[KeyType, ValueType]]
  }
}

