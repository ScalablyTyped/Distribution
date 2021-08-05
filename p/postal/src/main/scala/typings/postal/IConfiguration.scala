package typings.postal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConfiguration extends StObject {
  
  var DEFAULT_CHANNEL: String
  
  var SYSTEM_CHANNEL: String
  
  var resolver: IResolver
}
object IConfiguration {
  
  inline def apply(DEFAULT_CHANNEL: String, SYSTEM_CHANNEL: String, resolver: IResolver): IConfiguration = {
    val __obj = js.Dynamic.literal(DEFAULT_CHANNEL = DEFAULT_CHANNEL.asInstanceOf[js.Any], SYSTEM_CHANNEL = SYSTEM_CHANNEL.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfiguration]
  }
  
  extension [Self <: IConfiguration](x: Self) {
    
    inline def setDEFAULT_CHANNEL(value: String): Self = StObject.set(x, "DEFAULT_CHANNEL", value.asInstanceOf[js.Any])
    
    inline def setResolver(value: IResolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setSYSTEM_CHANNEL(value: String): Self = StObject.set(x, "SYSTEM_CHANNEL", value.asInstanceOf[js.Any])
  }
}
