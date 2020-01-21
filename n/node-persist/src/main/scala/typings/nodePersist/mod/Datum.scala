package typings.nodePersist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datum extends js.Object {
  var key: String
  var ttl: js.UndefOr[Double] = js.undefined
  var value: js.Any
}

object Datum {
  @scala.inline
  def apply(key: String, value: js.Any, ttl: Int | Double = null): Datum = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datum]
  }
}

