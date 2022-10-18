package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requiredcontexts extends StObject {
  
  /**
    * @description Attempts to automatically merge the default branch into the requested ref, if it's behind the default branch.
    * @default true
    */
  var auto_merge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Short description of the deployment.
    * @default
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description Name for the target deployment environment (e.g., `production`, `staging`, `qa`).
    * @default production
    */
  var environment: js.UndefOr[String] = js.undefined
  
  var payload: js.UndefOr[StringDictionary[Any] | String] = js.undefined
  
  /** @description Specifies if the given environment is one that end-users directly interact with. Default: `true` when `environment` is `production` and `false` otherwise. */
  var production_environment: js.UndefOr[Boolean] = js.undefined
  
  /** @description The ref to deploy. This can be a branch, tag, or SHA. */
  var ref: String
  
  /** @description The [status](https://docs.github.com/rest/commits/statuses) contexts to verify against commit status checks. If you omit this parameter, GitHub verifies all unique contexts before creating a deployment. To bypass checking entirely, pass an empty array. Defaults to all unique contexts. */
  var required_contexts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @description Specifies a task to execute (e.g., `deploy` or `deploy:migrations`).
    * @default deploy
    */
  var task: js.UndefOr[String] = js.undefined
  
  /**
    * @description Specifies if the given environment is specific to the deployment and will no longer exist at some point in the future. Default: `false`
    * @default false
    */
  var transient_environment: js.UndefOr[Boolean] = js.undefined
}
object Requiredcontexts {
  
  inline def apply(ref: String): Requiredcontexts = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requiredcontexts]
  }
  
  extension [Self <: Requiredcontexts](x: Self) {
    
    inline def setAuto_merge(value: Boolean): Self = StObject.set(x, "auto_merge", value.asInstanceOf[js.Any])
    
    inline def setAuto_mergeUndefined: Self = StObject.set(x, "auto_merge", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setPayload(value: StringDictionary[Any] | String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setProduction_environment(value: Boolean): Self = StObject.set(x, "production_environment", value.asInstanceOf[js.Any])
    
    inline def setProduction_environmentUndefined: Self = StObject.set(x, "production_environment", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRequired_contexts(value: js.Array[String]): Self = StObject.set(x, "required_contexts", value.asInstanceOf[js.Any])
    
    inline def setRequired_contextsUndefined: Self = StObject.set(x, "required_contexts", js.undefined)
    
    inline def setRequired_contextsVarargs(value: String*): Self = StObject.set(x, "required_contexts", js.Array(value*))
    
    inline def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
    
    inline def setTransient_environment(value: Boolean): Self = StObject.set(x, "transient_environment", value.asInstanceOf[js.Any])
    
    inline def setTransient_environmentUndefined: Self = StObject.set(x, "transient_environment", js.undefined)
  }
}
