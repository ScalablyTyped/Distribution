package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAuthnAssertion extends js.Object {
  val authenticatorData: stdLib.ArrayBuffer
  val clientData: stdLib.ArrayBuffer
  val credential: ScopedCredential
  val signature: stdLib.ArrayBuffer
}

@JSGlobal("WebAuthnAssertion")
@js.native
object WebAuthnAssertion
  extends org.scalablytyped.runtime.Instantiable0[WebAuthnAssertion]

