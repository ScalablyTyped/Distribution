package typings.openpgp.mod

import typings.openpgp.anon.EncryptOptionsarmorfalsed
import typings.openpgp.anon.EncryptOptionsarmorfalsedArmor
import typings.openpgp.anon.EncryptOptionsarmortruede
import typings.openpgp.anon.EncryptOptionsarmortruedeArmor
import typings.openpgp.anon.EncryptResultdatastring
import typings.openpgp.anon.EncryptResultdatastringRe
import typings.openpgp.anon.EncryptResultdatastringsi
import typings.openpgp.anon.EncryptResultmessageMessa
import typings.openpgp.anon.EncryptResultmessageMessaMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(options: EncryptOptionsarmorfalsed): js.Promise[EncryptResultmessageMessa] = js.native
  def apply(options: EncryptOptionsarmorfalsedArmor): js.Promise[EncryptResultmessageMessaMessage] = js.native
  def apply(options: EncryptOptionsarmortruede): js.Promise[EncryptResultdatastring] = js.native
  def apply(options: EncryptOptionsarmortruedeArmor): js.Promise[EncryptResultdatastringsi] = js.native
  def apply(options: EncryptOptions): js.Promise[EncryptResultdatastringRe] = js.native
}

