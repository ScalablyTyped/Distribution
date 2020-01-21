package typings.nodeCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueSetItem[T] extends js.Object {
  var key: Key
  var ttl: js.UndefOr[Double] = js.undefined
  var `val`: T
}

object ValueSetItem {
  @scala.inline
  def apply[T](key: Key, `val`: T, ttl: Int | Double = null): ValueSetItem[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetItem[T]]
  }
}

