package typings.paypalRestSdk.mod.invoice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QrResponse extends StObject {
  
  var image: String = js.native
}
object QrResponse {
  
  @scala.inline
  def apply(image: String): QrResponse = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[QrResponse]
  }
  
  @scala.inline
  implicit class QrResponseMutableBuilder[Self <: QrResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
