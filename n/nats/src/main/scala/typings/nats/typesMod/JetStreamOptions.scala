package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JetStreamOptions extends StObject {
  
  var apiPrefix: js.UndefOr[String] = js.undefined
  
  var domain: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object JetStreamOptions {
  
  inline def apply(): JetStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JetStreamOptions]
  }
  
  extension [Self <: JetStreamOptions](x: Self) {
    
    inline def setApiPrefix(value: String): Self = StObject.set(x, "apiPrefix", value.asInstanceOf[js.Any])
    
    inline def setApiPrefixUndefined: Self = StObject.set(x, "apiPrefix", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
