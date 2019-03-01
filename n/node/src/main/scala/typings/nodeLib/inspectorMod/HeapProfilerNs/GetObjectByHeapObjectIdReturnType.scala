package typings
package nodeLib.inspectorMod.HeapProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectByHeapObjectIdReturnType extends js.Object {
  /**
    * Evaluation result.
    */
  var result: nodeLib.inspectorMod.RuntimeNs.RemoteObject
}

object GetObjectByHeapObjectIdReturnType {
  @scala.inline
  def apply(result: nodeLib.inspectorMod.RuntimeNs.RemoteObject): GetObjectByHeapObjectIdReturnType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[GetObjectByHeapObjectIdReturnType]
  }
}

