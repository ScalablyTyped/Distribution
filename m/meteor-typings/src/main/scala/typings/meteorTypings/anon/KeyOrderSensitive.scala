package typings.meteorTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyOrderSensitive extends StObject {
  
  var keyOrderSensitive: js.UndefOr[Boolean] = js.undefined
}
object KeyOrderSensitive {
  
  inline def apply(): KeyOrderSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyOrderSensitive]
  }
  
  extension [Self <: KeyOrderSensitive](x: Self) {
    
    inline def setKeyOrderSensitive(value: Boolean): Self = StObject.set(x, "keyOrderSensitive", value.asInstanceOf[js.Any])
    
    inline def setKeyOrderSensitiveUndefined: Self = StObject.set(x, "keyOrderSensitive", js.undefined)
  }
}
