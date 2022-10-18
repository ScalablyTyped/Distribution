package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewKey extends StObject {
  
  /**
    * The new selected key
    */
  var newKey: js.UndefOr[String] = js.undefined
}
object NewKey {
  
  inline def apply(): NewKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewKey]
  }
  
  extension [Self <: NewKey](x: Self) {
    
    inline def setNewKey(value: String): Self = StObject.set(x, "newKey", value.asInstanceOf[js.Any])
    
    inline def setNewKeyUndefined: Self = StObject.set(x, "newKey", js.undefined)
  }
}
