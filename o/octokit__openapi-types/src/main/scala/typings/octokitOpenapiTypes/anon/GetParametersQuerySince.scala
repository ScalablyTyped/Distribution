package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuerySince extends StObject {
  
  /**
    * List organizations
    * @description Lists all organizations, in the order that they were created on GitHub.
    *
    * **Note:** Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers) to get the URL for the next page of organizations.
    */
  var get: ParametersQuerySince
}
object GetParametersQuerySince {
  
  inline def apply(get: ParametersQuerySince): GetParametersQuerySince = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuerySince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQuerySince] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQuerySince): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
