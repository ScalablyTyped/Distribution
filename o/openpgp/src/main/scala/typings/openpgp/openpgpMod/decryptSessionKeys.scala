package typings.openpgp.openpgpMod

import typings.openpgp.Anon_Algorithm
import typings.openpgp.openpgpMod.key.Key
import typings.openpgp.openpgpMod.message.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "decryptSessionKeys")
@js.native
object decryptSessionKeys extends js.Object {
  def apply(message: Message): js.Promise[js.UndefOr[js.Array[Anon_Algorithm]]] = js.native
  def apply(message: Message, privateKeys: js.Array[Key]): js.Promise[js.UndefOr[js.Array[Anon_Algorithm]]] = js.native
  def apply(message: Message, privateKeys: js.Array[Key], passwords: String): js.Promise[js.UndefOr[js.Array[Anon_Algorithm]]] = js.native
  def apply(message: Message, privateKeys: js.Array[Key], passwords: js.Array[String]): js.Promise[js.UndefOr[js.Array[Anon_Algorithm]]] = js.native
  def apply(message: Message, privateKeys: Key): js.Promise[js.UndefOr[js.Array[Anon_Algorithm]]] = js.native
  def apply(message: Message, privateKeys: Key, passwords: String): js.Promise[js.UndefOr[js.Array[Anon_Algorithm]]] = js.native
  def apply(message: Message, privateKeys: Key, passwords: js.Array[String]): js.Promise[js.UndefOr[js.Array[Anon_Algorithm]]] = js.native
}

