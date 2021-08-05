package typings.paypalRestSdk.mod.invoice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tax
  extends StObject
     with Cost {
  
  var id: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object Tax {
  
  inline def apply(): Tax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tax]
  }
  
  extension [Self <: Tax](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
