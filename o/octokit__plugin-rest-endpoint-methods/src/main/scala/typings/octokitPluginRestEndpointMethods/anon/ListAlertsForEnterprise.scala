package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlertsForEnterprise extends StObject {
  
  var getAlert: `1606`
  
  var listAlertsForEnterprise: `1607`
  
  var listAlertsForOrg: `1608`
  
  var listAlertsForRepo: `1609`
  
  var listLocationsForAlert: `1610`
  
  var updateAlert: `1611`
}
object ListAlertsForEnterprise {
  
  inline def apply(
    getAlert: `1606`,
    listAlertsForEnterprise: `1607`,
    listAlertsForOrg: `1608`,
    listAlertsForRepo: `1609`,
    listLocationsForAlert: `1610`,
    updateAlert: `1611`
  ): ListAlertsForEnterprise = {
    val __obj = js.Dynamic.literal(getAlert = getAlert.asInstanceOf[js.Any], listAlertsForEnterprise = listAlertsForEnterprise.asInstanceOf[js.Any], listAlertsForOrg = listAlertsForOrg.asInstanceOf[js.Any], listAlertsForRepo = listAlertsForRepo.asInstanceOf[js.Any], listLocationsForAlert = listLocationsForAlert.asInstanceOf[js.Any], updateAlert = updateAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlertsForEnterprise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAlertsForEnterprise] (val x: Self) extends AnyVal {
    
    inline def setGetAlert(value: `1606`): Self = StObject.set(x, "getAlert", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForEnterprise(value: `1607`): Self = StObject.set(x, "listAlertsForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForOrg(value: `1608`): Self = StObject.set(x, "listAlertsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForRepo(value: `1609`): Self = StObject.set(x, "listAlertsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListLocationsForAlert(value: `1610`): Self = StObject.set(x, "listLocationsForAlert", value.asInstanceOf[js.Any])
    
    inline def setUpdateAlert(value: `1611`): Self = StObject.set(x, "updateAlert", value.asInstanceOf[js.Any])
  }
}
