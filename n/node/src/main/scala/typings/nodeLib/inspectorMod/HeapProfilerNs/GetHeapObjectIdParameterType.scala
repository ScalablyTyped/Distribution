package typings
package nodeLib.inspectorMod.HeapProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHeapObjectIdParameterType extends js.Object {
  /**
    * Identifier of the object to get heap object id for.
    */
  var objectId: nodeLib.inspectorMod.RuntimeNs.RemoteObjectId
}

object GetHeapObjectIdParameterType {
  @scala.inline
  def apply(objectId: nodeLib.inspectorMod.RuntimeNs.RemoteObjectId): GetHeapObjectIdParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[GetHeapObjectIdParameterType]
  }
}

