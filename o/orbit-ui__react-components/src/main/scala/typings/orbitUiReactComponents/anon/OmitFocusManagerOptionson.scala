package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@orbit-ui/react-components.@orbit-ui/react-components/dist/shared/src/useFocusManager.FocusManagerOptions, 'onFocus'> */
trait OmitFocusManagerOptionson extends StObject {
  
  var isVirtual: js.UndefOr[Boolean] = js.undefined
  
  var keyProp: js.UndefOr[String] = js.undefined
}
object OmitFocusManagerOptionson {
  
  inline def apply(): OmitFocusManagerOptionson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitFocusManagerOptionson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitFocusManagerOptionson] (val x: Self) extends AnyVal {
    
    inline def setIsVirtual(value: Boolean): Self = StObject.set(x, "isVirtual", value.asInstanceOf[js.Any])
    
    inline def setIsVirtualUndefined: Self = StObject.set(x, "isVirtual", js.undefined)
    
    inline def setKeyProp(value: String): Self = StObject.set(x, "keyProp", value.asInstanceOf[js.Any])
    
    inline def setKeyPropUndefined: Self = StObject.set(x, "keyProp", js.undefined)
  }
}
