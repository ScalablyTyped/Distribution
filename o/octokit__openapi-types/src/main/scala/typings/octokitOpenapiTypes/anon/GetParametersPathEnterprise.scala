package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathEnterprise extends StObject {
  
  /**
    * List secret scanning alerts for an enterprise
    * @description Lists secret scanning alerts for eligible repositories in an enterprise, from newest to oldest.
    * To use this endpoint, you must be a member of the enterprise, and you must use an access token with the `repo` scope or `security_events` scope. Alerts are only returned for organizations in the enterprise for which you are an organization owner or a [security manager](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).
    */
  var get: ParametersPathEnterprise
}
object GetParametersPathEnterprise {
  
  inline def apply(get: ParametersPathEnterprise): GetParametersPathEnterprise = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathEnterprise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathEnterprise] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathEnterprise): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
