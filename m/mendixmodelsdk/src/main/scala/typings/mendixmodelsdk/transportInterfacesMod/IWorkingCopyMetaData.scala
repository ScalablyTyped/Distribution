package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWorkingCopyMetaData extends StObject {
  
  var avatarUrl: String = js.native
  
  var description: String = js.native
  
  var metaModelVersion: String = js.native
  
  var name: String = js.native
  
  var projectId: String = js.native
  
  var teamServerBaseBranch: js.UndefOr[String] = js.native
  
  var teamServerBaseCommitId: js.UndefOr[String] = js.native
  
  var teamServerBaseRevision: js.UndefOr[Double] = js.native
}
object IWorkingCopyMetaData {
  
  @scala.inline
  def apply(avatarUrl: String, description: String, metaModelVersion: String, name: String, projectId: String): IWorkingCopyMetaData = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], metaModelVersion = metaModelVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopyMetaData]
  }
  
  @scala.inline
  implicit class IWorkingCopyMetaDataMutableBuilder[Self <: IWorkingCopyMetaData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaModelVersion(value: String): Self = StObject.set(x, "metaModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamServerBaseBranch(value: String): Self = StObject.set(x, "teamServerBaseBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamServerBaseBranchUndefined: Self = StObject.set(x, "teamServerBaseBranch", js.undefined)
    
    @scala.inline
    def setTeamServerBaseCommitId(value: String): Self = StObject.set(x, "teamServerBaseCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamServerBaseCommitIdUndefined: Self = StObject.set(x, "teamServerBaseCommitId", js.undefined)
    
    @scala.inline
    def setTeamServerBaseRevision(value: Double): Self = StObject.set(x, "teamServerBaseRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamServerBaseRevisionUndefined: Self = StObject.set(x, "teamServerBaseRevision", js.undefined)
  }
}
