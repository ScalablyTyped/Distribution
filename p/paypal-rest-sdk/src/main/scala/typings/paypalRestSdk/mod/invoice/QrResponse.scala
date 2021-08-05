package typings.paypalRestSdk.mod.invoice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QrResponse extends StObject {
  
  var image: String
}
object QrResponse {
  
  inline def apply(image: String): QrResponse = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[QrResponse]
  }
  
  extension [Self <: QrResponse](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
