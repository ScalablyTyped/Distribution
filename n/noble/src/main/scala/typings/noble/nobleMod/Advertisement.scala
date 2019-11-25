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
    val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any], manufacturerData = manufacturerData.asInstanceOf[js.Any], serviceData = serviceData.asInstanceOf[js.Any], serviceUuids = serviceUuids.asInstanceOf[js.Any], txPowerLevel = txPowerLevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Advertisement]
  }
}

