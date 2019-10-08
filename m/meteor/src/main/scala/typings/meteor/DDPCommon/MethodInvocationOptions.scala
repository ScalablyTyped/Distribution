package typings.meteor.DDPCommon

import typings.meteor.Meteor.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodInvocationOptions extends js.Object {
  var connection: Connection
  var isSimulation: Boolean
  var randomSeed: String
  var setUserId: js.UndefOr[js.Function1[/* newUserId */ String, Unit]] = js.undefined
  var userId: String | Null
}

object MethodInvocationOptions {
  @scala.inline
  def apply(
    connection: Connection,
    isSimulation: Boolean,
    randomSeed: String,
    setUserId: /* newUserId */ String => Unit = null,
    userId: String = null
  ): MethodInvocationOptions = {
    val __obj = js.Dynamic.literal(connection = connection, isSimulation = isSimulation, randomSeed = randomSeed)
    if (setUserId != null) __obj.updateDynamic("setUserId")(js.Any.fromFunction1(setUserId))
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[MethodInvocationOptions]
  }
}

