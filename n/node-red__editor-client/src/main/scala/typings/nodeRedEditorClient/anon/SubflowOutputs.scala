package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubflowOutputs extends StObject {
  
  var links: js.Array[js.Object]
  
  var subflowOutputs: js.Array[js.Object]
}
object SubflowOutputs {
  
  inline def apply(links: js.Array[js.Object], subflowOutputs: js.Array[js.Object]): SubflowOutputs = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], subflowOutputs = subflowOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubflowOutputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubflowOutputs] (val x: Self) extends AnyVal {
    
    inline def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setSubflowOutputs(value: js.Array[js.Object]): Self = StObject.set(x, "subflowOutputs", value.asInstanceOf[js.Any])
    
    inline def setSubflowOutputsVarargs(value: js.Object*): Self = StObject.set(x, "subflowOutputs", js.Array(value*))
  }
}
