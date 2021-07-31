package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/tree-item/
trait TreeItem extends StObject {
  
  var collapsibleState: TreeItemCollapsibleState
  
  // https://dev.panic.com/panic/nova-issues/-/issues/909
  var color: js.UndefOr[Color] = js.undefined
  
  var command: js.UndefOr[js.Any] = js.undefined
  
  var contextValue: js.UndefOr[String] = js.undefined
  
  var descriptiveText: js.UndefOr[String] = js.undefined
  
  var identifier: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var path: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[String] = js.undefined
}
object TreeItem {
  
  @scala.inline
  def apply(collapsibleState: TreeItemCollapsibleState, name: String): TreeItem = {
    val __obj = js.Dynamic.literal(collapsibleState = collapsibleState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeItem]
  }
  
  @scala.inline
  implicit class TreeItemMutableBuilder[Self <: TreeItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsibleState(value: TreeItemCollapsibleState): Self = StObject.set(x, "collapsibleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCommand(value: js.Any): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setContextValue(value: String): Self = StObject.set(x, "contextValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextValueUndefined: Self = StObject.set(x, "contextValue", js.undefined)
    
    @scala.inline
    def setDescriptiveText(value: String): Self = StObject.set(x, "descriptiveText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptiveTextUndefined: Self = StObject.set(x, "descriptiveText", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
