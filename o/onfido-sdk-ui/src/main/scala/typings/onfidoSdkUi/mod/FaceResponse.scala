package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceResponse extends StObject {
  
  var id: String
  
  var variant: RequestedVariant
}
object FaceResponse {
  
  inline def apply(id: String, variant: RequestedVariant): FaceResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FaceResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: RequestedVariant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
