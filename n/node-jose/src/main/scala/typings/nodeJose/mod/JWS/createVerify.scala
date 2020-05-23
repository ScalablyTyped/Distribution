package typings.nodeJose.mod.JWS

import typings.nodeJose.anon.Algorithms
import typings.nodeJose.mod.JWK.Key
import typings.nodeJose.mod.JWK.KeyStore
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
  def apply(input: String, opts: Algorithms): Verifier = js.native
  def apply(input: js.Object): Verifier = js.native
  def apply(input: js.Object, opts: Algorithms): Verifier = js.native
  def apply(input: Key): Verifier = js.native
  def apply(input: KeyStore): Verifier = js.native
  def apply(input: KeyStore, opts: Algorithms): Verifier = js.native
  def apply(input: Key, opts: Algorithms): Verifier = js.native
}

