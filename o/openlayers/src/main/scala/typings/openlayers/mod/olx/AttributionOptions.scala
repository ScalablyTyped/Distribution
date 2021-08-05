package typings.openlayers.mod.olx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributionOptions extends StObject {
  
  var html: String
}
object AttributionOptions {
  
  inline def apply(html: String): AttributionOptions = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributionOptions]
  }
  
  extension [Self <: AttributionOptions](x: Self) {
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
