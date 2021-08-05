package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentLink extends StObject {
  
  var link: js.UndefOr[String] = js.undefined
  
  var linkToDestination: js.UndefOr[String] = js.undefined
  
  var linkToPage: js.UndefOr[Double] = js.undefined
}
object ContentLink {
  
  inline def apply(): ContentLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentLink]
  }
  
  extension [Self <: ContentLink](x: Self) {
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkToDestination(value: String): Self = StObject.set(x, "linkToDestination", value.asInstanceOf[js.Any])
    
    inline def setLinkToDestinationUndefined: Self = StObject.set(x, "linkToDestination", js.undefined)
    
    inline def setLinkToPage(value: Double): Self = StObject.set(x, "linkToPage", value.asInstanceOf[js.Any])
    
    inline def setLinkToPageUndefined: Self = StObject.set(x, "linkToPage", js.undefined)
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
  }
}
