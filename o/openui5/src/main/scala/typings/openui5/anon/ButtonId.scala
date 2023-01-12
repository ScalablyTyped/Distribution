package typings.openui5.anon

import typings.openui5.sapMButtonMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonId extends StObject {
  
  /**
    * Reference to the button, that has been selected.
    */
  var button: js.UndefOr[default] = js.undefined
  
  /**
    * ID of the button, which has been selected.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Key of the button, which has been selected. This property is only filled when the control is initiated
    * with the items aggregation.
    */
  var key: js.UndefOr[String] = js.undefined
}
object ButtonId {
  
  inline def apply(): ButtonId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonId] (val x: Self) extends AnyVal {
    
    inline def setButton(value: default): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
