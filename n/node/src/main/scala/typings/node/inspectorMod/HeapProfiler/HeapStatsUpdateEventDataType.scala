package typings.node.inspectorMod.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeapStatsUpdateEventDataType extends StObject {
  
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
  implicit class HeapStatsUpdateEventDataTypeMutableBuilder[Self <: HeapStatsUpdateEventDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatsUpdate(value: js.Array[Double]): Self = StObject.set(x, "statsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUpdateVarargs(value: Double*): Self = StObject.set(x, "statsUpdate", js.Array(value :_*))
  }
}
