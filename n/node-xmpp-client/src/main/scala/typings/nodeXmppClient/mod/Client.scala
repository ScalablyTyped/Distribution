package typings.nodeXmppClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-xmpp-client", "Client")
@js.native
class Client protected () extends js.Object {
  def this(options: XmppOptions) = this()
  
  def connect(): Unit = js.native
  
  def disconnect(): Unit = js.native
  
  def on(event: String, c: js.Function2[/* e */ js.Any, /* d */ js.Any, _]): Unit = js.native
  
  def send(stanza: js.Any): Unit = js.native
}
/* static members */
@JSImport("node-xmpp-client", "Client")
@js.native
object Client extends js.Object {
  
  var Stanza: typings.nodeXmppClient.mod.Stanza = js.native
}
