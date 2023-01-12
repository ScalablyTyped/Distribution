package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery380 extends StObject {
  
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of users.
    */
  var get: ParametersQuery380
}
object GetParametersQuery380 {
  
  inline def apply(get: ParametersQuery380): GetParametersQuery380 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery380]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQuery380] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQuery380): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
