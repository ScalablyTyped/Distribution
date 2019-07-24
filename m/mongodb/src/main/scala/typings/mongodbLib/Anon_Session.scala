package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Session extends js.Object {
  var session: js.UndefOr[mongodbLib.mongodbMod.ClientSession] = js.undefined
  var startAtOperationTime: js.UndefOr[bsonLib.bsonMod.Timestamp] = js.undefined
}

object Anon_Session {
  @scala.inline
  def apply(
    session: mongodbLib.mongodbMod.ClientSession = null,
    startAtOperationTime: bsonLib.bsonMod.Timestamp = null
  ): Anon_Session = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session)
    if (startAtOperationTime != null) __obj.updateDynamic("startAtOperationTime")(startAtOperationTime)
    __obj.asInstanceOf[Anon_Session]
  }
}

