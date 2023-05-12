package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses403422 extends StObject {
  
  /**
    * List public gists
    * @description List public gists sorted by most recently updated to least recently updated.
    *
    * Note: With [pagination](https://docs.github.com/rest/overview/resources-in-the-rest-api#pagination), you can fetch up to 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.
    */
  var get: Responses403422
}
object GetResponses403422 {
  
  inline def apply(get: Responses403422): GetResponses403422 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses403422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses403422] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses403422): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
