package typings.nanomsg.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nanomsg", "Socket")
@js.native
class Socket_ protected () extends js.Object {
  def this(`type`: String, opts: Options) = this()
  
  def bind(addr: String): Unit = js.native
  
  def close(): Unit = js.native
  
  def connect(addr: String): Unit = js.native
  
  def on(event: String, cb: js.Function1[/* data */ Buffer, Unit]): Unit = js.native
  
  def send(buf: String): Double = js.native
  def send(buf: Buffer): Double = js.native
  
  def shutdown(addr: String): Unit = js.native
}
