package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery298 extends StObject {
  
  /**
    * Lists all organizations, in the order that they were created on GitHub.
    *
    * **Note:** Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of organizations.
    */
  var get: ParametersQuery298
}
object GetParametersQuery298 {
  
  inline def apply(get: ParametersQuery298): GetParametersQuery298 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery298]
  }
  
  extension [Self <: GetParametersQuery298](x: Self) {
    
    inline def setGet(value: ParametersQuery298): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
