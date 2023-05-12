package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOrgPatid extends StObject {
  
  /**
    * List repositories a fine-grained personal access token has access to
    * @description Lists the repositories a fine-grained personal access token has access to. Only GitHub Apps can call this API,
    * using the `organization_personal_access_tokens: read` permission.
    *
    * **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.
    */
  var get: ParametersPathOrgPatid
}
object GetParametersPathOrgPatid {
  
  inline def apply(get: ParametersPathOrgPatid): GetParametersPathOrgPatid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOrgPatid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOrgPatid] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOrgPatid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
