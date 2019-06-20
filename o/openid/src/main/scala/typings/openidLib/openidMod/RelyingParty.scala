package typings
package openidLib.openidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openid", "RelyingParty")
@js.native
class RelyingParty protected () extends js.Object {
  def this(returnUrl: java.lang.String, realm: java.lang.String, stateless: scala.Boolean, strict: scala.Boolean, extensions: js.Array[_]) = this()
  def this(returnUrl: java.lang.String, realm: scala.Null, stateless: scala.Boolean, strict: scala.Boolean, extensions: js.Array[_]) = this()
  def authenticate(
    identifier: java.lang.String,
    immediate: scala.Boolean,
    callback: js.Function2[
      /* err */ OpenIdError | scala.Null, 
      /* authUrl */ java.lang.String | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def verifyAssertion(
    requestOrUrl: java.lang.String,
    callback: js.Function1[/* err */ OpenIdError | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def verifyAssertion(requestOrUrl: js.Object, callback: js.Function1[/* err */ OpenIdError | scala.Null, scala.Unit]): scala.Unit = js.native
}

