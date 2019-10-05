package typings.openpgp.openpgpMod.key

import typings.openpgp.openpgpMod.packet.SecretKey
import typings.openpgp.openpgpMod.packet.SecretSubkey
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "key.getPreferredHashAlgo")
@js.native
object getPreferredHashAlgo extends js.Object {
  /**
    * Returns the preferred signature hash algorithm of a key
    * @param key (optional) the key to get preferences from
    * @param keyPacket key packet used for signing
    * @param date (optional) use the given date for verification instead of the current time
    * @param userId (optional) user ID
    * @returns
    */
  def apply(key: Key, keyPacket: SecretKey, date: Date, userId: js.Object): js.Promise[String] = js.native
  def apply(key: Key, keyPacket: SecretSubkey, date: Date, userId: js.Object): js.Promise[String] = js.native
}

