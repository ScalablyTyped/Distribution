package typings
package nobleLib.nobleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Advertisement extends js.Object {
  var localName: java.lang.String
  var manufacturerData: nodeLib.Buffer
  var serviceData: js.Array[nobleLib.Anon_Data]
  var serviceUuids: js.Array[java.lang.String]
  var txPowerLevel: scala.Double
}

object Advertisement {
  @scala.inline
  def apply(
    localName: java.lang.String,
    manufacturerData: nodeLib.Buffer,
    serviceData: js.Array[nobleLib.Anon_Data],
    serviceUuids: js.Array[java.lang.String],
    txPowerLevel: scala.Double
  ): Advertisement = {
    val __obj = js.Dynamic.literal(localName = localName, manufacturerData = manufacturerData, serviceData = serviceData, serviceUuids = serviceUuids, txPowerLevel = txPowerLevel)
  
    __obj.asInstanceOf[Advertisement]
  }
}

