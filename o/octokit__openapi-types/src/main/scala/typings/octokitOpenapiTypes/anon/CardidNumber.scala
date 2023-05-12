package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardidNumber extends StObject {
  
  var card_id: Double
}
object CardidNumber {
  
  inline def apply(card_id: Double): CardidNumber = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardidNumber] (val x: Self) extends AnyVal {
    
    inline def setCard_id(value: Double): Self = StObject.set(x, "card_id", value.asInstanceOf[js.Any])
  }
}
