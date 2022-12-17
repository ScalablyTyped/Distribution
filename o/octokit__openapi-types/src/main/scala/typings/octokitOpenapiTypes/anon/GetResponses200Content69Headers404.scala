package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content69Headers404 extends StObject {
  
  /** Lists the [available assignees](https://docs.github.com/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues in a repository. */
  var get: Responses200Content69Headers404
}
object GetResponses200Content69Headers404 {
  
  inline def apply(get: Responses200Content69Headers404): GetResponses200Content69Headers404 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content69Headers404]
  }
  
  extension [Self <: GetResponses200Content69Headers404](x: Self) {
    
    inline def setGet(value: Responses200Content69Headers404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
