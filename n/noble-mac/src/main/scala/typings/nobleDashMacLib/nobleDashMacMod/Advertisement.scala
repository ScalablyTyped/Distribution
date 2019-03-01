package typings
package nobleDashMacLib.nobleDashMacMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Advertisement extends js.Object {
  var localName: java.lang.String
  var manufacturerData: nodeLib.Buffer
  var serviceData: nobleDashMacLib.Anon_Data
  var serviceUuids: js.Array[java.lang.String]
  var txPowerLevel: scala.Double
}

object Advertisement {
  @scala.inline
  def apply(
    localName: java.lang.String,
    manufacturerData: nodeLib.Buffer,
    serviceData: nobleDashMacLib.Anon_Data,
    serviceUuids: js.Array[java.lang.String],
    txPowerLevel: scala.Double
  ): Advertisement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("localName")(localName)
    __obj.updateDynamic("manufacturerData")(manufacturerData)
    __obj.updateDynamic("serviceData")(serviceData)
    __obj.updateDynamic("serviceUuids")(serviceUuids)
    __obj.updateDynamic("txPowerLevel")(txPowerLevel)
    __obj.asInstanceOf[Advertisement]
  }
}

