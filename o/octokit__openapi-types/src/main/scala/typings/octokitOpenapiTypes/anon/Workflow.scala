package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workflow extends StObject {
  
  /** @enum {string} */
  var action: created_
  
  /**
    * Deployment
    * @description The [deployment](https://docs.github.com/rest/reference/deployments#list-deployments).
    */
  var deployment: Statusesurl
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
  
  /** Workflow */
  var workflow: NodeidPath | Null
  
  /** Deployment Workflow Run */
  var workflow_run: Cancelurl | Null
}
object Workflow {
  
  inline def apply(deployment: Statusesurl, repository: Allowupdatebranch, sender: Avatarurl): Workflow = {
    val __obj = js.Dynamic.literal(action = "created", deployment = deployment.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], workflow = null, workflow_run = null)
    __obj.asInstanceOf[Workflow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Workflow] (val x: Self) extends AnyVal {
    
    inline def setAction(value: created_): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setDeployment(value: Statusesurl): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
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
    
    inline def setWorkflow_run(value: Cancelurl): Self = StObject.set(x, "workflow_run", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_runNull: Self = StObject.set(x, "workflow_run", null)
  }
}
