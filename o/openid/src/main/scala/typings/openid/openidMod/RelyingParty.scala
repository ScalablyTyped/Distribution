package typings.openid.openidMod

import typings.openid.Anon_Authenticated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openid", "RelyingParty")
@js.native
class RelyingParty protected () extends js.Object {
  def this(returnUrl: String, realm: String, stateless: Boolean, strict: Boolean, extensions: js.Array[_]) = this()
  def this(returnUrl: String, realm: Null, stateless: Boolean, strict: Boolean, extensions: js.Array[_]) = this()
  def authenticate(
    identifier: String,
    immediate: Boolean,
    callback: js.Function2[/* err */ OpenIdError | Null, /* authUrl */ String | Null, Unit]
  ): Unit = js.native
  def verifyAssertion(
    requestOrUrl: String,
    callback: js.Function2[/* err */ OpenIdError | Null, /* result */ js.UndefOr[Anon_Authenticated], Unit]
  ): Unit = js.native
  def verifyAssertion(
    requestOrUrl: js.Object,
    callback: js.Function2[/* err */ OpenIdError | Null, /* result */ js.UndefOr[Anon_Authenticated], Unit]
  ): Unit = js.native
}

