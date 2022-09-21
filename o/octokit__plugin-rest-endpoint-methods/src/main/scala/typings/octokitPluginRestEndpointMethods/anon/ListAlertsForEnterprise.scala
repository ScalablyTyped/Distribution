package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlertsForEnterprise extends StObject {
  
  var getAlert: `1467`
  
  var listAlertsForEnterprise: `1468`
  
  var listAlertsForOrg: `1469`
  
  var listAlertsForRepo: `1470`
  
  var listLocationsForAlert: `1471`
  
  var updateAlert: `1472`
}
object ListAlertsForEnterprise {
  
  inline def apply(
    getAlert: `1467`,
    listAlertsForEnterprise: `1468`,
    listAlertsForOrg: `1469`,
    listAlertsForRepo: `1470`,
    listLocationsForAlert: `1471`,
    updateAlert: `1472`
  ): ListAlertsForEnterprise = {
    val __obj = js.Dynamic.literal(getAlert = getAlert.asInstanceOf[js.Any], listAlertsForEnterprise = listAlertsForEnterprise.asInstanceOf[js.Any], listAlertsForOrg = listAlertsForOrg.asInstanceOf[js.Any], listAlertsForRepo = listAlertsForRepo.asInstanceOf[js.Any], listLocationsForAlert = listLocationsForAlert.asInstanceOf[js.Any], updateAlert = updateAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlertsForEnterprise]
  }
  
  extension [Self <: ListAlertsForEnterprise](x: Self) {
    
    inline def setGetAlert(value: `1467`): Self = StObject.set(x, "getAlert", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForEnterprise(value: `1468`): Self = StObject.set(x, "listAlertsForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForOrg(value: `1469`): Self = StObject.set(x, "listAlertsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForRepo(value: `1470`): Self = StObject.set(x, "listAlertsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListLocationsForAlert(value: `1471`): Self = StObject.set(x, "listLocationsForAlert", value.asInstanceOf[js.Any])
    
    inline def setUpdateAlert(value: `1472`): Self = StObject.set(x, "updateAlert", value.asInstanceOf[js.Any])
  }
}
