package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertInstallation extends StObject {
  
  /** @enum {string} */
  var action: js.UndefOr[created_] = js.undefined
  
  var alert: Pushprotectionbypassedat
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var location: DetailsType
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object AlertInstallation {
  
  inline def apply(
    alert: Pushprotectionbypassedat,
    location: DetailsType,
    repository: Allowupdatebranch,
    sender: Avatarurl
  ): AlertInstallation = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertInstallation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlertInstallation] (val x: Self) extends AnyVal {
    
    inline def setAction(value: created_): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAlert(value: Pushprotectionbypassedat): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setLocation(value: DetailsType): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
