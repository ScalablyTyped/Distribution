package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200HeadersLink404 extends StObject {
  
  /**
    * List assignees
    * @description Lists the [available assignees](https://docs.github.com/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues in a repository.
    */
  var get: Responses200HeadersLink404
}
object GetResponses200HeadersLink404 {
  
  inline def apply(get: Responses200HeadersLink404): GetResponses200HeadersLink404 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200HeadersLink404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200HeadersLink404] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200HeadersLink404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
