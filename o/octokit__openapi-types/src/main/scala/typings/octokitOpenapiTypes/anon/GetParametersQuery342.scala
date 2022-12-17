package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery342 extends StObject {
  
  /**
    * Lists all public repositories in the order that they were created.
    *
    * Note:
    * - For GitHub Enterprise Server, this endpoint will only list repositories available to all users on the enterprise.
    * - Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of repositories.
    */
  var get: ParametersQuery342
}
object GetParametersQuery342 {
  
  inline def apply(get: ParametersQuery342): GetParametersQuery342 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery342]
  }
  
  extension [Self <: GetParametersQuery342](x: Self) {
    
    inline def setGet(value: ParametersQuery342): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
