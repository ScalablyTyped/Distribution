package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var container: Any
  
  var isOffscreenCanvasSupported: Any
  
  var textContentItemsStr: Any
  
  var textContentSource: Any
  
  var textDivProperties: Any
  
  var textDivs: Any
  
  var viewport: Any
}
object Container {
  
  inline def apply(
    container: Any,
    isOffscreenCanvasSupported: Any,
    textContentItemsStr: Any,
    textContentSource: Any,
    textDivProperties: Any,
    textDivs: Any,
    viewport: Any
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], isOffscreenCanvasSupported = isOffscreenCanvasSupported.asInstanceOf[js.Any], textContentItemsStr = textContentItemsStr.asInstanceOf[js.Any], textContentSource = textContentSource.asInstanceOf[js.Any], textDivProperties = textDivProperties.asInstanceOf[js.Any], textDivs = textDivs.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setIsOffscreenCanvasSupported(value: Any): Self = StObject.set(x, "isOffscreenCanvasSupported", value.asInstanceOf[js.Any])
    
    inline def setTextContentItemsStr(value: Any): Self = StObject.set(x, "textContentItemsStr", value.asInstanceOf[js.Any])
    
    inline def setTextContentSource(value: Any): Self = StObject.set(x, "textContentSource", value.asInstanceOf[js.Any])
    
    inline def setTextDivProperties(value: Any): Self = StObject.set(x, "textDivProperties", value.asInstanceOf[js.Any])
    
    inline def setTextDivs(value: Any): Self = StObject.set(x, "textDivs", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: Any): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
