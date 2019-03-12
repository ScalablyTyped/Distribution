package typings
package meteorLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Error **/
/** Method **/
trait MethodThisType extends js.Object {
  var connection: Connection | scala.Null
  var isSimulation: scala.Boolean
  var userId: java.lang.String | scala.Null
  def setUserId(userId: java.lang.String): scala.Unit
  def unblock(): scala.Unit
}

object MethodThisType {
  @scala.inline
  def apply(
    isSimulation: scala.Boolean,
    setUserId: java.lang.String => scala.Unit,
    unblock: () => scala.Unit,
    connection: Connection = null,
    userId: java.lang.String = null
  ): MethodThisType = {
    val __obj = js.Dynamic.literal(isSimulation = isSimulation, setUserId = js.Any.fromFunction1(setUserId), unblock = js.Any.fromFunction0(unblock))
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[MethodThisType]
  }
}

