package typings.nodeJose.mod.JWE

import typings.nodeJose.mod.JWK.Key
import typings.nodeJose.mod.JWK.KeyStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-jose", "JWE.createDecrypt")
@js.native
object createDecrypt extends js.Object {
  
  def apply(key: Key): Decryptor = js.native
  def apply(key: KeyStore): Decryptor = js.native
  def apply(key: KeyStore, opts: js.Any): Decryptor = js.native
  def apply(key: Key, opts: js.Any): Decryptor = js.native
}
