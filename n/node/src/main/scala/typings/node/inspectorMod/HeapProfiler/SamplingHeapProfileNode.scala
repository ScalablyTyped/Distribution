package typings.node.inspectorMod.HeapProfiler

import typings.node.inspectorMod.Runtime.CallFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sampling Heap Profile node. Holds callsite information, allocation statistics and child nodes.
  */
trait SamplingHeapProfileNode extends StObject {
  
  /**
    * Function location.
    */
  var callFrame: CallFrame
  
  /**
    * Child nodes.
    */
  var children: js.Array[SamplingHeapProfileNode]
  
  /**
    * Allocations size in bytes for the node excluding children.
    */
  var selfSize: Double
}
object SamplingHeapProfileNode {
  
  inline def apply(callFrame: CallFrame, children: js.Array[SamplingHeapProfileNode], selfSize: Double): SamplingHeapProfileNode = {
    val __obj = js.Dynamic.literal(callFrame = callFrame.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], selfSize = selfSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingHeapProfileNode]
  }
  
  extension [Self <: SamplingHeapProfileNode](x: Self) {
    
    inline def setCallFrame(value: CallFrame): Self = StObject.set(x, "callFrame", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[SamplingHeapProfileNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: SamplingHeapProfileNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setSelfSize(value: Double): Self = StObject.set(x, "selfSize", value.asInstanceOf[js.Any])
  }
}
