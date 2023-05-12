package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200304 extends StObject {
  
  /** Get all codes of conduct */
  var get: Responses200304
}
object GetResponses200304 {
  
  inline def apply(get: Responses200304): GetResponses200304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200304] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
