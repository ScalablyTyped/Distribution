package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.distAccordionSrcUseAccordionItemsMod.AccordionBuilderHeader
import typings.orbitUiReactComponents.distAccordionSrcUseAccordionItemsMod.AccordionBuilderPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header extends StObject {
  
  var header: AccordionBuilderHeader
  
  var id: String
  
  var key: String
  
  var panel: AccordionBuilderPanel
}
object Header {
  
  inline def apply(header: AccordionBuilderHeader, id: String, key: String, panel: AccordionBuilderPanel): Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  extension [Self <: Header](x: Self) {
    
    inline def setHeader(value: AccordionBuilderHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPanel(value: AccordionBuilderPanel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
  }
}
