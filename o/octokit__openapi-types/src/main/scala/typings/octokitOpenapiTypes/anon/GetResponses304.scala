package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses304 extends StObject {
  
  var get: Responses304
}
object GetResponses304 {
  
  inline def apply(get: Responses304): GetResponses304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses304]
  }
  
  extension [Self <: GetResponses304](x: Self) {
    
    inline def setGet(value: Responses304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
