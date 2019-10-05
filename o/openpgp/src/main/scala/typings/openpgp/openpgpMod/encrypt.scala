package typings.openpgp.openpgpMod

import typings.openpgp.Anon_Armor
import typings.openpgp.Anon_ArmorDetached
import typings.openpgp.Anon_ArmorDetachedFalse
import typings.openpgp.Anon_ArmorDetachedFalseTrue
import typings.openpgp.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(
    options: (EncryptOptions with (Anon_Armor | Anon_ArmorDetached | Anon_ArmorDetachedFalse | Anon_ArmorDetachedFalseTrue)) | EncryptOptions
  ): js.Promise[EncryptResult with Anon_Data] = js.native
}

