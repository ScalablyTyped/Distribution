package typings.nodeRedEditorClient.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableOnEdit extends StObject {
  
  var enableOnEdit: js.UndefOr[Boolean] = js.undefined
  
  var iconClass: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var name: String
  
  var toolbar: js.UndefOr[HTMLElement] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object EnableOnEdit {
  
  inline def apply(id: String, name: String): EnableOnEdit = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableOnEdit]
  }
  
  extension [Self <: EnableOnEdit](x: Self) {
    
    inline def setEnableOnEdit(value: Boolean): Self = StObject.set(x, "enableOnEdit", value.asInstanceOf[js.Any])
    
    inline def setEnableOnEditUndefined: Self = StObject.set(x, "enableOnEdit", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setToolbar(value: HTMLElement): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
