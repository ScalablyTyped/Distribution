package typings.nodeDashJose.nodeDashJoseMod.JWS

import typings.nodeDashJose.Anon_AllowEmbeddedKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Verifier extends js.Object {
  def verify(input: String): js.Promise[VerificationResult] = js.native
  def verify(input: String, opts: Anon_AllowEmbeddedKey): js.Promise[VerificationResult] = js.native
}

