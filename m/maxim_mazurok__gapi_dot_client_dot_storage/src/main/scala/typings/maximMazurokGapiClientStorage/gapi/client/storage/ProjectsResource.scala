package typings.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var hmacKeys: HmacKeysResource
  
  var serviceAccount: ServiceAccountResource
}
object ProjectsResource {
  
  inline def apply(hmacKeys: HmacKeysResource, serviceAccount: ServiceAccountResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(hmacKeys = hmacKeys.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  extension [Self <: ProjectsResource](x: Self) {
    
    inline def setHmacKeys(value: HmacKeysResource): Self = StObject.set(x, "hmacKeys", value.asInstanceOf[js.Any])
    
    inline def setServiceAccount(value: ServiceAccountResource): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
  }
}
