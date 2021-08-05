package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OServerConfig extends StObject {
  
  var host: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
}
object OServerConfig {
  
  inline def apply(): OServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OServerConfig]
  }
  
  extension [Self <: OServerConfig](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
