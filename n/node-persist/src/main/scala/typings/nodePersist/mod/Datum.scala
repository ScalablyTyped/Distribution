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
  def apply(key: String, value: js.Any, ttl: js.UndefOr[Double] = js.undefined): Datum = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datum]
  }
}

