package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.requested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deploymentcallbackurl extends StObject {
  
  /** @enum {string} */
  var action: js.UndefOr[requested] = js.undefined
  
  var deployment: js.UndefOr[Task] = js.undefined
  
  /**
    * Format: uri
    * @description The URL to review the deployment protection rule.
    */
  var deployment_callback_url: js.UndefOr[String] = js.undefined
  
  /** @description The name of the environment that has the deployment protection rule. */
  var environment: js.UndefOr[String] = js.undefined
  
  /** @description The event that triggered the deployment protection rule. */
  var event: js.UndefOr[String] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var pull_requests: js.UndefOr[js.Array[Locked]] = js.undefined
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  var sender: js.UndefOr[Avatarurl] = js.undefined
}
object Deploymentcallbackurl {
  
  inline def apply(): Deploymentcallbackurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deploymentcallbackurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deploymentcallbackurl] (val x: Self) extends AnyVal {
    
    inline def setAction(value: requested): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDeployment(value: Task): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setDeployment_callback_url(value: String): Self = StObject.set(x, "deployment_callback_url", value.asInstanceOf[js.Any])
    
    inline def setDeployment_callback_urlUndefined: Self = StObject.set(x, "deployment_callback_url", js.undefined)
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPull_requests(value: js.Array[Locked]): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    inline def setPull_requestsUndefined: Self = StObject.set(x, "pull_requests", js.undefined)
    
    inline def setPull_requestsVarargs(value: Locked*): Self = StObject.set(x, "pull_requests", js.Array(value*))
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
