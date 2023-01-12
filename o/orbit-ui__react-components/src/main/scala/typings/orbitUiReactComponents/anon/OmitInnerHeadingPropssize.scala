package typings.orbitUiReactComponents.anon

import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@orbit-ui/react-components.@orbit-ui/react-components/dist/typography/src/Heading.InnerHeadingProps, 'size' | 'as'> */
trait OmitInnerHeadingPropssize extends StObject {
  
  var children: ReactNode
  
  var forwardedRef: ForwardedRef[Any]
}
object OmitInnerHeadingPropssize {
  
  inline def apply(): OmitInnerHeadingPropssize = {
    val __obj = js.Dynamic.literal(forwardedRef = null)
    __obj.asInstanceOf[OmitInnerHeadingPropssize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitInnerHeadingPropssize] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
    
    inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
  }
}
