package typings.openpgp.openpgpMod

import typings.openpgp.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "generateKey")
@js.native
object generateKey extends js.Object {
  def apply(option: KeyOptions): js.Promise[Anon_Key] = js.native
}

