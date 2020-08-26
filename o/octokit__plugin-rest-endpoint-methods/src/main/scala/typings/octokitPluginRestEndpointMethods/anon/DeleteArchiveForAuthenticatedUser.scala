package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteArchiveForAuthenticatedUser extends js.Object {
  var cancelImport: `757` = js.native
  var deleteArchiveForAuthenticatedUser: `758` = js.native
  var deleteArchiveForOrg: `759` = js.native
  var downloadArchiveForOrg: `760` = js.native
  var getArchiveForAuthenticatedUser: `761` = js.native
  var getCommitAuthors: `762` = js.native
  var getImportStatus: `763` = js.native
  var getLargeFiles: `764` = js.native
  var getStatusForAuthenticatedUser: `765` = js.native
  var getStatusForOrg: `766` = js.native
  var listForAuthenticatedUser: `767` = js.native
  var listForOrg: `768` = js.native
  var listReposForOrg: `769` = js.native
  var listReposForUser: `770` = js.native
  var mapCommitAuthor: `771` = js.native
  var setLfsPreference: `772` = js.native
  var startForAuthenticatedUser: `773` = js.native
  var startForOrg: `774` = js.native
  var startImport: `775` = js.native
  var unlockRepoForAuthenticatedUser: `776` = js.native
  var unlockRepoForOrg: `777` = js.native
  var updateImport: `778` = js.native
}

object DeleteArchiveForAuthenticatedUser {
  @scala.inline
  def apply(
    cancelImport: `757`,
    deleteArchiveForAuthenticatedUser: `758`,
    deleteArchiveForOrg: `759`,
    downloadArchiveForOrg: `760`,
    getArchiveForAuthenticatedUser: `761`,
    getCommitAuthors: `762`,
    getImportStatus: `763`,
    getLargeFiles: `764`,
    getStatusForAuthenticatedUser: `765`,
    getStatusForOrg: `766`,
    listForAuthenticatedUser: `767`,
    listForOrg: `768`,
    listReposForOrg: `769`,
    listReposForUser: `770`,
    mapCommitAuthor: `771`,
    setLfsPreference: `772`,
    startForAuthenticatedUser: `773`,
    startForOrg: `774`,
    startImport: `775`,
    unlockRepoForAuthenticatedUser: `776`,
    unlockRepoForOrg: `777`,
    updateImport: `778`
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
    def setCancelImport(value: `757`): Self = this.set("cancelImport", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteArchiveForAuthenticatedUser(value: `758`): Self = this.set("deleteArchiveForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteArchiveForOrg(value: `759`): Self = this.set("deleteArchiveForOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadArchiveForOrg(value: `760`): Self = this.set("downloadArchiveForOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetArchiveForAuthenticatedUser(value: `761`): Self = this.set("getArchiveForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCommitAuthors(value: `762`): Self = this.set("getCommitAuthors", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetImportStatus(value: `763`): Self = this.set("getImportStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLargeFiles(value: `764`): Self = this.set("getLargeFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetStatusForAuthenticatedUser(value: `765`): Self = this.set("getStatusForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetStatusForOrg(value: `766`): Self = this.set("getStatusForOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForAuthenticatedUser(value: `767`): Self = this.set("listForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForOrg(value: `768`): Self = this.set("listForOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setListReposForOrg(value: `769`): Self = this.set("listReposForOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setListReposForUser(value: `770`): Self = this.set("listReposForUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapCommitAuthor(value: `771`): Self = this.set("mapCommitAuthor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetLfsPreference(value: `772`): Self = this.set("setLfsPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartForAuthenticatedUser(value: `773`): Self = this.set("startForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartForOrg(value: `774`): Self = this.set("startForOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartImport(value: `775`): Self = this.set("startImport", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnlockRepoForAuthenticatedUser(value: `776`): Self = this.set("unlockRepoForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnlockRepoForOrg(value: `777`): Self = this.set("unlockRepoForOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateImport(value: `778`): Self = this.set("updateImport", value.asInstanceOf[js.Any])
  }
  
}

