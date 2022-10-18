package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery600 extends StObject {
  
  /**
    * Lists all public repositories in the order that they were created.
    *
    * Note:
    * - For GitHub Enterprise Server, this endpoint will only list repositories available to all users on the enterprise.
    * - Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of repositories.
    */
  var get: ParametersQuery600
}
object GetParametersQuery600 {
  
  inline def apply(get: ParametersQuery600): GetParametersQuery600 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery600]
  }
  
  extension [Self <: GetParametersQuery600](x: Self) {
    
    inline def setGet(value: ParametersQuery600): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
