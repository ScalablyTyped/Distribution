package typings.mem.memMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheStorage[KeyType, ValueType] extends js.Object {
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  def delete(key: KeyType): Unit
  def get(key: KeyType): js.UndefOr[ValueType]
  def has(key: KeyType): Boolean
  def set(key: KeyType, value: ValueType): Unit
}

object CacheStorage {
  @scala.inline
  def apply[KeyType, ValueType](
    delete: KeyType => Unit,
    get: KeyType => js.UndefOr[ValueType],
    has: KeyType => Boolean,
    set: (KeyType, ValueType) => Unit,
    clear: () => Unit = null
  ): CacheStorage[KeyType, ValueType] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    __obj.asInstanceOf[CacheStorage[KeyType, ValueType]]
  }
}

