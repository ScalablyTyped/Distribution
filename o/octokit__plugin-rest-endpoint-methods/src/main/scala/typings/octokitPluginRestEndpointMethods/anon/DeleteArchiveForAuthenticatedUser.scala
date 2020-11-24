package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteArchiveForAuthenticatedUser extends js.Object {
  
  var cancelImport: `763` = js.native
  
  var deleteArchiveForAuthenticatedUser: `764` = js.native
  
  var deleteArchiveForOrg: `765` = js.native
  
  var downloadArchiveForOrg: `766` = js.native
  
  var getArchiveForAuthenticatedUser: `767` = js.native
  
  var getCommitAuthors: `768` = js.native
  
  var getImportStatus: `769` = js.native
  
  var getLargeFiles: `770` = js.native
  
  var getStatusForAuthenticatedUser: `771` = js.native
  
  var getStatusForOrg: `772` = js.native
  
  var listForAuthenticatedUser: `773` = js.native
  
  var listForOrg: `774` = js.native
  
  var listReposForOrg: `775` = js.native
  
  var listReposForUser: `776` = js.native
  
  var mapCommitAuthor: `777` = js.native
  
  var setLfsPreference: `778` = js.native
  
  var startForAuthenticatedUser: `779` = js.native
  
  var startForOrg: `780` = js.native
  
  var startImport: `781` = js.native
  
  var unlockRepoForAuthenticatedUser: `782` = js.native
  
  var unlockRepoForOrg: `783` = js.native
  
  var updateImport: `784` = js.native
}
object DeleteArchiveForAuthenticatedUser {
  
  @scala.inline
  def apply(
    cancelImport: `763`,
    deleteArchiveForAuthenticatedUser: `764`,
    deleteArchiveForOrg: `765`,
    downloadArchiveForOrg: `766`,
    getArchiveForAuthenticatedUser: `767`,
    getCommitAuthors: `768`,
    getImportStatus: `769`,
    getLargeFiles: `770`,
    getStatusForAuthenticatedUser: `771`,
    getStatusForOrg: `772`,
    listForAuthenticatedUser: `773`,
    listForOrg: `774`,
    listReposForOrg: `775`,
    listReposForUser: `776`,
    mapCommitAuthor: `777`,
    setLfsPreference: `778`,
    startForAuthenticatedUser: `779`,
    startForOrg: `780`,
    startImport: `781`,
    unlockRepoForAuthenticatedUser: `782`,
    unlockRepoForOrg: `783`,
    updateImport: `784`
  ): DeleteArchiveForAuthenticatedUser = {
    val __obj = js.Dynamic.literal(cancelImport = cancelImport.asInstanceOf[js.Any], deleteArchiveForAuthenticatedUser = deleteArchiveForAuthenticatedUser.asInstanceOf[js.Any], deleteArchiveForOrg = deleteArchiveForOrg.asInstanceOf[js.Any], downloadArchiveForOrg = downloadArchiveForOrg.asInstanceOf[js.Any], getArchiveForAuthenticatedUser = getArchiveForAuthenticatedUser.asInstanceOf[js.Any], getCommitAuthors = getCommitAuthors.asInstanceOf[js.Any], getImportStatus = getImportStatus.asInstanceOf[js.Any], getLargeFiles = getLargeFiles.asInstanceOf[js.Any], getStatusForAuthenticatedUser = getStatusForAuthenticatedUser.asInstanceOf[js.Any], getStatusForOrg = getStatusForOrg.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listReposForOrg = listReposForOrg.asInstanceOf[js.Any], listReposForUser = listReposForUser.asInstanceOf[js.Any], mapCommitAuthor = mapCommitAuthor.asInstanceOf[js.Any], setLfsPreference = setLfsPreference.asInstanceOf[js.Any], startForAuthenticatedUser = startForAuthenticatedUser.asInstanceOf[js.Any], startForOrg = startForOrg.asInstanceOf[js.Any], startImport = startImport.asInstanceOf[js.Any], unlockRepoForAuthenticatedUser = unlockRepoForAuthenticatedUser.asInstanceOf[js.Any], unlockRepoForOrg = unlockRepoForOrg.asInstanceOf[js.Any], updateImport = updateImport.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteArchiveForAuthenticatedUser]
  }
  
  @scala.inline
  implicit class DeleteArchiveForAuthenticatedUserOps[Self <: DeleteArchiveForAuthenticatedUser] (val x: Self) extends AnyVal {
    
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
    def setCancelImport(value: `763`): Self = this.set("cancelImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteArchiveForAuthenticatedUser(value: `764`): Self = this.set("deleteArchiveForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteArchiveForOrg(value: `765`): Self = this.set("deleteArchiveForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadArchiveForOrg(value: `766`): Self = this.set("downloadArchiveForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetArchiveForAuthenticatedUser(value: `767`): Self = this.set("getArchiveForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCommitAuthors(value: `768`): Self = this.set("getCommitAuthors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetImportStatus(value: `769`): Self = this.set("getImportStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLargeFiles(value: `770`): Self = this.set("getLargeFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStatusForAuthenticatedUser(value: `771`): Self = this.set("getStatusForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStatusForOrg(value: `772`): Self = this.set("getStatusForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForAuthenticatedUser(value: `773`): Self = this.set("listForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForOrg(value: `774`): Self = this.set("listForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListReposForOrg(value: `775`): Self = this.set("listReposForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListReposForUser(value: `776`): Self = this.set("listReposForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapCommitAuthor(value: `777`): Self = this.set("mapCommitAuthor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLfsPreference(value: `778`): Self = this.set("setLfsPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartForAuthenticatedUser(value: `779`): Self = this.set("startForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartForOrg(value: `780`): Self = this.set("startForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartImport(value: `781`): Self = this.set("startImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlockRepoForAuthenticatedUser(value: `782`): Self = this.set("unlockRepoForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlockRepoForOrg(value: `783`): Self = this.set("unlockRepoForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateImport(value: `784`): Self = this.set("updateImport", value.asInstanceOf[js.Any])
  }
}
