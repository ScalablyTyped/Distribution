package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Session extends js.Object {
  var session: js.UndefOr[mongooseLib.mongooseMod.ClientSession] = js.undefined
}

object Anon_Session {
  @scala.inline
  def apply(session: mongooseLib.mongooseMod.ClientSession = null): Anon_Session = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_Session]
  }
}

