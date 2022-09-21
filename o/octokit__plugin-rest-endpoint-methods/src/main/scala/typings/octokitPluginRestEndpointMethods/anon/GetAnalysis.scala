package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnalysis extends StObject {
  
  var deleteAnalysis: `949`
  
  var getAlert: `950`
  
  var getAnalysis: `951`
  
  var getSarif: `952`
  
  var listAlertInstances: `953`
  
  var listAlertsForEnterprise: `954`
  
  var listAlertsForOrg: `955`
  
  var listAlertsForRepo: `956`
  
  var listAlertsInstances: `953`
  
  var listRecentAnalyses: `957`
  
  var updateAlert: `958`
  
  var uploadSarif: `959`
}
object GetAnalysis {
  
  inline def apply(
    deleteAnalysis: `949`,
    getAlert: `950`,
    getAnalysis: `951`,
    getSarif: `952`,
    listAlertInstances: `953`,
    listAlertsForEnterprise: `954`,
    listAlertsForOrg: `955`,
    listAlertsForRepo: `956`,
    listAlertsInstances: `953`,
    listRecentAnalyses: `957`,
    updateAlert: `958`,
    uploadSarif: `959`
  ): GetAnalysis = {
    val __obj = js.Dynamic.literal(deleteAnalysis = deleteAnalysis.asInstanceOf[js.Any], getAlert = getAlert.asInstanceOf[js.Any], getAnalysis = getAnalysis.asInstanceOf[js.Any], getSarif = getSarif.asInstanceOf[js.Any], listAlertInstances = listAlertInstances.asInstanceOf[js.Any], listAlertsForEnterprise = listAlertsForEnterprise.asInstanceOf[js.Any], listAlertsForOrg = listAlertsForOrg.asInstanceOf[js.Any], listAlertsForRepo = listAlertsForRepo.asInstanceOf[js.Any], listAlertsInstances = listAlertsInstances.asInstanceOf[js.Any], listRecentAnalyses = listRecentAnalyses.asInstanceOf[js.Any], updateAlert = updateAlert.asInstanceOf[js.Any], uploadSarif = uploadSarif.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnalysis]
  }
  
  extension [Self <: GetAnalysis](x: Self) {
    
    inline def setDeleteAnalysis(value: `949`): Self = StObject.set(x, "deleteAnalysis", value.asInstanceOf[js.Any])
    
    inline def setGetAlert(value: `950`): Self = StObject.set(x, "getAlert", value.asInstanceOf[js.Any])
    
    inline def setGetAnalysis(value: `951`): Self = StObject.set(x, "getAnalysis", value.asInstanceOf[js.Any])
    
    inline def setGetSarif(value: `952`): Self = StObject.set(x, "getSarif", value.asInstanceOf[js.Any])
    
    inline def setListAlertInstances(value: `953`): Self = StObject.set(x, "listAlertInstances", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForEnterprise(value: `954`): Self = StObject.set(x, "listAlertsForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForOrg(value: `955`): Self = StObject.set(x, "listAlertsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForRepo(value: `956`): Self = StObject.set(x, "listAlertsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListAlertsInstances(value: `953`): Self = StObject.set(x, "listAlertsInstances", value.asInstanceOf[js.Any])
    
    inline def setListRecentAnalyses(value: `957`): Self = StObject.set(x, "listRecentAnalyses", value.asInstanceOf[js.Any])
    
    inline def setUpdateAlert(value: `958`): Self = StObject.set(x, "updateAlert", value.asInstanceOf[js.Any])
    
    inline def setUploadSarif(value: `959`): Self = StObject.set(x, "uploadSarif", value.asInstanceOf[js.Any])
  }
}
