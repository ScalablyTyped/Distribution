package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusBrickAdditionalData extends StObject {
  
  var creq: String
  
  var externalResourceUrl: String
}
object StatusBrickAdditionalData {
  
  inline def apply(creq: String, externalResourceUrl: String): StatusBrickAdditionalData = {
    val __obj = js.Dynamic.literal(creq = creq.asInstanceOf[js.Any], externalResourceUrl = externalResourceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusBrickAdditionalData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusBrickAdditionalData] (val x: Self) extends AnyVal {
    
    inline def setCreq(value: String): Self = StObject.set(x, "creq", value.asInstanceOf[js.Any])
    
    inline def setExternalResourceUrl(value: String): Self = StObject.set(x, "externalResourceUrl", value.asInstanceOf[js.Any])
  }
}
