package typings.openpgp.mod

import typings.openpgp.AnonArmor
import typings.openpgp.AnonArmorDetached
import typings.openpgp.AnonArmorDetachedFalse
import typings.openpgp.AnonArmorDetachedFalseTrue
import typings.openpgp.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(
    options: (EncryptOptions with AnonArmor with AnonArmorDetached with AnonArmorDetachedFalse with AnonArmorDetachedFalseTrue) | EncryptOptions
  ): js.Promise[EncryptResult with AnonData] = js.native
}

