package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionDeployment extends StObject {
  
  /** @enum {string} */
  var action: in_progress
  
  var deployment: js.UndefOr[Task] = js.undefined
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
  
  var workflow_job: Runnergroupid
}
object ActionDeployment {
  
  inline def apply(repository: Allowupdatebranch, sender: Avatarurl, workflow_job: Runnergroupid): ActionDeployment = {
    val __obj = js.Dynamic.literal(action = "in_progress", repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], workflow_job = workflow_job.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionDeployment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionDeployment] (val x: Self) extends AnyVal {
    
    inline def setAction(value: in_progress): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setDeployment(value: Task): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_job(value: Runnergroupid): Self = StObject.set(x, "workflow_job", value.asInstanceOf[js.Any])
  }
}
