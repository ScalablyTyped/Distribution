package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// -----------------------------------
trait Container
  extends StObject
     with Widget {
  
  var child: Widget
  
  var childName: String
  
  var containerNode: HTMLElement
  
  // readonly
  var horizontalChildExpansion: Boolean
  
  def removeChild(widget: Widget): Unit
  
  var verticalChildExpansion: Boolean
}
object Container {
  
  @scala.inline
  def apply(
    absolutePosition: X,
    addClass: String => Unit,
    child: Widget,
    childName: String,
    containerNode: HTMLElement,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: () => Unit,
    hide: () => Unit,
    horizontalChildExpansion: Boolean,
    html: HTMLElement,
    layoutOptions: StringDictionary[js.Any],
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    parent: Widget,
    parentName: String,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    removeChild: Widget => Unit,
    removeClass: String => Unit,
    show: () => Unit,
    tooltip: String,
    unparent: () => Unit,
    verticalChildExpansion: Boolean,
    visible: Boolean
  ): Container = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1(addClass), child = child.asInstanceOf[js.Any], childName = childName.asInstanceOf[js.Any], containerNode = containerNode.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), horizontalChildExpansion = horizontalChildExpansion.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeChild = js.Any.fromFunction1(removeChild), removeClass = js.Any.fromFunction1(removeClass), show = js.Any.fromFunction0(show), tooltip = tooltip.asInstanceOf[js.Any], unparent = js.Any.fromFunction0(unparent), verticalChildExpansion = verticalChildExpansion.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChild(value: Widget): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildName(value: String): Self = StObject.set(x, "childName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNode(value: HTMLElement): Self = StObject.set(x, "containerNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalChildExpansion(value: Boolean): Self = StObject.set(x, "horizontalChildExpansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveChild(value: Widget => Unit): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerticalChildExpansion(value: Boolean): Self = StObject.set(x, "verticalChildExpansion", value.asInstanceOf[js.Any])
  }
}
