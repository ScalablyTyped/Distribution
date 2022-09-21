package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `354` extends StObject {
  
  var value: js.UndefOr[String] = js.undefined
}
object `354` {
  
  inline def apply(): `354` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`354`]
  }
  
  extension [Self <: `354`](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
