package typings
package nobleDashMacLib.nobleDashMacMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noble-mac", "Service")
@js.native
class Service ()
  extends nodeLib.eventsMod.EventEmitter {
  var characteristics: js.Array[Characteristic] = js.native
  var includedServiceUuids: js.Array[java.lang.String] = js.native
  var name: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  var uuid: java.lang.String = js.native
  def discoverCharacteristics(characteristicUUIDs: js.Array[java.lang.String]): scala.Unit = js.native
  def discoverCharacteristics(
    characteristicUUIDs: js.Array[java.lang.String],
    callback: js.Function2[
      /* error */ java.lang.String, 
      /* characteristics */ js.Array[Characteristic], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def discoverIncludedServices(serviceUUIDs: js.Array[java.lang.String]): scala.Unit = js.native
  def discoverIncludedServices(
    serviceUUIDs: js.Array[java.lang.String],
    callback: js.Function2[
      /* error */ java.lang.String, 
      /* includedServiceUuids */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_characteristicsDiscover(
    event: nobleDashMacLib.nobleDashMacLibStrings.characteristicsDiscover,
    listener: js.Function1[/* characteristics */ js.Array[Characteristic], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_includedServicesDiscover(
    event: nobleDashMacLib.nobleDashMacLibStrings.includedServicesDiscover,
    listener: js.Function1[/* includedServiceUuids */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
}

