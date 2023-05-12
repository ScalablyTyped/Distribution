package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deploymentstatus extends StObject {
  
  /** @enum {string} */
  var action: created_
  
  var check_run: js.UndefOr[Externalid | Null] = js.undefined
  
  /**
    * Deployment
    * @description The [deployment](https://docs.github.com/rest/reference/deployments#list-deployments).
    */
  var deployment: Transientenvironment
  
  /** @description The [deployment status](https://docs.github.com/rest/reference/deployments#list-deployment-statuses). */
  var deployment_status: Environmenturl
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
  
  /** Workflow */
  var workflow: js.UndefOr[NodeidPath | Null] = js.undefined
  
  /** Deployment Workflow Run */
  var workflow_run: js.UndefOr[Checksuitenodeid | Null] = js.undefined
}
object Deploymentstatus {
  
  inline def apply(
    deployment: Transientenvironment,
    deployment_status: Environmenturl,
    repository: Allowupdatebranch,
    sender: Avatarurl
  ): Deploymentstatus = {
    val __obj = js.Dynamic.literal(action = "created", deployment = deployment.asInstanceOf[js.Any], deployment_status = deployment_status.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deploymentstatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deploymentstatus] (val x: Self) extends AnyVal {
    
    inline def setAction(value: created_): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCheck_run(value: Externalid): Self = StObject.set(x, "check_run", value.asInstanceOf[js.Any])
    
    inline def setCheck_runNull: Self = StObject.set(x, "check_run", null)
    
    inline def setCheck_runUndefined: Self = StObject.set(x, "check_run", js.undefined)
    
    inline def setDeployment(value: Transientenvironment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeployment_status(value: Environmenturl): Self = StObject.set(x, "deployment_status", value.asInstanceOf[js.Any])
    
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
    
    inline def setWorkflowUndefined: Self = StObject.set(x, "workflow", js.undefined)
    
    inline def setWorkflow_run(value: Checksuitenodeid): Self = StObject.set(x, "workflow_run", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_runNull: Self = StObject.set(x, "workflow_run", null)
    
    inline def setWorkflow_runUndefined: Self = StObject.set(x, "workflow_run", js.undefined)
  }
}
