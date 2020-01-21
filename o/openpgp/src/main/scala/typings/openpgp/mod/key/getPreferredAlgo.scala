package typings.openpgp.mod.key

import typings.openpgp.mod.enums.symmetric
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "key.getPreferredAlgo")
@js.native
object getPreferredAlgo extends js.Object {
  /**
    * Returns the preferred symmetric/aead algorithm for a set of keys
    * @param {symmetric | aead} type Type of preference to return
    * @param keys Set of keys
    * @param date (optional) use the given date for verification instead of the current time
    * @param userIds (optional) user IDs
    * @returns Preferred symmetric algorithm
    */
  def apply(`type`: js.Any, keys: js.Array[_], date: Date, userIds: js.Array[_]): js.Promise[symmetric] = js.native
}

