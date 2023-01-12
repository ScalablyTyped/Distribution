package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var container: Any
  
  var textContent: Any
  
  var textContentItemsStr: Any
  
  var textContentStream: Any
  
  var textDivs: Any
  
  var viewport: Any
}
object Container {
  
  inline def apply(
    container: Any,
    textContent: Any,
    textContentItemsStr: Any,
    textContentStream: Any,
    textDivs: Any,
    viewport: Any
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any], textContentItemsStr = textContentItemsStr.asInstanceOf[js.Any], textContentStream = textContentStream.asInstanceOf[js.Any], textDivs = textDivs.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setTextContent(value: Any): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    
    inline def setTextContentItemsStr(value: Any): Self = StObject.set(x, "textContentItemsStr", value.asInstanceOf[js.Any])
    
    inline def setTextContentStream(value: Any): Self = StObject.set(x, "textContentStream", value.asInstanceOf[js.Any])
    
    inline def setTextDivs(value: Any): Self = StObject.set(x, "textDivs", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: Any): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
