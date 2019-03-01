package typings
package nodeLib.inspectorMod.HeapProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTrackingHeapObjectsParameterType extends js.Object {
  var trackAllocations: js.UndefOr[scala.Boolean] = js.undefined
}

object StartTrackingHeapObjectsParameterType {
  @scala.inline
  def apply(trackAllocations: js.UndefOr[scala.Boolean] = js.undefined): StartTrackingHeapObjectsParameterType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(trackAllocations)) __obj.updateDynamic("trackAllocations")(trackAllocations)
    __obj.asInstanceOf[StartTrackingHeapObjectsParameterType]
  }
}

