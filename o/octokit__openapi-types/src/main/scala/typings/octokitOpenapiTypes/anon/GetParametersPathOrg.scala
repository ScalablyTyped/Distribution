package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOrg extends StObject {
  
  /**
    * Lists all Codespaces secrets available at the organization-level without revealing their encrypted values.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPathOrg
}
object GetParametersPathOrg {
  
  inline def apply(get: ParametersPathOrg): GetParametersPathOrg = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOrg] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOrg): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
