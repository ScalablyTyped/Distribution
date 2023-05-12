package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSecurityAnalysisSettingsForEnterprise extends StObject {
  
  var getAlert: `1532`
  
  var getSecurityAnalysisSettingsForEnterprise: `1533`
  
  var listAlertsForEnterprise: `1534`
  
  var listAlertsForOrg: `1535`
  
  var listAlertsForRepo: `1536`
  
  var listLocationsForAlert: `1537`
  
  var patchSecurityAnalysisSettingsForEnterprise: `1538`
  
  var postSecurityProductEnablementForEnterprise: `1539`
  
  var updateAlert: `1540`
}
object GetSecurityAnalysisSettingsForEnterprise {
  
  inline def apply(
    getAlert: `1532`,
    getSecurityAnalysisSettingsForEnterprise: `1533`,
    listAlertsForEnterprise: `1534`,
    listAlertsForOrg: `1535`,
    listAlertsForRepo: `1536`,
    listLocationsForAlert: `1537`,
    patchSecurityAnalysisSettingsForEnterprise: `1538`,
    postSecurityProductEnablementForEnterprise: `1539`,
    updateAlert: `1540`
  ): GetSecurityAnalysisSettingsForEnterprise = {
    val __obj = js.Dynamic.literal(getAlert = getAlert.asInstanceOf[js.Any], getSecurityAnalysisSettingsForEnterprise = getSecurityAnalysisSettingsForEnterprise.asInstanceOf[js.Any], listAlertsForEnterprise = listAlertsForEnterprise.asInstanceOf[js.Any], listAlertsForOrg = listAlertsForOrg.asInstanceOf[js.Any], listAlertsForRepo = listAlertsForRepo.asInstanceOf[js.Any], listLocationsForAlert = listLocationsForAlert.asInstanceOf[js.Any], patchSecurityAnalysisSettingsForEnterprise = patchSecurityAnalysisSettingsForEnterprise.asInstanceOf[js.Any], postSecurityProductEnablementForEnterprise = postSecurityProductEnablementForEnterprise.asInstanceOf[js.Any], updateAlert = updateAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecurityAnalysisSettingsForEnterprise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSecurityAnalysisSettingsForEnterprise] (val x: Self) extends AnyVal {
    
    inline def setGetAlert(value: `1532`): Self = StObject.set(x, "getAlert", value.asInstanceOf[js.Any])
    
    inline def setGetSecurityAnalysisSettingsForEnterprise(value: `1533`): Self = StObject.set(x, "getSecurityAnalysisSettingsForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForEnterprise(value: `1534`): Self = StObject.set(x, "listAlertsForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForOrg(value: `1535`): Self = StObject.set(x, "listAlertsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForRepo(value: `1536`): Self = StObject.set(x, "listAlertsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListLocationsForAlert(value: `1537`): Self = StObject.set(x, "listLocationsForAlert", value.asInstanceOf[js.Any])
    
    inline def setPatchSecurityAnalysisSettingsForEnterprise(value: `1538`): Self = StObject.set(x, "patchSecurityAnalysisSettingsForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setPostSecurityProductEnablementForEnterprise(value: `1539`): Self = StObject.set(x, "postSecurityProductEnablementForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setUpdateAlert(value: `1540`): Self = StObject.set(x, "updateAlert", value.asInstanceOf[js.Any])
  }
}
