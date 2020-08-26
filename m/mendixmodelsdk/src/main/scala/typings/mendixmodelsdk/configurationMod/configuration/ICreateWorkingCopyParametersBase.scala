package typings.mendixmodelsdk.configurationMod.configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreateWorkingCopyParametersBase extends js.Object {
  var avatarUrl: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  /**
    * Indicates whether this working copy is created for the purpose of collaboration between the Desktop modeler and Webmodeler.
    * By setting this, BiDi won't be available anymore for this project and thus requires a modeler with version 7.23.3 or higher.
    */
  var isCollaboration: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the working copy should be long-lived.
    * This parameter can only be set to true when the Mendix project id is set and the Model SDK is used from a trusted backend
    *  - this excludes regular SDK users for the moment.
    */
  var longLived: js.UndefOr[Boolean] = js.native
  /**
    * Force the working copy state to be marked to contain changes.
    *  - this excludes regular SDK users for the moment.
    */
  var markAsChanged: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  /**
    * Mendix project id. Needed for deployment and team server commits
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Indicates whether the new working copy should be the default working copy associated with the provided projectId.
    * This means that this working copy will be opened in the Web Modeler for the given project.
    * This parameter can only be set to true when the Mendix project id is set and the Model SDK is used from a trusted backend
    *  - this excludes regular SDK users for the moment.
    */
  var setAsDefault: js.UndefOr[Boolean] = js.native
  /**
    * If this working copy is created from an SVN TeamServer checkout, the BaseRevision / BaseBranch can be used by the Desktop Modeler during merge.
    */
  var teamServerBaseBranch: js.UndefOr[String] = js.native
  /**
    * If this working copy is created from a Git TeamServer checkout, the commit hash will be used for the clone operation.
    */
  var teamServerBaseCommitHash: js.UndefOr[String] = js.native
  /**
    * If this working copy is created from an SVN TeamServer checkout, the BaseRevision / BaseBranch can be used by the Desktop Modeler during merge.
    * @type {number}
    */
  var teamServerBaseRevision: js.UndefOr[Double] = js.native
}

object ICreateWorkingCopyParametersBase {
  @scala.inline
  def apply(name: String): ICreateWorkingCopyParametersBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateWorkingCopyParametersBase]
  }
  @scala.inline
  implicit class ICreateWorkingCopyParametersBaseOps[Self <: ICreateWorkingCopyParametersBase] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvatarUrl(value: String): Self = this.set("avatarUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatarUrl: Self = this.set("avatarUrl", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIsCollaboration(value: Boolean): Self = this.set("isCollaboration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCollaboration: Self = this.set("isCollaboration", js.undefined)
    @scala.inline
    def setLongLived(value: Boolean): Self = this.set("longLived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongLived: Self = this.set("longLived", js.undefined)
    @scala.inline
    def setMarkAsChanged(value: Boolean): Self = this.set("markAsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkAsChanged: Self = this.set("markAsChanged", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setSetAsDefault(value: Boolean): Self = this.set("setAsDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetAsDefault: Self = this.set("setAsDefault", js.undefined)
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

