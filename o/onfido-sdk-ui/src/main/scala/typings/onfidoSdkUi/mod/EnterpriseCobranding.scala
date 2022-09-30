package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseCobranding extends StObject {
  
  var text: String
}
object EnterpriseCobranding {
  
  inline def apply(text: String): EnterpriseCobranding = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseCobranding]
  }
  
  extension [Self <: EnterpriseCobranding](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
