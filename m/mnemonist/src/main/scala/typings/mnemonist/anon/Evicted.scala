package typings.mnemonist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Evicted[K, V] extends js.Object {
  var evicted: Boolean = js.native
  var key: K = js.native
  var value: V = js.native
}

object Evicted {
  @scala.inline
  def apply[K, V](evicted: Boolean, key: K, value: V): Evicted[K, V] = {
    val __obj = js.Dynamic.literal(evicted = evicted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Evicted[K, V]]
  }
  @scala.inline
  implicit class EvictedOps[Self <: Evicted[_, _], K, V] (val x: Self with (Evicted[K, V])) extends AnyVal {
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
    def setEvicted(value: Boolean): Self = this.set("evicted", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: K): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: V): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

