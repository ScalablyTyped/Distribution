package typings.noble.mod

import typings.noble.nobleStrings.characteristicsDiscover
import typings.noble.nobleStrings.includedServicesDiscover
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noble", "Service")
@js.native
class Service () extends EventEmitter {
  var characteristics: js.Array[Characteristic] = js.native
  var includedServiceUuids: js.Array[String] = js.native
  var name: String = js.native
  var `type`: String = js.native
  var uuid: String = js.native
  def discoverCharacteristics(characteristicUUIDs: js.Array[String]): Unit = js.native
  def discoverCharacteristics(
    characteristicUUIDs: js.Array[String],
    callback: js.Function2[/* error */ String, /* characteristics */ js.Array[Characteristic], Unit]
  ): Unit = js.native
  def discoverIncludedServices(serviceUUIDs: js.Array[String]): Unit = js.native
  def discoverIncludedServices(
    serviceUUIDs: js.Array[String],
    callback: js.Function2[/* error */ String, /* includedServiceUuids */ js.Array[String], Unit]
  ): Unit = js.native
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_characteristicsDiscover(
    event: characteristicsDiscover,
    listener: js.Function1[/* characteristics */ js.Array[Characteristic], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_includedServicesDiscover(
    event: includedServicesDiscover,
    listener: js.Function1[/* includedServiceUuids */ js.Array[String], Unit]
  ): this.type = js.native
  def once(event: String, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_characteristicsDiscover(
    event: characteristicsDiscover,
    listener: js.Function1[/* characteristics */ js.Array[Characteristic], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_includedServicesDiscover(
    event: includedServicesDiscover,
    listener: js.Function1[/* includedServiceUuids */ js.Array[String], Unit]
  ): this.type = js.native
}

