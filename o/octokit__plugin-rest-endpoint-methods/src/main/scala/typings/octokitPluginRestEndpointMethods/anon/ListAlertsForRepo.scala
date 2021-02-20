package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAlertsForRepo extends StObject {
  
  var getAlert: `668` = js.native
  
  var listAlertsForRepo: `669` = js.native
  
  var listRecentAnalyses: `670` = js.native
  
  var updateAlert: `671` = js.native
  
  var uploadSarif: `672` = js.native
}
object ListAlertsForRepo {
  
  @scala.inline
  def apply(
    getAlert: `668`,
    listAlertsForRepo: `669`,
    listRecentAnalyses: `670`,
    updateAlert: `671`,
    uploadSarif: `672`
  ): ListAlertsForRepo = {
    val __obj = js.Dynamic.literal(getAlert = getAlert.asInstanceOf[js.Any], listAlertsForRepo = listAlertsForRepo.asInstanceOf[js.Any], listRecentAnalyses = listRecentAnalyses.asInstanceOf[js.Any], updateAlert = updateAlert.asInstanceOf[js.Any], uploadSarif = uploadSarif.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlertsForRepo]
  }
  
  @scala.inline
  implicit class ListAlertsForRepoMutableBuilder[Self <: ListAlertsForRepo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAlert(value: `668`): Self = StObject.set(x, "getAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListAlertsForRepo(value: `669`): Self = StObject.set(x, "listAlertsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListRecentAnalyses(value: `670`): Self = StObject.set(x, "listRecentAnalyses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAlert(value: `671`): Self = StObject.set(x, "updateAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadSarif(value: `672`): Self = StObject.set(x, "uploadSarif", value.asInstanceOf[js.Any])
  }
}
