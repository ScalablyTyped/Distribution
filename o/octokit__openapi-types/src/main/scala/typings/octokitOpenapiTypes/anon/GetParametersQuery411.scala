package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery411 extends StObject {
  
  /**
    * List users
    * @description Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers) to get the URL for the next page of users.
    */
  var get: ParametersQuery411
}
object GetParametersQuery411 {
  
  inline def apply(get: ParametersQuery411): GetParametersQuery411 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery411]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQuery411] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQuery411): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
