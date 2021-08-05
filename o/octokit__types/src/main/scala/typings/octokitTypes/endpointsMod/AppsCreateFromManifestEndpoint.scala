package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsCreateFromManifestEndpoint extends StObject {
  
  var code: String
}
object AppsCreateFromManifestEndpoint {
  
  inline def apply(code: String): AppsCreateFromManifestEndpoint = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateFromManifestEndpoint]
  }
  
  extension [Self <: AppsCreateFromManifestEndpoint](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
