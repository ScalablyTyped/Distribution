package typings.mercadopagoSdkJs.bricks

import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.customer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedCardPayer extends StObject {
  
  var id: String
  
  var `type`: customer
}
object SavedCardPayer {
  
  inline def apply(id: String): SavedCardPayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("customer")
    __obj.asInstanceOf[SavedCardPayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavedCardPayer] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: customer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
