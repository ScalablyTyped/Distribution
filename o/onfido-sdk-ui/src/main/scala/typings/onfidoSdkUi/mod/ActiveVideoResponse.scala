package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveVideoResponse extends StObject {
  
  var id: String
}
object ActiveVideoResponse {
  
  inline def apply(id: String): ActiveVideoResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveVideoResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveVideoResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
