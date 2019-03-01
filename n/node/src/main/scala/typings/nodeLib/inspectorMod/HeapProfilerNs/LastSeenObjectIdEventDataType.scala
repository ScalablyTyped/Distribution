package typings
package nodeLib.inspectorMod.HeapProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastSeenObjectIdEventDataType extends js.Object {
  var lastSeenObjectId: scala.Double
  var timestamp: scala.Double
}

object LastSeenObjectIdEventDataType {
  @scala.inline
  def apply(lastSeenObjectId: scala.Double, timestamp: scala.Double): LastSeenObjectIdEventDataType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lastSeenObjectId")(lastSeenObjectId)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[LastSeenObjectIdEventDataType]
  }
}

