package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationServicePrincipal extends StObject {
  
  var application: js.UndefOr[NullableOption[Application]] = js.undefined
  
  var servicePrincipal: js.UndefOr[NullableOption[ServicePrincipal]] = js.undefined
}
object ApplicationServicePrincipal {
  
  inline def apply(): ApplicationServicePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationServicePrincipal]
  }
  
  extension [Self <: ApplicationServicePrincipal](x: Self) {
    
    inline def setApplication(value: NullableOption[Application]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationNull: Self = StObject.set(x, "application", null)
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setServicePrincipal(value: NullableOption[ServicePrincipal]): Self = StObject.set(x, "servicePrincipal", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalNull: Self = StObject.set(x, "servicePrincipal", null)
    
    inline def setServicePrincipalUndefined: Self = StObject.set(x, "servicePrincipal", js.undefined)
  }
}
