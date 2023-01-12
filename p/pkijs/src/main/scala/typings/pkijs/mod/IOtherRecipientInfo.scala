package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOtherRecipientInfo extends StObject {
  
  var oriType: String
  
  var oriValue: Any
}
object IOtherRecipientInfo {
  
  inline def apply(oriType: String, oriValue: Any): IOtherRecipientInfo = {
    val __obj = js.Dynamic.literal(oriType = oriType.asInstanceOf[js.Any], oriValue = oriValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOtherRecipientInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOtherRecipientInfo] (val x: Self) extends AnyVal {
    
    inline def setOriType(value: String): Self = StObject.set(x, "oriType", value.asInstanceOf[js.Any])
    
    inline def setOriValue(value: Any): Self = StObject.set(x, "oriValue", value.asInstanceOf[js.Any])
  }
}
