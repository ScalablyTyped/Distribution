package typings
package nodeDashXmppDashClientLib.nodeDashXmppDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-xmpp-client", "Client")
@js.native
class Client protected () extends js.Object {
  def this(options: XmppOptions) = this()
  def connect(): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def on(event: java.lang.String, c: js.Function2[/* e */ js.Any, /* d */ js.Any, _]): scala.Unit = js.native
  def send(stanza: js.Any): scala.Unit = js.native
}

/* static members */
@JSImport("node-xmpp-client", "Client")
@js.native
object Client extends js.Object {
  var Stanza: nodeDashXmppDashClientLib.nodeDashXmppDashClientMod.Stanza = js.native
}

