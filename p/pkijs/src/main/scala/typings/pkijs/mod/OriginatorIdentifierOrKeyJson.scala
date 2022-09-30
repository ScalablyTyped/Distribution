package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginatorIdentifierOrKeyJson extends StObject {
  
  var value: js.UndefOr[Any] = js.undefined
  
  var variant: Double
}
object OriginatorIdentifierOrKeyJson {
  
  inline def apply(variant: Double): OriginatorIdentifierOrKeyJson = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginatorIdentifierOrKeyJson]
  }
  
  extension [Self <: OriginatorIdentifierOrKeyJson](x: Self) {
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariant(value: Double): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
