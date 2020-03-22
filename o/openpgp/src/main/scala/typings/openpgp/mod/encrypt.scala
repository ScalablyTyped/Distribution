package typings.openpgp.mod

import typings.openpgp.EncryptOptionsarmorfalsed
import typings.openpgp.EncryptOptionsarmorfalsedArmor
import typings.openpgp.EncryptOptionsarmortruede
import typings.openpgp.EncryptOptionsarmortruedeArmor
import typings.openpgp.EncryptResultdatastring
import typings.openpgp.EncryptResultdatastringRe
import typings.openpgp.EncryptResultdatastringsi
import typings.openpgp.EncryptResultmessageMessa
import typings.openpgp.EncryptResultmessageMessaMessage
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

