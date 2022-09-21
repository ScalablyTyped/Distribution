package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamworkApplicationIdentity
  extends StObject
     with Identity {
  
  /**
    * Type of application that is referenced. Possible values are: aadApplication, bot, tenantBot, office365Connector,
    * outgoingWebhook, and unknownFutureValue.
    */
  var applicationIdentityType: js.UndefOr[NullableOption[TeamworkApplicationIdentityType]] = js.undefined
}
object TeamworkApplicationIdentity {
  
  inline def apply(): TeamworkApplicationIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamworkApplicationIdentity]
  }
  
  extension [Self <: TeamworkApplicationIdentity](x: Self) {
    
    inline def setApplicationIdentityType(value: NullableOption[TeamworkApplicationIdentityType]): Self = StObject.set(x, "applicationIdentityType", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdentityTypeNull: Self = StObject.set(x, "applicationIdentityType", null)
    
    inline def setApplicationIdentityTypeUndefined: Self = StObject.set(x, "applicationIdentityType", js.undefined)
  }
}
