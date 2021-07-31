package typings.node.inspectorMod.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Profile.
  */
trait SamplingHeapProfile extends StObject {
  
  var head: SamplingHeapProfileNode
}
object SamplingHeapProfile {
  
  @scala.inline
  def apply(head: SamplingHeapProfileNode): SamplingHeapProfile = {
    val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingHeapProfile]
  }
  
  @scala.inline
  implicit class SamplingHeapProfileMutableBuilder[Self <: SamplingHeapProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHead(value: SamplingHeapProfileNode): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
  }
}
