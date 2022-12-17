package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryCursor extends StObject {
  
  /** Returns a list of webhook deliveries for a webhook configured in an organization. */
  var get: ParametersQueryCursor
}
object GetParametersQueryCursor {
  
  inline def apply(get: ParametersQueryCursor): GetParametersQueryCursor = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryCursor]
  }
  
  extension [Self <: GetParametersQueryCursor](x: Self) {
    
    inline def setGet(value: ParametersQueryCursor): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
