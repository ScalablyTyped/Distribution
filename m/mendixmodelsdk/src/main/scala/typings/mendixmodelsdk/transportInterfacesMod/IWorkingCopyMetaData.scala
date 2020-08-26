package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWorkingCopyMetaData extends js.Object {
  var avatarUrl: String = js.native
  var description: String = js.native
  var metaModelVersion: String = js.native
  var name: String = js.native
  var projectId: String = js.native
  var teamServerBaseBranch: js.UndefOr[String] = js.native
  var teamServerBaseCommitHash: js.UndefOr[String] = js.native
  var teamServerBaseRevision: js.UndefOr[Double] = js.native
}

object IWorkingCopyMetaData {
  @scala.inline
  def apply(avatarUrl: String, description: String, metaModelVersion: String, name: String, projectId: String): IWorkingCopyMetaData = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], metaModelVersion = metaModelVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopyMetaData]
  }
  @scala.inline
  implicit class IWorkingCopyMetaDataOps[Self <: IWorkingCopyMetaData] (val x: Self) extends AnyVal {
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
    def setAvatarUrl(value: String): Self = this.set("avatarUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetaModelVersion(value: String): Self = this.set("metaModelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamServerBaseBranch(value: String): Self = this.set("teamServerBaseBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamServerBaseBranch: Self = this.set("teamServerBaseBranch", js.undefined)
    @scala.inline
    def setTeamServerBaseCommitHash(value: String): Self = this.set("teamServerBaseCommitHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamServerBaseCommitHash: Self = this.set("teamServerBaseCommitHash", js.undefined)
    @scala.inline
    def setTeamServerBaseRevision(value: Double): Self = this.set("teamServerBaseRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamServerBaseRevision: Self = this.set("teamServerBaseRevision", js.undefined)
  }
  
}

