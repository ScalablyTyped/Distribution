package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnalysis extends StObject {
  
  var deleteAnalysis: `1054`
  
  var getAlert: `1055`
  
  var getAnalysis: `1056`
  
  var getCodeqlDatabase: `1057`
  
  var getDefaultSetup: `1058`
  
  var getSarif: `1059`
  
  var listAlertInstances: `1060`
  
  var listAlertsForOrg: `1061`
  
  var listAlertsForRepo: `1062`
  
  var listAlertsInstances: `1060`
  
  var listCodeqlDatabases: `1063`
  
  var listRecentAnalyses: `1064`
  
  var updateAlert: `1065`
  
  var updateDefaultSetup: `1066`
  
  var uploadSarif: `1067`
}
object GetAnalysis {
  
  inline def apply(
    deleteAnalysis: `1054`,
    getAlert: `1055`,
    getAnalysis: `1056`,
    getCodeqlDatabase: `1057`,
    getDefaultSetup: `1058`,
    getSarif: `1059`,
    listAlertInstances: `1060`,
    listAlertsForOrg: `1061`,
    listAlertsForRepo: `1062`,
    listAlertsInstances: `1060`,
    listCodeqlDatabases: `1063`,
    listRecentAnalyses: `1064`,
    updateAlert: `1065`,
    updateDefaultSetup: `1066`,
    uploadSarif: `1067`
  ): GetAnalysis = {
    val __obj = js.Dynamic.literal(deleteAnalysis = deleteAnalysis.asInstanceOf[js.Any], getAlert = getAlert.asInstanceOf[js.Any], getAnalysis = getAnalysis.asInstanceOf[js.Any], getCodeqlDatabase = getCodeqlDatabase.asInstanceOf[js.Any], getDefaultSetup = getDefaultSetup.asInstanceOf[js.Any], getSarif = getSarif.asInstanceOf[js.Any], listAlertInstances = listAlertInstances.asInstanceOf[js.Any], listAlertsForOrg = listAlertsForOrg.asInstanceOf[js.Any], listAlertsForRepo = listAlertsForRepo.asInstanceOf[js.Any], listAlertsInstances = listAlertsInstances.asInstanceOf[js.Any], listCodeqlDatabases = listCodeqlDatabases.asInstanceOf[js.Any], listRecentAnalyses = listRecentAnalyses.asInstanceOf[js.Any], updateAlert = updateAlert.asInstanceOf[js.Any], updateDefaultSetup = updateDefaultSetup.asInstanceOf[js.Any], uploadSarif = uploadSarif.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnalysis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAnalysis] (val x: Self) extends AnyVal {
    
    inline def setDeleteAnalysis(value: `1054`): Self = StObject.set(x, "deleteAnalysis", value.asInstanceOf[js.Any])
    
    inline def setGetAlert(value: `1055`): Self = StObject.set(x, "getAlert", value.asInstanceOf[js.Any])
    
    inline def setGetAnalysis(value: `1056`): Self = StObject.set(x, "getAnalysis", value.asInstanceOf[js.Any])
    
    inline def setGetCodeqlDatabase(value: `1057`): Self = StObject.set(x, "getCodeqlDatabase", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultSetup(value: `1058`): Self = StObject.set(x, "getDefaultSetup", value.asInstanceOf[js.Any])
    
    inline def setGetSarif(value: `1059`): Self = StObject.set(x, "getSarif", value.asInstanceOf[js.Any])
    
    inline def setListAlertInstances(value: `1060`): Self = StObject.set(x, "listAlertInstances", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForOrg(value: `1061`): Self = StObject.set(x, "listAlertsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForRepo(value: `1062`): Self = StObject.set(x, "listAlertsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListAlertsInstances(value: `1060`): Self = StObject.set(x, "listAlertsInstances", value.asInstanceOf[js.Any])
    
    inline def setListCodeqlDatabases(value: `1063`): Self = StObject.set(x, "listCodeqlDatabases", value.asInstanceOf[js.Any])
    
    inline def setListRecentAnalyses(value: `1064`): Self = StObject.set(x, "listRecentAnalyses", value.asInstanceOf[js.Any])
    
    inline def setUpdateAlert(value: `1065`): Self = StObject.set(x, "updateAlert", value.asInstanceOf[js.Any])
    
    inline def setUpdateDefaultSetup(value: `1066`): Self = StObject.set(x, "updateDefaultSetup", value.asInstanceOf[js.Any])
    
    inline def setUploadSarif(value: `1067`): Self = StObject.set(x, "uploadSarif", value.asInstanceOf[js.Any])
  }
}
