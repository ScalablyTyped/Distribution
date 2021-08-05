package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredResourceAccess extends StObject {
  
  // The list of OAuth2.0 permission scopes and app roles that the application requires from the specified resource.
  var resourceAccess: js.UndefOr[js.Array[ResourceAccess]] = js.undefined
  
  /**
    * The unique identifier for the resource that the application requires access to. This should be equal to the appId
    * declared on the target resource application.
    */
  var resourceAppId: js.UndefOr[String] = js.undefined
}
object RequiredResourceAccess {
  
  inline def apply(): RequiredResourceAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequiredResourceAccess]
  }
  
  extension [Self <: RequiredResourceAccess](x: Self) {
    
    inline def setResourceAccess(value: js.Array[ResourceAccess]): Self = StObject.set(x, "resourceAccess", value.asInstanceOf[js.Any])
    
    inline def setResourceAccessUndefined: Self = StObject.set(x, "resourceAccess", js.undefined)
    
    inline def setResourceAccessVarargs(value: ResourceAccess*): Self = StObject.set(x, "resourceAccess", js.Array(value :_*))
    
    inline def setResourceAppId(value: String): Self = StObject.set(x, "resourceAppId", value.asInstanceOf[js.Any])
    
    inline def setResourceAppIdUndefined: Self = StObject.set(x, "resourceAppId", js.undefined)
  }
}
