package typings.nodeDashJose.nodeDashJoseMod.JWE

import typings.nodeDashJose.Anon_Compact
import typings.nodeDashJose.nodeDashJoseMod.JWK.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWE.createEncrypt")
@js.native
object createEncrypt extends js.Object {
  def apply(keys: js.Array[Key]): Encryptor = js.native
  def apply(keys: Key): Encryptor = js.native
  def apply(options: Anon_Compact, key: Key): Encryptor = js.native
}

