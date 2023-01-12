package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubflowInputs extends StObject {
  
  var links: js.Array[js.Object]
  
  var subflowInputs: js.Array[js.Object]
}
object SubflowInputs {
  
  inline def apply(links: js.Array[js.Object], subflowInputs: js.Array[js.Object]): SubflowInputs = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], subflowInputs = subflowInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubflowInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubflowInputs] (val x: Self) extends AnyVal {
    
    inline def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setSubflowInputs(value: js.Array[js.Object]): Self = StObject.set(x, "subflowInputs", value.asInstanceOf[js.Any])
    
    inline def setSubflowInputsVarargs(value: js.Object*): Self = StObject.set(x, "subflowInputs", js.Array(value*))
  }
}
