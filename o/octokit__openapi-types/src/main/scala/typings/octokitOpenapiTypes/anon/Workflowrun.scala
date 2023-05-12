package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workflowrun extends StObject {
  
  /** @enum {string} */
  var action: completed
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
  
  /** Workflow */
  var workflow: NodeidPath | Null
  
  var workflow_run: Checksuiteurl
}
object Workflowrun {
  
  inline def apply(repository: Allowupdatebranch, sender: Avatarurl, workflow_run: Checksuiteurl): Workflowrun = {
    val __obj = js.Dynamic.literal(action = "completed", repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], workflow_run = workflow_run.asInstanceOf[js.Any], workflow = null)
    __obj.asInstanceOf[Workflowrun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Workflowrun] (val x: Self) extends AnyVal {
    
    inline def setAction(value: completed): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setWorkflow(value: NodeidPath): Self = StObject.set(x, "workflow", value.asInstanceOf[js.Any])
    
    inline def setWorkflowNull: Self = StObject.set(x, "workflow", null)
    
    inline def setWorkflow_run(value: Checksuiteurl): Self = StObject.set(x, "workflow_run", value.asInstanceOf[js.Any])
  }
}
