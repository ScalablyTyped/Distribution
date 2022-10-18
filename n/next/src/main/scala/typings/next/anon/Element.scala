package typings.next.anon

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var ReactDOMServer: Any
  
  var element: ReactElement
  
  var streamOptions: js.UndefOr[Any] = js.undefined
}
object Element {
  
  inline def apply(ReactDOMServer: Any, element: ReactElement): Element = {
    val __obj = js.Dynamic.literal(ReactDOMServer = ReactDOMServer.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setElement(value: ReactElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setReactDOMServer(value: Any): Self = StObject.set(x, "ReactDOMServer", value.asInstanceOf[js.Any])
    
    inline def setStreamOptions(value: Any): Self = StObject.set(x, "streamOptions", value.asInstanceOf[js.Any])
    
    inline def setStreamOptionsUndefined: Self = StObject.set(x, "streamOptions", js.undefined)
  }
}
