package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerNewProps
  extends StObject
     with NodeNewProps {
  
  /**
    * Contains the container's children.
    */
  var nodes: js.UndefOr[js.Array[ChildNode]] = js.undefined
  
  @JSName("raws")
  var raws_ContainerNewProps: js.UndefOr[ContainerRaws] = js.undefined
}
object ContainerNewProps {
  
  inline def apply(): ContainerNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerNewProps]
  }
  
  extension [Self <: ContainerNewProps](x: Self) {
    
    inline def setNodes(value: js.Array[ChildNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: ChildNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setRaws(value: ContainerRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
    
    inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
  }
}
