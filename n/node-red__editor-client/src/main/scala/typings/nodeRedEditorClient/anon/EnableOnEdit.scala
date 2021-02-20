package typings.nodeRedEditorClient.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableOnEdit extends StObject {
  
  var enableOnEdit: js.UndefOr[Boolean] = js.native
  
  var iconClass: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var name: String = js.native
  
  var toolbar: js.UndefOr[HTMLElement] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object EnableOnEdit {
  
  @scala.inline
  def apply(id: String, name: String): EnableOnEdit = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableOnEdit]
  }
  
  @scala.inline
  implicit class EnableOnEditMutableBuilder[Self <: EnableOnEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableOnEdit(value: Boolean): Self = StObject.set(x, "enableOnEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableOnEditUndefined: Self = StObject.set(x, "enableOnEdit", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar(value: HTMLElement): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
