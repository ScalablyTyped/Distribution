package typings.openpgp.mod

import typings.openpgp.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "generateKey")
@js.native
object generateKey extends js.Object {
  def apply(option: KeyOptions): js.Promise[AnonKey] = js.native
}

