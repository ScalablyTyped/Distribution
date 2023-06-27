package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `193` extends StObject {
  
  /** @description The name of the variable. */
  var name: js.UndefOr[String] = js.undefined
  
  /** @description The value of the variable. */
  var value: js.UndefOr[String] = js.undefined
}
object `193` {
  
  inline def apply(): `193` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`193`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `193`] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
