package typings.nodeJose.mod.JWS

import typings.nodeJose.anon.AllowEmbeddedKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Verifier extends js.Object {
  
  def verify(input: String): js.Promise[VerificationResult] = js.native
  def verify(input: String, opts: AllowEmbeddedKey): js.Promise[VerificationResult] = js.native
}
