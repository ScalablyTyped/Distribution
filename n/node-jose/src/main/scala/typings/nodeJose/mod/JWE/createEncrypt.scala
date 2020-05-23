package typings.nodeJose.mod.JWE

import typings.nodeJose.anon.Fields
import typings.nodeJose.mod.JWK.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWE.createEncrypt")
@js.native
object createEncrypt extends js.Object {
  def apply(keys: js.Array[Key]): Encryptor = js.native
  def apply(keys: Key): Encryptor = js.native
  def apply(options: Fields, key: Key): Encryptor = js.native
}

