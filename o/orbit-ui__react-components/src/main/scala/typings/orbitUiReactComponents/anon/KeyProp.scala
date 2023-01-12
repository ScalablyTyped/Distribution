package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyProp extends StObject {
  
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  
  var keyProp: js.UndefOr[String] = js.undefined
}
object KeyProp {
  
  inline def apply(): KeyProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyProp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyProp] (val x: Self) extends AnyVal {
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    inline def setKeyProp(value: String): Self = StObject.set(x, "keyProp", value.asInstanceOf[js.Any])
    
    inline def setKeyPropUndefined: Self = StObject.set(x, "keyProp", js.undefined)
  }
}
