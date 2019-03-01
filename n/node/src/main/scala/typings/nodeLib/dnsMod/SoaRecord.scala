package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoaRecord extends js.Object {
  var expire: scala.Double
  var hostmaster: java.lang.String
  var minttl: scala.Double
  var nsname: java.lang.String
  var refresh: scala.Double
  var retry: scala.Double
  var serial: scala.Double
}

object SoaRecord {
  @scala.inline
  def apply(
    expire: scala.Double,
    hostmaster: java.lang.String,
    minttl: scala.Double,
    nsname: java.lang.String,
    refresh: scala.Double,
    retry: scala.Double,
    serial: scala.Double
  ): SoaRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expire")(expire)
    __obj.updateDynamic("hostmaster")(hostmaster)
    __obj.updateDynamic("minttl")(minttl)
    __obj.updateDynamic("nsname")(nsname)
    __obj.updateDynamic("refresh")(refresh)
    __obj.updateDynamic("retry")(retry)
    __obj.updateDynamic("serial")(serial)
    __obj.asInstanceOf[SoaRecord]
  }
}

