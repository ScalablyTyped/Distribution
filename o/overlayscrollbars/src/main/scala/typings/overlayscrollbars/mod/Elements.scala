package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.Handle
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elements extends StObject {
  
  var content: HTMLElement
  
  var host: HTMLElement
  
  var padding: HTMLElement
  
  var scrollbarCorner: HTMLElement
  
  var scrollbarHorizontal: Handle
  
  var scrollbarVertical: Handle
  
  var target: HTMLElement
  
  var viewport: HTMLElement
}
object Elements {
  
  @scala.inline
  def apply(
    content: HTMLElement,
    host: HTMLElement,
    padding: HTMLElement,
    scrollbarCorner: HTMLElement,
    scrollbarHorizontal: Handle,
    scrollbarVertical: Handle,
    target: HTMLElement,
    viewport: HTMLElement
  ): Elements = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], scrollbarCorner = scrollbarCorner.asInstanceOf[js.Any], scrollbarHorizontal = scrollbarHorizontal.asInstanceOf[js.Any], scrollbarVertical = scrollbarVertical.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements]
  }
  
  @scala.inline
  implicit class ElementsMutableBuilder[Self <: Elements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: HTMLElement): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarCorner(value: HTMLElement): Self = StObject.set(x, "scrollbarCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarHorizontal(value: Handle): Self = StObject.set(x, "scrollbarHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarVertical(value: Handle): Self = StObject.set(x, "scrollbarVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewport(value: HTMLElement): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
