package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningSystem
  extends StObject
     with Identity {
  
  // Details of the system.
  var details: js.UndefOr[NullableOption[DetailsInfo]] = js.undefined
}
object ProvisioningSystem {
  
  inline def apply(): ProvisioningSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningSystem]
  }
  
  extension [Self <: ProvisioningSystem](x: Self) {
    
    inline def setDetails(value: NullableOption[DetailsInfo]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
