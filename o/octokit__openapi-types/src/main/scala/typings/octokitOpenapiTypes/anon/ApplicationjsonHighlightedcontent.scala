package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonHighlightedcontent extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Highlightedcontent
}
object ApplicationjsonHighlightedcontent {
  
  inline def apply(applicationSlashjson: Highlightedcontent): ApplicationjsonHighlightedcontent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonHighlightedcontent]
  }
  
  extension [Self <: ApplicationjsonHighlightedcontent](x: Self) {
    
    inline def setApplicationSlashjson(value: Highlightedcontent): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
