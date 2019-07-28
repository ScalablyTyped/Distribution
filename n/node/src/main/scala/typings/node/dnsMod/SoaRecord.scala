package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoaRecord extends js.Object {
  var expire: Double
  var hostmaster: java.lang.String
  var minttl: Double
  var nsname: java.lang.String
  var refresh: Double
  var retry: Double
  var serial: Double
}

object SoaRecord {
  @scala.inline
  def apply(
    expire: Double,
    hostmaster: java.lang.String,
    minttl: Double,
    nsname: java.lang.String,
    refresh: Double,
    retry: Double,
    serial: Double
  ): SoaRecord = {
    val __obj = js.Dynamic.literal(expire = expire, hostmaster = hostmaster, minttl = minttl, nsname = nsname, refresh = refresh, retry = retry, serial = serial)
  
    __obj.asInstanceOf[SoaRecord]
  }
}

