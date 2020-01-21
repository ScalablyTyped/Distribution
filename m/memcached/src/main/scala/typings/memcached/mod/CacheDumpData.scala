package typings.memcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheDumpData extends js.Object {
  var b: Double
  var key: String
  var s: Double
}

object CacheDumpData {
  @scala.inline
  def apply(b: Double, key: String, s: Double): CacheDumpData = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CacheDumpData]
  }
}

