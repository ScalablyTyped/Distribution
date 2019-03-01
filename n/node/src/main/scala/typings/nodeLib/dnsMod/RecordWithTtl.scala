package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordWithTtl extends js.Object {
  var address: java.lang.String
  var ttl: scala.Double
}

object RecordWithTtl {
  @scala.inline
  def apply(address: java.lang.String, ttl: scala.Double): RecordWithTtl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("ttl")(ttl)
    __obj.asInstanceOf[RecordWithTtl]
  }
}

