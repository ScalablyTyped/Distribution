package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: Any
  
  var html: Any
  
  var intent: Any
  
  var linkService: Any
  
  var storage: js.UndefOr[Null] = js.undefined
}
object Element {
  
  inline def apply(element: Any, html: Any, intent: Any, linkService: Any): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], linkService = linkService.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: Any): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setIntent(value: Any): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setLinkService(value: Any): Self = StObject.set(x, "linkService", value.asInstanceOf[js.Any])
  }
}
