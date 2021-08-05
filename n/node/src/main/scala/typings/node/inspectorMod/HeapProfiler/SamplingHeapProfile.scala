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
  
  inline def apply(head: SamplingHeapProfileNode): SamplingHeapProfile = {
    val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingHeapProfile]
  }
  
  extension [Self <: SamplingHeapProfile](x: Self) {
    
    inline def setHead(value: SamplingHeapProfileNode): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
  }
}
