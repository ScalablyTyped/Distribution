package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPut extends StObject {
  
  /**
    * Gets the GitHub Actions permissions policy for organizations and allowed actions and reusable workflows in an enterprise.
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  var get: Responses200Content248
  
  /**
    * Sets the GitHub Actions permissions policy for organizations and allowed actions and reusable workflows in an enterprise.
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  var put: RequestBodyContentApplicationjson249
}
object GetPut {
  
  inline def apply(get: Responses200Content248, put: RequestBodyContentApplicationjson249): GetPut = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPut]
  }
  
  extension [Self <: GetPut](x: Self) {
    
    inline def setGet(value: Responses200Content248): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjson249): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
