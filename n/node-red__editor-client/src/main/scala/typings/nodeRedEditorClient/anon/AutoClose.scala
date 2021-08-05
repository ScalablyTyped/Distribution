package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.PopoverInstance
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.bottom
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.click
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.hover
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.left
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.modal
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.right
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.top
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoClose extends StObject {
  
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  var content: String | (js.Function1[/* res */ PopoverInstance, Unit])
  
  var delay: js.UndefOr[Hide] = js.undefined
  
  var direction: js.UndefOr[right | left | bottom | top] = js.undefined
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var target: JQuery[HTMLElement]
  
  var tooltip: js.UndefOr[Boolean] = js.undefined
  
  var trigger: js.UndefOr[hover | click | modal] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object AutoClose {
  
  inline def apply(content: String | (js.Function1[/* res */ PopoverInstance, Unit]), target: JQuery[HTMLElement]): AutoClose = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoClose]
  }
  
  extension [Self <: AutoClose](x: Self) {
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setContent(value: String | (js.Function1[/* res */ PopoverInstance, Unit])): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction1(value: /* res */ PopoverInstance => Unit): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setDelay(value: Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDirection(value: right | left | bottom | top): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTarget(value: JQuery[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTrigger(value: hover | click | modal): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
