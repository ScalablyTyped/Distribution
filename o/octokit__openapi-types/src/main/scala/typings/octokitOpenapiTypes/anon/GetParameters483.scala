package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters483 extends StObject {
  
  /**
    * List users
    * @description Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers) to get the URL for the next page of users.
    */
  var get: Parameters483
}
object GetParameters483 {
  
  inline def apply(get: Parameters483): GetParameters483 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters483]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters483] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters483): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
