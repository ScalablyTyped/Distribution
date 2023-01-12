package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherRecipientInfoJson
  extends StObject
     with RecipientInfoValueJson {
  
  var oriType: String
  
  var oriValue: js.UndefOr[Any] = js.undefined
}
object OtherRecipientInfoJson {
  
  inline def apply(oriType: String): OtherRecipientInfoJson = {
    val __obj = js.Dynamic.literal(oriType = oriType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherRecipientInfoJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OtherRecipientInfoJson] (val x: Self) extends AnyVal {
    
    inline def setOriType(value: String): Self = StObject.set(x, "oriType", value.asInstanceOf[js.Any])
    
    inline def setOriValue(value: Any): Self = StObject.set(x, "oriValue", value.asInstanceOf[js.Any])
    
    inline def setOriValueUndefined: Self = StObject.set(x, "oriValue", js.undefined)
  }
}
