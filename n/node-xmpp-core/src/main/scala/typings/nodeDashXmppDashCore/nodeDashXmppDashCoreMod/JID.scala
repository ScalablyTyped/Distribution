package typings.nodeDashXmppDashCore.nodeDashXmppDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-xmpp-core", "JID")
@js.native
class JID protected () extends js.Object {
  def this(local: String) = this()
  def this(local: String, domain: String) = this()
  def this(local: String, domain: String, resource: String) = this()
  var domain: String = js.native
  var local: String = js.native
  var resource: String = js.native
  /**
    * Convenience method to distinguish users
    */
  def bare(): JID = js.native
  /**
    * Comparison function
    */
  def equals(other: JID): Boolean = js.native
  def getDomain(): String = js.native
  def getLocal(): String = js.native
  def getLocal(unescape: js.Any): String = js.native
  def getResource(): String = js.native
  def parseJID(jid: String): Unit = js.native
  /**
    * http://xmpp.org/rfcs/rfc6122.html#addressing-domain
    */
  def setDomain(value: String): Unit = js.native
  /**
    * http://xmpp.org/rfcs/rfc6122.html#addressing-localpart
    */
  def setLocal(local: String): Unit = js.native
  def setLocal(local: String, escape: js.Any): Unit = js.native
  /**
    * http://xmpp.org/rfcs/rfc6122.html#addressing-resourcepart
    */
  def setResource(value: String): Unit = js.native
  def toString(unescape: js.Any): String = js.native
}

