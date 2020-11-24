package typings.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeapStatsUpdateEventDataType extends js.Object {
  
  /**
    * An array of triplets. Each triplet describes a fragment. The first integer is the fragment index, the second integer is a total count of objects for the fragment, the third integer is a total size of the objects for the fragment.
    */
  var statsUpdate: js.Array[Double] = js.native
}
object HeapStatsUpdateEventDataType {
  
  @scala.inline
  def apply(statsUpdate: js.Array[Double]): HeapStatsUpdateEventDataType = {
    val __obj = js.Dynamic.literal(statsUpdate = statsUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapStatsUpdateEventDataType]
  }
  
  @scala.inline
  implicit class HeapStatsUpdateEventDataTypeOps[Self <: HeapStatsUpdateEventDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStatsUpdateVarargs(value: Double*): Self = this.set("statsUpdate", js.Array(value :_*))
    
    @scala.inline
    def setStatsUpdate(value: js.Array[Double]): Self = this.set("statsUpdate", value.asInstanceOf[js.Any])
  }
}
