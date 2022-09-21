package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiPagedRequest extends StObject {
  
  var offset: Double
}
object ApiPagedRequest {
  
  inline def apply(offset: Double): ApiPagedRequest = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiPagedRequest]
  }
  
  extension [Self <: ApiPagedRequest](x: Self) {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
