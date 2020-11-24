package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Canvas extends Widget {
  
  var canvas: HTMLElement = js.native
  
  def getContext(contextId: String): js.Any = js.native
  
  var height: Double = js.native
  
  var interactiveMode: HTMLElement = js.native
  
  def setContext(contextId: String): Unit = js.native
  
  def supportsContext(contextId: String): Boolean = js.native
  
  def toBlod(imageFormat: String): js.Any = js.native
  
   // returns Blob
  def toBlodHD(imageFormat: String): js.Any = js.native
  
   // returns Blob
  def toDataUrl(imageFormat: String): String = js.native
  
  def toDataUrlHD(imageFormat: String): String = js.native
  
  def transferControlToProxy(): Unit = js.native
  
  var width: Double = js.native
}
object Canvas {
  
  @scala.inline
  def apply(
    absolutePosition: X,
    addClass: String => Unit,
    canvas: HTMLElement,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: () => Unit,
    getContext: String => js.Any,
    height: Double,
    hide: () => Unit,
    html: HTMLElement,
    interactiveMode: HTMLElement,
    layoutOptions: StringDictionary[js.Any],
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    parent: Widget,
    parentName: String,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    removeClass: String => Unit,
    setContext: String => Unit,
    show: () => Unit,
    supportsContext: String => Boolean,
    toBlod: String => js.Any,
    toBlodHD: String => js.Any,
    toDataUrl: String => String,
    toDataUrlHD: String => String,
    tooltip: String,
    transferControlToProxy: () => Unit,
    unparent: () => Unit,
    visible: Boolean,
    width: Double
  ): Canvas = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1(addClass), canvas = canvas.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getContext = js.Any.fromFunction1(getContext), height = height.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), html = html.asInstanceOf[js.Any], interactiveMode = interactiveMode.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeClass = js.Any.fromFunction1(removeClass), setContext = js.Any.fromFunction1(setContext), show = js.Any.fromFunction0(show), supportsContext = js.Any.fromFunction1(supportsContext), toBlod = js.Any.fromFunction1(toBlod), toBlodHD = js.Any.fromFunction1(toBlodHD), toDataUrl = js.Any.fromFunction1(toDataUrl), toDataUrlHD = js.Any.fromFunction1(toDataUrlHD), tooltip = tooltip.asInstanceOf[js.Any], transferControlToProxy = js.Any.fromFunction0(transferControlToProxy), unparent = js.Any.fromFunction0(unparent), visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
  
  @scala.inline
  implicit class CanvasOps[Self <: Canvas] (val x: Self) extends AnyVal {
    
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
    def setCanvas(value: HTMLElement): Self = this.set("canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContext(value: String => js.Any): Self = this.set("getContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveMode(value: HTMLElement): Self = this.set("interactiveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetContext(value: String => Unit): Self = this.set("setContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSupportsContext(value: String => Boolean): Self = this.set("supportsContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToBlod(value: String => js.Any): Self = this.set("toBlod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToBlodHD(value: String => js.Any): Self = this.set("toBlodHD", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToDataUrl(value: String => String): Self = this.set("toDataUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToDataUrlHD(value: String => String): Self = this.set("toDataUrlHD", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransferControlToProxy(value: () => Unit): Self = this.set("transferControlToProxy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
