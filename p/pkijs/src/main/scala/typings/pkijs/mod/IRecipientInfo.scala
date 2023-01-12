package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRecipientInfo extends StObject {
  
  var value: js.UndefOr[RecipientInfoValue] = js.undefined
  
  var variant: Double
}
object IRecipientInfo {
  
  inline def apply(variant: Double): IRecipientInfo = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRecipientInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRecipientInfo] (val x: Self) extends AnyVal {
    
    inline def setValue(value: RecipientInfoValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariant(value: Double): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
