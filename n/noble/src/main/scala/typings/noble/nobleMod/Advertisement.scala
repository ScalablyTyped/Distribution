package typings.noble.nobleMod

import typings.noble.Anon_Data
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Advertisement extends js.Object {
  var localName: String
  var manufacturerData: Buffer
  var serviceData: js.Array[Anon_Data]
  var serviceUuids: js.Array[String]
  var txPowerLevel: Double
}

object Advertisement {
  @scala.inline
  def apply(
    localName: String,
    manufacturerData: Buffer,
    serviceData: js.Array[Anon_Data],
    serviceUuids: js.Array[String],
    txPowerLevel: Double
  ): Advertisement = {
    val __obj = js.Dynamic.literal(localName = localName, manufacturerData = manufacturerData, serviceData = serviceData, serviceUuids = serviceUuids, txPowerLevel = txPowerLevel)
  
    __obj.asInstanceOf[Advertisement]
  }
}

