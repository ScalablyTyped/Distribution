package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200304403422 extends StObject {
  
  /**
    * List public gists sorted by most recently updated to least recently updated.
    *
    * Note: With [pagination](https://docs.github.com/rest/overview/resources-in-the-rest-api#pagination), you can fetch up to 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.
    */
  var get: Responses200304403422
}
object GetResponses200304403422 {
  
  inline def apply(get: Responses200304403422): GetResponses200304403422 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200304403422]
  }
  
  extension [Self <: GetResponses200304403422](x: Self) {
    
    inline def setGet(value: Responses200304403422): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
