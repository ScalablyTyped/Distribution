package typings.nobleMac.mod

import typings.nobleMac.nobleMacStrings.broadcast
import typings.nobleMac.nobleMacStrings.descriptorsDiscover
import typings.nobleMac.nobleMacStrings.notify
import typings.nobleMac.nobleMacStrings.read
import typings.nobleMac.nobleMacStrings.write
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("noble-mac", "Characteristic")
@js.native
class Characteristic () extends EventEmitter {
  
  def broadcast(broadcast: Boolean): Unit = js.native
  def broadcast(broadcast: Boolean, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
  
  var descriptors: js.Array[Descriptor] = js.native
  
  def discoverDescriptors(): Unit = js.native
  def discoverDescriptors(callback: js.Function2[/* error */ String, /* descriptors */ js.Array[Descriptor], Unit]): Unit = js.native
  
  var name: String = js.native
  
  def notify(notify: Boolean): Unit = js.native
  def notify(notify: Boolean, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: String, option: Boolean, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_broadcast(event: broadcast, listener: js.Function1[/* state */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_descriptorsDiscover(event: descriptorsDiscover, listener: js.Function1[/* descriptors */ js.Array[Descriptor], Unit]): this.type = js.native
  @JSName("on")
  def on_notify(event: notify, listener: js.Function1[/* state */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_read(event: read, listener: js.Function2[/* data */ Buffer, /* isNotification */ Boolean, Unit]): this.type = js.native
  @JSName("on")
  def on_write(event: write, withoutResponse: Boolean, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
  
  var properties: js.Array[String] = js.native
  
  def read(): Unit = js.native
  def read(callback: js.Function2[/* error */ String, /* data */ Buffer, Unit]): Unit = js.native
  
  def subscribe(): Unit = js.native
  def subscribe(callback: js.Function1[/* error */ String, Unit]): Unit = js.native
  
  var `type`: String = js.native
  
  def unsubscribe(): Unit = js.native
  def unsubscribe(callback: js.Function1[/* error */ String, Unit]): Unit = js.native
  
  var uuid: String = js.native
  
  def write(data: Buffer, notify: Boolean): Unit = js.native
  def write(data: Buffer, notify: Boolean, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
}
