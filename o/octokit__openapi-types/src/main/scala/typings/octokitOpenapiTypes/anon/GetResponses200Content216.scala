package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content216 extends StObject {
  
  /**
    * List pull requests associated with a commit
    * @description Lists the merged pull request that introduced the commit to the repository. If the commit is not present in the default branch, will only return open pull requests associated with the commit.
    */
  var get: Responses200Content216
}
object GetResponses200Content216 {
  
  inline def apply(get: Responses200Content216): GetResponses200Content216 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content216]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content216] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content216): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
