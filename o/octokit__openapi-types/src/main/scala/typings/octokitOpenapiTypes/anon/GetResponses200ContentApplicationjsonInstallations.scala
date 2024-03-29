package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonInstallations extends StObject {
  
  /**
    * List app installations for an organization
    * @description Lists all GitHub Apps in an organization. The installation count includes all GitHub Apps installed on repositories in the organization. You must be an organization owner with `admin:read` scope to use this endpoint.
    */
  var get: Responses200ContentApplicationjsonInstallations
}
object GetResponses200ContentApplicationjsonInstallations {
  
  inline def apply(get: Responses200ContentApplicationjsonInstallations): GetResponses200ContentApplicationjsonInstallations = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonInstallations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200ContentApplicationjsonInstallations] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200ContentApplicationjsonInstallations): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
