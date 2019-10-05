package typings.nodeDashJose.nodeDashJoseMod.JWS

import typings.nodeDashJose.Anon_Algorithms
import typings.nodeDashJose.nodeDashJoseMod.JWK.Key
import typings.nodeDashJose.nodeDashJoseMod.JWK.KeyStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWS.createVerify")
@js.native
object createVerify extends js.Object {
  /**
    * Using a keystore.
    */
  def apply(): Verifier = js.native
  def apply(input: String): Verifier = js.native
  def apply(input: String, opts: Anon_Algorithms): Verifier = js.native
  def apply(input: js.Object): Verifier = js.native
  def apply(input: js.Object, opts: Anon_Algorithms): Verifier = js.native
  def apply(input: Key): Verifier = js.native
  def apply(input: KeyStore): Verifier = js.native
  def apply(input: KeyStore, opts: Anon_Algorithms): Verifier = js.native
  def apply(input: Key, opts: Anon_Algorithms): Verifier = js.native
}

