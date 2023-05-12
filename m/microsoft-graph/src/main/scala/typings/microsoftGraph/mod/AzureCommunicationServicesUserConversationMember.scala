package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureCommunicationServicesUserConversationMember
  extends StObject
     with ConversationMember {
  
  // Azure Communication Services ID of the user.
  var azureCommunicationServicesId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AzureCommunicationServicesUserConversationMember {
  
  inline def apply(): AzureCommunicationServicesUserConversationMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureCommunicationServicesUserConversationMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AzureCommunicationServicesUserConversationMember] (val x: Self) extends AnyVal {
    
    inline def setAzureCommunicationServicesId(value: NullableOption[String]): Self = StObject.set(x, "azureCommunicationServicesId", value.asInstanceOf[js.Any])
    
    inline def setAzureCommunicationServicesIdNull: Self = StObject.set(x, "azureCommunicationServicesId", null)
    
    inline def setAzureCommunicationServicesIdUndefined: Self = StObject.set(x, "azureCommunicationServicesId", js.undefined)
  }
}
