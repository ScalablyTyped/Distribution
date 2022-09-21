package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.error
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.inactive
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.production
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.qa
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.staging
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autoinactive extends StObject {
  
  /** @description Adds a new `inactive` status to all prior non-transient, non-production environment deployments with the same repository and `environment` name as the created status's deployment. An `inactive` status is only added to deployments that had a `success` state. Default: `true` */
  var auto_inactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description A short description of the status. The maximum description length is 140 characters.
    * @default
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * @description Name for the target deployment environment, which can be changed when setting a deploy status. For example, `production`, `staging`, or `qa`.
    * @enum {string}
    */
  var environment: js.UndefOr[production | staging | qa] = js.undefined
  
  /**
    * @description Sets the URL for accessing your environment. Default: `""`
    * @default
    */
  var environment_url: js.UndefOr[String] = js.undefined
  
  /**
    * @description The full URL of the deployment's output. This parameter replaces `target_url`. We will continue to accept `target_url` to support legacy uses, but we recommend replacing `target_url` with `log_url`. Setting `log_url` will automatically set `target_url` to the same value. Default: `""`
    * @default
    */
  var log_url: js.UndefOr[String] = js.undefined
  
  /**
    * @description The state of the status. When you set a transient deployment to `inactive`, the deployment will be shown as `destroyed` in GitHub.
    * @enum {string}
    */
  var state: error | failure | inactive | in_progress | queued_ | pending | success
  
  /**
    * @description The target URL to associate with this status. This URL should contain output to keep the user updated while the task is running or serve as historical information for what happened in the deployment. **Note:** It's recommended to use the `log_url` parameter, which replaces `target_url`.
    * @default
    */
  var target_url: js.UndefOr[String] = js.undefined
}
object Autoinactive {
  
  inline def apply(state: error | failure | inactive | in_progress | queued_ | pending | success): Autoinactive = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autoinactive]
  }
  
  extension [Self <: Autoinactive](x: Self) {
    
    inline def setAuto_inactive(value: Boolean): Self = StObject.set(x, "auto_inactive", value.asInstanceOf[js.Any])
    
    inline def setAuto_inactiveUndefined: Self = StObject.set(x, "auto_inactive", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnvironment(value: production | staging | qa): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setEnvironment_url(value: String): Self = StObject.set(x, "environment_url", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_urlUndefined: Self = StObject.set(x, "environment_url", js.undefined)
    
    inline def setLog_url(value: String): Self = StObject.set(x, "log_url", value.asInstanceOf[js.Any])
    
    inline def setLog_urlUndefined: Self = StObject.set(x, "log_url", js.undefined)
    
    inline def setState(value: error | failure | inactive | in_progress | queued_ | pending | success): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTarget_url(value: String): Self = StObject.set(x, "target_url", value.asInstanceOf[js.Any])
    
    inline def setTarget_urlUndefined: Self = StObject.set(x, "target_url", js.undefined)
  }
}
