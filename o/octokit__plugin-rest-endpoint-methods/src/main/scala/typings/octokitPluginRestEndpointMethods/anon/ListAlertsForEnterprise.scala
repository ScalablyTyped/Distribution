package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlertsForEnterprise extends StObject {
  
  var getAlert: `1495`
  
  var listAlertsForEnterprise: `1496`
  
  var listAlertsForOrg: `1497`
  
  var listAlertsForRepo: `1498`
  
  var listLocationsForAlert: `1499`
  
  var updateAlert: `1500`
}
object ListAlertsForEnterprise {
  
  inline def apply(
    getAlert: `1495`,
    listAlertsForEnterprise: `1496`,
    listAlertsForOrg: `1497`,
    listAlertsForRepo: `1498`,
    listLocationsForAlert: `1499`,
    updateAlert: `1500`
  ): ListAlertsForEnterprise = {
    val __obj = js.Dynamic.literal(getAlert = getAlert.asInstanceOf[js.Any], listAlertsForEnterprise = listAlertsForEnterprise.asInstanceOf[js.Any], listAlertsForOrg = listAlertsForOrg.asInstanceOf[js.Any], listAlertsForRepo = listAlertsForRepo.asInstanceOf[js.Any], listLocationsForAlert = listLocationsForAlert.asInstanceOf[js.Any], updateAlert = updateAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlertsForEnterprise]
  }
  
  extension [Self <: ListAlertsForEnterprise](x: Self) {
    
    inline def setGetAlert(value: `1495`): Self = StObject.set(x, "getAlert", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForEnterprise(value: `1496`): Self = StObject.set(x, "listAlertsForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForOrg(value: `1497`): Self = StObject.set(x, "listAlertsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForRepo(value: `1498`): Self = StObject.set(x, "listAlertsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListLocationsForAlert(value: `1499`): Self = StObject.set(x, "listLocationsForAlert", value.asInstanceOf[js.Any])
    
    inline def setUpdateAlert(value: `1500`): Self = StObject.set(x, "updateAlert", value.asInstanceOf[js.Any])
  }
}
