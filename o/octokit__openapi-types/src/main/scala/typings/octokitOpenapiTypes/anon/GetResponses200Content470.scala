package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content470 extends StObject {
  
  /** Lists the merged pull request that introduced the commit to the repository. If the commit is not present in the default branch, additionally returns open pull requests associated with the commit. The results may include open and closed pull requests. */
  var get: Responses200Content470
}
object GetResponses200Content470 {
  
  inline def apply(get: Responses200Content470): GetResponses200Content470 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content470]
  }
  
  extension [Self <: GetResponses200Content470](x: Self) {
    
    inline def setGet(value: Responses200Content470): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
