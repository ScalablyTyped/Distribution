package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedLocale extends StObject {
  
  var defaultLocale: String
  
  var detectedLocale: String
  
  var routeNoAssetPath: String
}
object DetectedLocale {
  
  inline def apply(defaultLocale: String, detectedLocale: String, routeNoAssetPath: String): DetectedLocale = {
    val __obj = js.Dynamic.literal(defaultLocale = defaultLocale.asInstanceOf[js.Any], detectedLocale = detectedLocale.asInstanceOf[js.Any], routeNoAssetPath = routeNoAssetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedLocale]
  }
  
  extension [Self <: DetectedLocale](x: Self) {
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDetectedLocale(value: String): Self = StObject.set(x, "detectedLocale", value.asInstanceOf[js.Any])
    
    inline def setRouteNoAssetPath(value: String): Self = StObject.set(x, "routeNoAssetPath", value.asInstanceOf[js.Any])
  }
}
