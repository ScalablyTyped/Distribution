package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubflowInputs extends StObject {
  
  var links: js.Array[js.Object] = js.native
  
  var subflowInputs: js.Array[js.Object] = js.native
}
object SubflowInputs {
  
  @scala.inline
  def apply(links: js.Array[js.Object], subflowInputs: js.Array[js.Object]): SubflowInputs = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], subflowInputs = subflowInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubflowInputs]
  }
  
  @scala.inline
  implicit class SubflowInputsMutableBuilder[Self <: SubflowInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setSubflowInputs(value: js.Array[js.Object]): Self = StObject.set(x, "subflowInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubflowInputsVarargs(value: js.Object*): Self = StObject.set(x, "subflowInputs", js.Array(value :_*))
  }
}
