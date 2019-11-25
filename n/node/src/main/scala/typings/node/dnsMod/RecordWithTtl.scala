package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordWithTtl extends js.Object {
  var address: java.lang.String
  var ttl: Double
}

object RecordWithTtl {
  @scala.inline
  def apply(address: java.lang.String, ttl: Double): RecordWithTtl = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecordWithTtl]
  }
}

