package typings.openpgp.openpgpMod

import typings.openpgp.Anon_Armor
import typings.openpgp.Anon_ArmorDetached
import typings.openpgp.Anon_ArmorDetachedFalse
import typings.openpgp.Anon_ArmorDetachedFalseTrue
import typings.openpgp.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "sign")
@js.native
object sign extends js.Object {
  def apply(
    options: (SignOptions with (Anon_Armor | Anon_ArmorDetached | Anon_ArmorDetachedFalse | Anon_ArmorDetachedFalseTrue)) | SignOptions
  ): js.Promise[Anon_Data] = js.native
}

