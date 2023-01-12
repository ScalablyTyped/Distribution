package typings.meteor.anon

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyOrderSensitive] (val x: Self) extends AnyVal {
    
    inline def setKeyOrderSensitive(value: Boolean): Self = StObject.set(x, "keyOrderSensitive", value.asInstanceOf[js.Any])
    
    inline def setKeyOrderSensitiveUndefined: Self = StObject.set(x, "keyOrderSensitive", js.undefined)
  }
}
