package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery652 extends StObject {
  
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of users.
    */
  var get: ParametersQuery652
}
object GetParametersQuery652 {
  
  inline def apply(get: ParametersQuery652): GetParametersQuery652 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery652]
  }
  
  extension [Self <: GetParametersQuery652](x: Self) {
    
    inline def setGet(value: ParametersQuery652): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
