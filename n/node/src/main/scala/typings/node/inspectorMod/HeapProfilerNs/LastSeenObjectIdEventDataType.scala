package typings.node.inspectorMod.HeapProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastSeenObjectIdEventDataType extends js.Object {
  var lastSeenObjectId: Double
  var timestamp: Double
}

object LastSeenObjectIdEventDataType {
  @scala.inline
  def apply(lastSeenObjectId: Double, timestamp: Double): LastSeenObjectIdEventDataType = {
    val __obj = js.Dynamic.literal(lastSeenObjectId = lastSeenObjectId, timestamp = timestamp)
  
    __obj.asInstanceOf[LastSeenObjectIdEventDataType]
  }
}

