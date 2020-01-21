package typings.openpgp.mod

import typings.openpgp.AnonArmor
import typings.openpgp.AnonArmorDetached
import typings.openpgp.AnonArmorDetachedFalse
import typings.openpgp.AnonArmorDetachedFalseTrue
import typings.openpgp.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "sign")
@js.native
object sign extends js.Object {
  def apply(
    options: (SignOptions with AnonArmor with AnonArmorDetachedFalse with AnonArmorDetached with AnonArmorDetachedFalseTrue) | SignOptions
  ): js.Promise[AnonData] = js.native
}

