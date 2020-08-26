package typings.mem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheStorage[KeyType, ValueType] extends js.Object {
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  def delete(key: KeyType): Unit = js.native
  def get(key: KeyType): js.UndefOr[ValueType] = js.native
  def has(key: KeyType): Boolean = js.native
  def set(key: KeyType, value: ValueType): Unit = js.native
}

object CacheStorage {
  @scala.inline
  def apply[KeyType, ValueType](
    delete: KeyType => Unit,
    get: KeyType => js.UndefOr[ValueType],
    has: KeyType => Boolean,
    set: (KeyType, ValueType) => Unit
  ): CacheStorage[KeyType, ValueType] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[CacheStorage[KeyType, ValueType]]
  }
  @scala.inline
  implicit class CacheStorageOps[Self <: CacheStorage[_, _], KeyType, ValueType] (val x: Self with (CacheStorage[KeyType, ValueType])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: KeyType => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: KeyType => js.UndefOr[ValueType]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: KeyType => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (KeyType, ValueType) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
  }
  
}

