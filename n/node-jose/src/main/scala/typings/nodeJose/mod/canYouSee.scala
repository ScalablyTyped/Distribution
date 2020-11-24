package typings.nodeJose.mod

import typings.nodeJose.mod.JWK.Key
import typings.nodeJose.mod.JWK.KeyStore
import typings.nodeJose.mod.JWS.Verifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-jose", "canYouSee")
@js.native
object canYouSee extends js.Object {
  
  def apply(ks: KeyStore, opts: js.Object): Verifier = js.native
  def apply(ks: Key, opts: js.Object): Verifier = js.native
}
