package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOriginatorIdentifierOrKey extends StObject {
  
  var value: js.UndefOr[Any] = js.undefined
  
  var variant: Double
}
object IOriginatorIdentifierOrKey {
  
  inline def apply(variant: Double): IOriginatorIdentifierOrKey = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOriginatorIdentifierOrKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOriginatorIdentifierOrKey] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariant(value: Double): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
