package typings
package memcachedLib.memcachedMod.MemcachedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheDumpData extends js.Object {
  var b: scala.Double
  var key: java.lang.String
  var s: scala.Double
}

object CacheDumpData {
  @scala.inline
  def apply(b: scala.Double, key: java.lang.String, s: scala.Double): CacheDumpData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("s")(s)
    __obj.asInstanceOf[CacheDumpData]
  }
}

