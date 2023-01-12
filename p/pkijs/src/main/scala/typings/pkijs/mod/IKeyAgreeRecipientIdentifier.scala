package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyAgreeRecipientIdentifier extends StObject {
  
  var value: Any
  
  var variant: Double
}
object IKeyAgreeRecipientIdentifier {
  
  inline def apply(value: Any, variant: Double): IKeyAgreeRecipientIdentifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyAgreeRecipientIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IKeyAgreeRecipientIdentifier] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: Double): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
