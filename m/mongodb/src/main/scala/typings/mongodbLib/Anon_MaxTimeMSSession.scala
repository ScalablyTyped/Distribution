package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxTimeMSSession extends js.Object {
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  var session: js.UndefOr[mongodbLib.mongodbMod.ClientSession] = js.undefined
}

object Anon_MaxTimeMSSession {
  @scala.inline
  def apply(maxTimeMS: scala.Int | scala.Double = null, session: mongodbLib.mongodbMod.ClientSession = null): Anon_MaxTimeMSSession = {
    val __obj = js.Dynamic.literal()
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_MaxTimeMSSession]
  }
}

