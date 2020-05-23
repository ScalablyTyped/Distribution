package typings.meteor.meteorMod.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Error **/
/** Method **/
trait MethodThisType extends js.Object {
  var connection: Connection | Null
  var isSimulation: Boolean
  var userId: String | Null
  def setUserId(userId: String): Unit
  def unblock(): Unit
}

object MethodThisType {
  @scala.inline
  def apply(
    isSimulation: Boolean,
    setUserId: String => Unit,
    unblock: () => Unit,
    connection: Connection = null,
    userId: String = null
  ): MethodThisType = {
    val __obj = js.Dynamic.literal(isSimulation = isSimulation.asInstanceOf[js.Any], setUserId = js.Any.fromFunction1(setUserId), unblock = js.Any.fromFunction0(unblock), connection = connection.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodThisType]
  }
}

