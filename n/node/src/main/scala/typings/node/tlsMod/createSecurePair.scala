package typings.node.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", "createSecurePair")
@js.native
object createSecurePair extends js.Object {
  /**
    * @deprecated since v0.11.3 Use `tls.TLSSocket` instead.
    */
  def apply(): SecurePair = js.native
  def apply(
    credentials: js.UndefOr[scala.Nothing],
    isServer: js.UndefOr[scala.Nothing],
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  def apply(credentials: js.UndefOr[scala.Nothing], isServer: js.UndefOr[scala.Nothing], requestCert: Boolean): SecurePair = js.native
  def apply(
    credentials: js.UndefOr[scala.Nothing],
    isServer: js.UndefOr[scala.Nothing],
    requestCert: Boolean,
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  def apply(credentials: js.UndefOr[scala.Nothing], isServer: Boolean): SecurePair = js.native
  def apply(
    credentials: js.UndefOr[scala.Nothing],
    isServer: Boolean,
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  def apply(credentials: js.UndefOr[scala.Nothing], isServer: Boolean, requestCert: Boolean): SecurePair = js.native
  def apply(
    credentials: js.UndefOr[scala.Nothing],
    isServer: Boolean,
    requestCert: Boolean,
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  def apply(credentials: SecureContext): SecurePair = js.native
  def apply(
    credentials: SecureContext,
    isServer: js.UndefOr[scala.Nothing],
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  def apply(credentials: SecureContext, isServer: js.UndefOr[scala.Nothing], requestCert: Boolean): SecurePair = js.native
  def apply(
    credentials: SecureContext,
    isServer: js.UndefOr[scala.Nothing],
    requestCert: Boolean,
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  def apply(credentials: SecureContext, isServer: Boolean): SecurePair = js.native
  def apply(
    credentials: SecureContext,
    isServer: Boolean,
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  def apply(credentials: SecureContext, isServer: Boolean, requestCert: Boolean): SecurePair = js.native
  def apply(credentials: SecureContext, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = js.native
}

