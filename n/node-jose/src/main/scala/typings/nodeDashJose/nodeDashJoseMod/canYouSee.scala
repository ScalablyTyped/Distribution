package typings.nodeDashJose.nodeDashJoseMod

import typings.nodeDashJose.nodeDashJoseMod.JWK.Key
import typings.nodeDashJose.nodeDashJoseMod.JWK.KeyStore
import typings.nodeDashJose.nodeDashJoseMod.JWS.Verifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "canYouSee")
@js.native
object canYouSee extends js.Object {
  def apply(ks: KeyStore, opts: js.Object): Verifier = js.native
  def apply(ks: Key, opts: js.Object): Verifier = js.native
}

