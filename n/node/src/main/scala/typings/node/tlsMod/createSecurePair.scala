package typings.node.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", "createSecurePair")
@js.native
object createSecurePair extends js.Object {
  /**
    * @deprecated
    */
  def apply(): SecurePair = js.native
  def apply(credentials: SecureContext): SecurePair = js.native
  def apply(credentials: SecureContext, isServer: Boolean): SecurePair = js.native
  def apply(credentials: SecureContext, isServer: Boolean, requestCert: Boolean): SecurePair = js.native
  def apply(credentials: SecureContext, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = js.native
}

