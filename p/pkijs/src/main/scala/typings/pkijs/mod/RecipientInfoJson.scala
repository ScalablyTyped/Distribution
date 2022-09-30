package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientInfoJson extends StObject {
  
  var value: js.UndefOr[RecipientInfoValueJson] = js.undefined
  
  var variant: Double
}
object RecipientInfoJson {
  
  inline def apply(variant: Double): RecipientInfoJson = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientInfoJson]
  }
  
  extension [Self <: RecipientInfoJson](x: Self) {
    
    inline def setValue(value: RecipientInfoValueJson): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariant(value: Double): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
