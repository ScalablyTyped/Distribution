package typings.nodeHueApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Api extends StObject {
  
  var api: String
  
  var software: String
}
object Api {
  
  inline def apply(api: String, software: String): Api = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], software = software.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
  
  extension [Self <: Api](x: Self) {
    
    inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setSoftware(value: String): Self = StObject.set(x, "software", value.asInstanceOf[js.Any])
  }
}
