package typings.nodeJose.mod.JWS

import typings.nodeJose.anon.Alg
import typings.nodeJose.mod.JWK.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWS.createSign")
@js.native
object createSign extends js.Object {
  def apply(keys: js.Array[Key]): Signer = js.native
  def apply(keys: Key): Signer = js.native
  def apply(options: Alg, key: js.Array[Key]): Signer = js.native
  def apply(options: Alg, key: Key): Signer = js.native
}

