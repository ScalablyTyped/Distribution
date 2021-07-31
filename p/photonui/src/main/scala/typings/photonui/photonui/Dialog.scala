package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dialog
  extends StObject
     with Window {
  
  def addButton(widget: Widget, layoutOptions: js.Any): Unit
  
  var buttonNames: js.Array[String]
  
  var buttons: js.Array[Widget]
  
  def removeButton(widget: Widget): Unit
}
object Dialog {
  
  @scala.inline
  def apply(
    absolutePosition: X,
    addButton: (Widget, js.Any) => Unit,
    addClass: String => Unit,
    buttonNames: js.Array[String],
    buttons: js.Array[Widget],
    center: () => Unit,
    child: Widget,
    childName: String,
    closeButtonVisible: Boolean,
    containerNode: HTMLElement,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: () => Unit,
    height: Double,
    hide: () => Unit,
    horizontalChildExpansion: Boolean,
    html: HTMLElement,
    layoutOptions: StringDictionary[js.Any],
    maxHeight: Double,
    maxWidth: Double,
    minHeight: Double,
    minWidth: Double,
    modal: Boolean,
    movable: Boolean,
    moveToBack: () => Unit,
    moveToFront: () => Unit,
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    padding: Double,
    parent: Widget,
    parentName: String,
    position: X,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeButton: Widget => Unit,
    removeCallback: String => Unit,
    removeChild: Widget => Unit,
    removeClass: String => Unit,
    show: () => Unit,
    title: String,
    tooltip: String,
    unparent: () => Unit,
    verticalChildExpansion: Boolean,
    visible: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): Dialog = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addButton = js.Any.fromFunction2(addButton), addClass = js.Any.fromFunction1(addClass), buttonNames = buttonNames.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], center = js.Any.fromFunction0(center), child = child.asInstanceOf[js.Any], childName = childName.asInstanceOf[js.Any], closeButtonVisible = closeButtonVisible.asInstanceOf[js.Any], containerNode = containerNode.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), height = height.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), horizontalChildExpansion = horizontalChildExpansion.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], movable = movable.asInstanceOf[js.Any], moveToBack = js.Any.fromFunction0(moveToBack), moveToFront = js.Any.fromFunction0(moveToFront), name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeButton = js.Any.fromFunction1(removeButton), removeCallback = js.Any.fromFunction1(removeCallback), removeChild = js.Any.fromFunction1(removeChild), removeClass = js.Any.fromFunction1(removeClass), show = js.Any.fromFunction0(show), title = title.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], unparent = js.Any.fromFunction0(unparent), verticalChildExpansion = verticalChildExpansion.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dialog]
  }
  
  @scala.inline
  implicit class DialogMutableBuilder[Self <: Dialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddButton(value: (Widget, js.Any) => Unit): Self = StObject.set(x, "addButton", js.Any.fromFunction2(value))
    
    @scala.inline
    def setButtonNames(value: js.Array[String]): Self = StObject.set(x, "buttonNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonNamesVarargs(value: String*): Self = StObject.set(x, "buttonNames", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[Widget]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: Widget*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setRemoveButton(value: Widget => Unit): Self = StObject.set(x, "removeButton", js.Any.fromFunction1(value))
  }
}
