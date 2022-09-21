package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOrgResponses200Content21 extends StObject {
  
  /**
    * Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPathOrgResponses200Content21
}
object GetParametersPathOrgResponses200Content21 {
  
  inline def apply(get: ParametersPathOrgResponses200Content21): GetParametersPathOrgResponses200Content21 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOrgResponses200Content21]
  }
  
  extension [Self <: GetParametersPathOrgResponses200Content21](x: Self) {
    
    inline def setGet(value: ParametersPathOrgResponses200Content21): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
