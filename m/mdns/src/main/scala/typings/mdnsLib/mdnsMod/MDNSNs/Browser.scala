package typings
package mdnsLib.mdnsMod.MDNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser
  extends nodeLib.NodeJSNs.EventEmitter {
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_serviceDown(event: mdnsLib.mdnsLibStrings.serviceDown, listener: js.Function1[/* info */ Service, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_serviceUp(event: mdnsLib.mdnsLibStrings.serviceUp, listener: js.Function1[/* info */ Service, scala.Unit]): this.type = js.native
  def start(): js.Any = js.native
  def stop(): js.Any = js.native
}

