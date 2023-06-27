package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlertsForEnterprise extends StObject {
  
  var getAlert: `1610`
  
  var listAlertsForEnterprise: `1611`
  
  var listAlertsForOrg: `1612`
  
  var listAlertsForRepo: `1613`
  
  var listLocationsForAlert: `1614`
  
  var updateAlert: `1615`
}
object ListAlertsForEnterprise {
  
  inline def apply(
    getAlert: `1610`,
    listAlertsForEnterprise: `1611`,
    listAlertsForOrg: `1612`,
    listAlertsForRepo: `1613`,
    listLocationsForAlert: `1614`,
    updateAlert: `1615`
  ): ListAlertsForEnterprise = {
    val __obj = js.Dynamic.literal(getAlert = getAlert.asInstanceOf[js.Any], listAlertsForEnterprise = listAlertsForEnterprise.asInstanceOf[js.Any], listAlertsForOrg = listAlertsForOrg.asInstanceOf[js.Any], listAlertsForRepo = listAlertsForRepo.asInstanceOf[js.Any], listLocationsForAlert = listLocationsForAlert.asInstanceOf[js.Any], updateAlert = updateAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlertsForEnterprise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAlertsForEnterprise] (val x: Self) extends AnyVal {
    
    inline def setGetAlert(value: `1610`): Self = StObject.set(x, "getAlert", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForEnterprise(value: `1611`): Self = StObject.set(x, "listAlertsForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForOrg(value: `1612`): Self = StObject.set(x, "listAlertsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForRepo(value: `1613`): Self = StObject.set(x, "listAlertsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListLocationsForAlert(value: `1614`): Self = StObject.set(x, "listLocationsForAlert", value.asInstanceOf[js.Any])
    
    inline def setUpdateAlert(value: `1615`): Self = StObject.set(x, "updateAlert", value.asInstanceOf[js.Any])
  }
}
