package typings.openpgp.mod.key

import typings.openpgp.openpgpStrings.symmetric
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "key.getPreferredAlgo")
@js.native
object getPreferredAlgo_symmetric extends js.Object {
  
  /**
    * Returns the preferred symmetric/aead algorithm for a set of keys
    * @param type Type of preference to return
    * @param keys Set of keys
    * @param date (optional) use the given date for verification instead of the current time
    * @param userIds (optional) user IDs
    * @returns Preferred symmetric algorithm
    */
  def apply(`type`: symmetric, keys: js.Array[_], date: Date, userIds: js.Array[_]): js.Promise[typings.openpgp.mod.enums.symmetric] = js.native
}
