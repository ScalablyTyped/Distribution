package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnySoaRecord
  extends SoaRecord
     with AnyRecord {
  var `type`: nodeLib.nodeLibStrings.SOA
}

object AnySoaRecord {
  @scala.inline
  def apply(
    expire: scala.Double,
    hostmaster: java.lang.String,
    minttl: scala.Double,
    nsname: java.lang.String,
    refresh: scala.Double,
    retry: scala.Double,
    serial: scala.Double,
    `type`: nodeLib.nodeLibStrings.SOA
  ): AnySoaRecord = {
    val __obj = js.Dynamic.literal(expire = expire, hostmaster = hostmaster, minttl = minttl, nsname = nsname, refresh = refresh, retry = retry, serial = serial)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnySoaRecord]
  }
}

