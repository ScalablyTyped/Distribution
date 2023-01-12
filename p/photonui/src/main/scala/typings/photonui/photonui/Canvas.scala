package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canvas
  extends StObject
     with Widget {
  
  var canvas: HTMLElement
  
  def getContext(contextId: String): Any
  
  var height: Double
  
  var interactiveMode: HTMLElement
  
  def setContext(contextId: String): Unit
  
  def supportsContext(contextId: String): Boolean
  
  def toBlod(imageFormat: String): Any
  
  // returns Blob
  def toBlodHD(imageFormat: String): Any
  
  // returns Blob
  def toDataUrl(imageFormat: String): String
  
  def toDataUrlHD(imageFormat: String): String
  
  def transferControlToProxy(): Unit
  
  var width: Double
}
object Canvas {
  
  inline def apply(
    absolutePosition: X,
    addClass: String => Unit,
    canvas: HTMLElement,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: () => Unit,
    getContext: String => Any,
    height: Double,
    hide: () => Unit,
    html: HTMLElement,
    interactiveMode: HTMLElement,
    layoutOptions: StringDictionary[Any],
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    parent: Widget,
    parentName: String,
    registerCallback: (String, String, js.Function, Any) => Unit,
    removeCallback: String => Unit,
    removeClass: String => Unit,
    setContext: String => Unit,
    show: () => Unit,
    supportsContext: String => Boolean,
    toBlod: String => Any,
    toBlodHD: String => Any,
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
  implicit open class MutableBuilder[Self <: Canvas] (val x: Self) extends AnyVal {
    
    inline def setCanvas(value: HTMLElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setGetContext(value: String => Any): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setInteractiveMode(value: HTMLElement): Self = StObject.set(x, "interactiveMode", value.asInstanceOf[js.Any])
    
    inline def setSetContext(value: String => Unit): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    inline def setSupportsContext(value: String => Boolean): Self = StObject.set(x, "supportsContext", js.Any.fromFunction1(value))
    
    inline def setToBlod(value: String => Any): Self = StObject.set(x, "toBlod", js.Any.fromFunction1(value))
    
    inline def setToBlodHD(value: String => Any): Self = StObject.set(x, "toBlodHD", js.Any.fromFunction1(value))
    
    inline def setToDataUrl(value: String => String): Self = StObject.set(x, "toDataUrl", js.Any.fromFunction1(value))
    
    inline def setToDataUrlHD(value: String => String): Self = StObject.set(x, "toDataUrlHD", js.Any.fromFunction1(value))
    
    inline def setTransferControlToProxy(value: () => Unit): Self = StObject.set(x, "transferControlToProxy", js.Any.fromFunction0(value))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
