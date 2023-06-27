package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters436 extends StObject {
  
  /**
    * List public repositories
    * @description Lists all public repositories in the order that they were created.
    *
    * Note:
    * - For GitHub Enterprise Server, this endpoint will only list repositories available to all users on the enterprise.
    * - Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers) to get the URL for the next page of repositories.
    */
  var get: Parameters436
}
object GetParameters436 {
  
  inline def apply(get: Parameters436): GetParameters436 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters436]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters436] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters436): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
