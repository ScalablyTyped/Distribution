package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.Handle
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Elements extends js.Object {
  
  var content: HTMLElement = js.native
  
  var host: HTMLElement = js.native
  
  var padding: HTMLElement = js.native
  
  var scrollbarCorner: HTMLElement = js.native
  
  var scrollbarHorizontal: Handle = js.native
  
  var scrollbarVertical: Handle = js.native
  
  var target: HTMLElement = js.native
  
  var viewport: HTMLElement = js.native
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
  implicit class ElementsOps[Self <: Elements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent(value: HTMLElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: HTMLElement): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: HTMLElement): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarCorner(value: HTMLElement): Self = this.set("scrollbarCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarHorizontal(value: Handle): Self = this.set("scrollbarHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarVertical(value: Handle): Self = this.set("scrollbarVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewport(value: HTMLElement): Self = this.set("viewport", value.asInstanceOf[js.Any])
  }
}
