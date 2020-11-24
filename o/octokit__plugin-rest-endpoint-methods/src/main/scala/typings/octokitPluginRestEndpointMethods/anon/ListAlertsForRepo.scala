package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAlertsForRepo extends js.Object {
  
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
  implicit class ListAlertsForRepoOps[Self <: ListAlertsForRepo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetAlert(value: `668`): Self = this.set("getAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListAlertsForRepo(value: `669`): Self = this.set("listAlertsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListRecentAnalyses(value: `670`): Self = this.set("listRecentAnalyses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAlert(value: `671`): Self = this.set("updateAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadSarif(value: `672`): Self = this.set("uploadSarif", value.asInstanceOf[js.Any])
  }
}
