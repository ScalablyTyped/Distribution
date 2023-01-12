package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResponses202403Unknown extends StObject {
  
  var delete: Parameters135Responses
  
  var put: Responses202403Unknown
}
object PutResponses202403Unknown {
  
  inline def apply(delete: Parameters135Responses, put: Responses202403Unknown): PutResponses202403Unknown = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResponses202403Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResponses202403Unknown] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters135Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses202403Unknown): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
