package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromIscustomammount extends StObject {
  
  /**
    * Sponsorship Tier
    * @description The `tier_changed` and `pending_tier_change` will include the original tier before the change or pending change. For more information, see the pending tier change payload.
    */
  var from: Iscustomammount
}
object FromIscustomammount {
  
  inline def apply(from: Iscustomammount): FromIscustomammount = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromIscustomammount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromIscustomammount] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Iscustomammount): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
  }
}
