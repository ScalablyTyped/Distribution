package typings.openpgp.mod.key

import typings.openpgp.mod.enums.symmetric
import typings.openpgp.openpgpStrings.aead
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "key.getPreferredAlgo")
@js.native
object getPreferredAlgo_aead extends js.Object {
  def apply(`type`: aead, keys: js.Array[_], date: Date, userIds: js.Array[_]): js.Promise[symmetric] = js.native
}

