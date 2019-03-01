package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SessionClientSession extends js.Object {
  var session: js.UndefOr[mongodbLib.mongodbMod.ClientSession] = js.undefined
}

object Anon_SessionClientSession {
  @scala.inline
  def apply(session: mongodbLib.mongodbMod.ClientSession = null): Anon_SessionClientSession = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_SessionClientSession]
  }
}

