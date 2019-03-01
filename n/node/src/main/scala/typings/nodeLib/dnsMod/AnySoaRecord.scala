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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("expire")(expire)
    __obj.updateDynamic("hostmaster")(hostmaster)
    __obj.updateDynamic("minttl")(minttl)
    __obj.updateDynamic("nsname")(nsname)
    __obj.updateDynamic("refresh")(refresh)
    __obj.updateDynamic("retry")(retry)
    __obj.updateDynamic("serial")(serial)
    __obj.asInstanceOf[AnySoaRecord]
  }
}

