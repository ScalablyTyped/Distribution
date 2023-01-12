package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200202204 extends StObject {
  
  /** Returns the last year of commit activity grouped by week. The `days` array is a group of commits per day, starting on `Sunday`. */
  var get: Responses200202204
}
object GetResponses200202204 {
  
  inline def apply(get: Responses200202204): GetResponses200202204 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200202204]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200202204] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200202204): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
