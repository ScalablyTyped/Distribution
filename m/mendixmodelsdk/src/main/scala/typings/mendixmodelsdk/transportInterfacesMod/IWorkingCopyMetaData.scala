package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWorkingCopyMetaData extends StObject {
  
  var avatarUrl: String
  
  var description: String
  
  var metaModelVersion: String
  
  var name: String
  
  var projectId: String
  
  var teamServerBaseBranch: js.UndefOr[String] = js.undefined
  
  var teamServerBaseCommitId: js.UndefOr[String] = js.undefined
  
  var teamServerBaseRevision: js.UndefOr[Double] = js.undefined
}
object IWorkingCopyMetaData {
  
  inline def apply(avatarUrl: String, description: String, metaModelVersion: String, name: String, projectId: String): IWorkingCopyMetaData = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], metaModelVersion = metaModelVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopyMetaData]
  }
  
  extension [Self <: IWorkingCopyMetaData](x: Self) {
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setMetaModelVersion(value: String): Self = StObject.set(x, "metaModelVersion", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setTeamServerBaseBranch(value: String): Self = StObject.set(x, "teamServerBaseBranch", value.asInstanceOf[js.Any])
    
    inline def setTeamServerBaseBranchUndefined: Self = StObject.set(x, "teamServerBaseBranch", js.undefined)
    
    inline def setTeamServerBaseCommitId(value: String): Self = StObject.set(x, "teamServerBaseCommitId", value.asInstanceOf[js.Any])
    
    inline def setTeamServerBaseCommitIdUndefined: Self = StObject.set(x, "teamServerBaseCommitId", js.undefined)
    
    inline def setTeamServerBaseRevision(value: Double): Self = StObject.set(x, "teamServerBaseRevision", value.asInstanceOf[js.Any])
    
    inline def setTeamServerBaseRevisionUndefined: Self = StObject.set(x, "teamServerBaseRevision", js.undefined)
  }
}
