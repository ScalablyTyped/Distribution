package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAuthentication extends js.Object {
  def getAssertion(): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(
    assertionChallenge: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
  ): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(
    assertionChallenge: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer,
    options: AssertionOptions
  ): js.Promise[WebAuthnAssertion] = js.native
  def makeCredential(accountInformation: Account, cryptoParameters: js.Array[ScopedCredentialParameters]): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
}

@JSGlobal("WebAuthentication")
@js.native
object WebAuthentication
  extends org.scalablytyped.runtime.Instantiable0[WebAuthentication]

