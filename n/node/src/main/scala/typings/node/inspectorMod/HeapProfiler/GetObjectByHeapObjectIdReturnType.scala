package typings.node.inspectorMod.HeapProfiler

import typings.node.inspectorMod.Runtime.RemoteObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectByHeapObjectIdReturnType extends js.Object {
  /**
    * Evaluation result.
    */
  var result: RemoteObject
}

object GetObjectByHeapObjectIdReturnType {
  @scala.inline
  def apply(result: RemoteObject): GetObjectByHeapObjectIdReturnType = {
    val __obj = js.Dynamic.literal(result = result)
  
    __obj.asInstanceOf[GetObjectByHeapObjectIdReturnType]
  }
}

