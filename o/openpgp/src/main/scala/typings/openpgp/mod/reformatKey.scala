package typings.openpgp.mod

import typings.openpgp.mod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "reformatKey")
@js.native
object reformatKey extends js.Object {
  
  def apply(privateKey: Key, userIds: js.Array[_]): js.Promise[js.Object] = js.native
  def apply(
    privateKey: Key,
    userIds: js.Array[_],
    passphrase: js.UndefOr[scala.Nothing],
    keyExpirationTime: js.UndefOr[scala.Nothing],
    revocationCertificate: Boolean
  ): js.Promise[js.Object] = js.native
  def apply(
    privateKey: Key,
    userIds: js.Array[_],
    passphrase: js.UndefOr[scala.Nothing],
    keyExpirationTime: Double
  ): js.Promise[js.Object] = js.native
  def apply(
    privateKey: Key,
    userIds: js.Array[_],
    passphrase: js.UndefOr[scala.Nothing],
    keyExpirationTime: Double,
    revocationCertificate: Boolean
  ): js.Promise[js.Object] = js.native
  def apply(privateKey: Key, userIds: js.Array[_], passphrase: String): js.Promise[js.Object] = js.native
  def apply(
    privateKey: Key,
    userIds: js.Array[_],
    passphrase: String,
    keyExpirationTime: js.UndefOr[scala.Nothing],
    revocationCertificate: Boolean
  ): js.Promise[js.Object] = js.native
  def apply(privateKey: Key, userIds: js.Array[_], passphrase: String, keyExpirationTime: Double): js.Promise[js.Object] = js.native
  def apply(
    privateKey: Key,
    userIds: js.Array[_],
    passphrase: String,
    keyExpirationTime: Double,
    revocationCertificate: Boolean
  ): js.Promise[js.Object] = js.native
}
