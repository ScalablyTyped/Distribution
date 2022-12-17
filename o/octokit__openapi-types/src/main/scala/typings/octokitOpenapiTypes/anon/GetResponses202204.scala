package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses202204 extends StObject {
  
  /** Returns a weekly aggregate of the number of additions and deletions pushed to a repository. */
  var get: Responses202204
}
object GetResponses202204 {
  
  inline def apply(get: Responses202204): GetResponses202204 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses202204]
  }
  
  extension [Self <: GetResponses202204](x: Self) {
    
    inline def setGet(value: Responses202204): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
