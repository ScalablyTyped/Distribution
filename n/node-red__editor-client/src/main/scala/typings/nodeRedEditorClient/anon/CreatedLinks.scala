package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.edit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatedLinks extends StObject {
  
  var changes: js.Array[js.Object]
  
  var createdLinks: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var links: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var node: js.Object
  
  var t: edit
}
object CreatedLinks {
  
  inline def apply(changes: js.Array[js.Object], node: js.Object): CreatedLinks = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], t = "edit")
    __obj.asInstanceOf[CreatedLinks]
  }
  
  extension [Self <: CreatedLinks](x: Self) {
    
    inline def setChanges(value: js.Array[js.Object]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: js.Object*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    inline def setCreatedLinks(value: js.Array[js.Object]): Self = StObject.set(x, "createdLinks", value.asInstanceOf[js.Any])
    
    inline def setCreatedLinksUndefined: Self = StObject.set(x, "createdLinks", js.undefined)
    
    inline def setCreatedLinksVarargs(value: js.Object*): Self = StObject.set(x, "createdLinks", js.Array(value :_*))
    
    inline def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    inline def setNode(value: js.Object): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setT(value: edit): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
