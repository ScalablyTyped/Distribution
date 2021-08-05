package typings.openlayers.mod.olx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal with config options for the map logo.
  */
trait LogoOptions extends StObject {
  
  var href: String
  
  var src: String
}
object LogoOptions {
  
  inline def apply(href: String, src: String): LogoOptions = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogoOptions]
  }
  
  extension [Self <: LogoOptions](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
