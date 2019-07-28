package typings.mongoose

import typings.mongoose.mongooseMod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Session extends js.Object {
  var session: js.UndefOr[ClientSession] = js.undefined
}

object Anon_Session {
  @scala.inline
  def apply(session: ClientSession = null): Anon_Session = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_Session]
  }
}

