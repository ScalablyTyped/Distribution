package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters52 extends StObject {
  
  /**
    * List organizations
    * @description Lists all organizations, in the order that they were created on GitHub.
    *
    * **Note:** Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers) to get the URL for the next page of organizations.
    */
  var get: Parameters52
}
object GetParameters52 {
  
  inline def apply(get: Parameters52): GetParameters52 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters52]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters52] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters52): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
