package typings.pkijs.mod

import typings.asn1js.mod.IntegerJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralSubtreeJson extends StObject {
  
  var base: GeneralNameJson
  
  var maximum: js.UndefOr[Double | IntegerJson] = js.undefined
  
  var minimum: js.UndefOr[Double | IntegerJson] = js.undefined
}
object GeneralSubtreeJson {
  
  inline def apply(base: GeneralNameJson): GeneralSubtreeJson = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralSubtreeJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneralSubtreeJson] (val x: Self) extends AnyVal {
    
    inline def setBase(value: GeneralNameJson): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setMaximum(value: Double | IntegerJson): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: Double | IntegerJson): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
  }
}
