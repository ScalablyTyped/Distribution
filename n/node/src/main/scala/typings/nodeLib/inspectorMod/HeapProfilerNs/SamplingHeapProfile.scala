package typings
package nodeLib.inspectorMod.HeapProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Profile.
  */
trait SamplingHeapProfile extends js.Object {
  var head: SamplingHeapProfileNode
}

object SamplingHeapProfile {
  @scala.inline
  def apply(head: SamplingHeapProfileNode): SamplingHeapProfile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("head")(head)
    __obj.asInstanceOf[SamplingHeapProfile]
  }
}

