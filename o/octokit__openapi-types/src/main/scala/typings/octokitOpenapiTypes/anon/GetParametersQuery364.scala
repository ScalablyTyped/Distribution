package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery364 extends StObject {
  
  /**
    * List public repositories
    * @description Lists all public repositories in the order that they were created.
    *
    * Note:
    * - For GitHub Enterprise Server, this endpoint will only list repositories available to all users on the enterprise.
    * - Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers) to get the URL for the next page of repositories.
    */
  var get: ParametersQuery364
}
object GetParametersQuery364 {
  
  inline def apply(get: ParametersQuery364): GetParametersQuery364 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery364]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQuery364] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQuery364): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
