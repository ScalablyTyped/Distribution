package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content582 extends StObject {
  
  /** Returns a weekly aggregate of the number of additions and deletions pushed to a repository. */
  var get: Responses200Content582
}
object GetResponses200Content582 {
  
  inline def apply(get: Responses200Content582): GetResponses200Content582 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content582]
  }
  
  extension [Self <: GetResponses200Content582](x: Self) {
    
    inline def setGet(value: Responses200Content582): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
