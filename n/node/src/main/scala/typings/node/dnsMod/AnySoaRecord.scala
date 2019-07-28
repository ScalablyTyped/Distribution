package typings.node.dnsMod

import typings.node.nodeStrings.SOA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnySoaRecord
  extends SoaRecord
     with AnyRecord {
  var `type`: SOA
}

object AnySoaRecord {
  @scala.inline
  def apply(
    expire: Double,
    hostmaster: java.lang.String,
    minttl: Double,
    nsname: java.lang.String,
    refresh: Double,
    retry: Double,
    serial: Double,
    `type`: SOA
  ): AnySoaRecord = {
    val __obj = js.Dynamic.literal(expire = expire, hostmaster = hostmaster, minttl = minttl, nsname = nsname, refresh = refresh, retry = retry, serial = serial)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnySoaRecord]
  }
}

