package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content199 extends StObject {
  
  /** Lists the merged pull request that introduced the commit to the repository. If the commit is not present in the default branch, additionally returns open pull requests associated with the commit. The results may include open and closed pull requests. */
  var get: Responses200Content199
}
object GetResponses200Content199 {
  
  inline def apply(get: Responses200Content199): GetResponses200Content199 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content199]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content199] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content199): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
