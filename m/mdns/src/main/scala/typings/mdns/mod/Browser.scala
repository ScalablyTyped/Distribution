package typings.mdns.mod

import org.scalablytyped.runtime.TopLevel
import typings.mdns.mdnsStrings.serviceDown
import typings.mdns.mdnsStrings.serviceUp
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends EventEmitter {
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_serviceDown(event: serviceDown, listener: js.Function1[/* info */ Service, Unit]): this.type = js.native
  @JSName("on")
  def on_serviceUp(event: serviceUp, listener: js.Function1[/* info */ Service, Unit]): this.type = js.native
  def start(): js.Any = js.native
  def stop(): js.Any = js.native
}

@JSImport("mdns", "Browser")
@js.native
object Browser extends TopLevel[BrowserStatic]

