package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryBefore extends StObject {
  
  /**
    * Lists secret scanning alerts for eligible repositories in an enterprise, from newest to oldest.
    * To use this endpoint, you must be a member of the enterprise, and you must use an access token with the `repo` scope or `security_events` scope. Alerts are only returned for organizations in the enterprise for which you are an organization owner or a [security manager](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).
    */
  var get: ParametersQueryBefore
}
object GetParametersQueryBefore {
  
  inline def apply(get: ParametersQueryBefore): GetParametersQueryBefore = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryBefore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryBefore] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryBefore): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
