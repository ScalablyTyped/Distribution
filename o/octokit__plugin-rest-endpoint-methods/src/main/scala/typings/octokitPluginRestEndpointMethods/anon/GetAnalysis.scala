package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnalysis extends StObject {
  
  var deleteAnalysis: `1010`
  
  var getAlert: `1011`
  
  var getAnalysis: `1012`
  
  var getCodeqlDatabase: `1013`
  
  var getSarif: `1014`
  
  var listAlertInstances: `1015`
  
  var listAlertsForOrg: `1016`
  
  var listAlertsForRepo: `1017`
  
  var listAlertsInstances: `1015`
  
  var listCodeqlDatabases: `1018`
  
  var listRecentAnalyses: `1019`
  
  var updateAlert: `1020`
  
  var uploadSarif: `1021`
}
object GetAnalysis {
  
  inline def apply(
    deleteAnalysis: `1010`,
    getAlert: `1011`,
    getAnalysis: `1012`,
    getCodeqlDatabase: `1013`,
    getSarif: `1014`,
    listAlertInstances: `1015`,
    listAlertsForOrg: `1016`,
    listAlertsForRepo: `1017`,
    listAlertsInstances: `1015`,
    listCodeqlDatabases: `1018`,
    listRecentAnalyses: `1019`,
    updateAlert: `1020`,
    uploadSarif: `1021`
  ): GetAnalysis = {
    val __obj = js.Dynamic.literal(deleteAnalysis = deleteAnalysis.asInstanceOf[js.Any], getAlert = getAlert.asInstanceOf[js.Any], getAnalysis = getAnalysis.asInstanceOf[js.Any], getCodeqlDatabase = getCodeqlDatabase.asInstanceOf[js.Any], getSarif = getSarif.asInstanceOf[js.Any], listAlertInstances = listAlertInstances.asInstanceOf[js.Any], listAlertsForOrg = listAlertsForOrg.asInstanceOf[js.Any], listAlertsForRepo = listAlertsForRepo.asInstanceOf[js.Any], listAlertsInstances = listAlertsInstances.asInstanceOf[js.Any], listCodeqlDatabases = listCodeqlDatabases.asInstanceOf[js.Any], listRecentAnalyses = listRecentAnalyses.asInstanceOf[js.Any], updateAlert = updateAlert.asInstanceOf[js.Any], uploadSarif = uploadSarif.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnalysis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAnalysis] (val x: Self) extends AnyVal {
    
    inline def setDeleteAnalysis(value: `1010`): Self = StObject.set(x, "deleteAnalysis", value.asInstanceOf[js.Any])
    
    inline def setGetAlert(value: `1011`): Self = StObject.set(x, "getAlert", value.asInstanceOf[js.Any])
    
    inline def setGetAnalysis(value: `1012`): Self = StObject.set(x, "getAnalysis", value.asInstanceOf[js.Any])
    
    inline def setGetCodeqlDatabase(value: `1013`): Self = StObject.set(x, "getCodeqlDatabase", value.asInstanceOf[js.Any])
    
    inline def setGetSarif(value: `1014`): Self = StObject.set(x, "getSarif", value.asInstanceOf[js.Any])
    
    inline def setListAlertInstances(value: `1015`): Self = StObject.set(x, "listAlertInstances", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForOrg(value: `1016`): Self = StObject.set(x, "listAlertsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForRepo(value: `1017`): Self = StObject.set(x, "listAlertsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListAlertsInstances(value: `1015`): Self = StObject.set(x, "listAlertsInstances", value.asInstanceOf[js.Any])
    
    inline def setListCodeqlDatabases(value: `1018`): Self = StObject.set(x, "listCodeqlDatabases", value.asInstanceOf[js.Any])
    
    inline def setListRecentAnalyses(value: `1019`): Self = StObject.set(x, "listRecentAnalyses", value.asInstanceOf[js.Any])
    
    inline def setUpdateAlert(value: `1020`): Self = StObject.set(x, "updateAlert", value.asInstanceOf[js.Any])
    
    inline def setUploadSarif(value: `1021`): Self = StObject.set(x, "uploadSarif", value.asInstanceOf[js.Any])
  }
}
