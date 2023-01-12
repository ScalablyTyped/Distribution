package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typings.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@orbit-ui/react-components.@orbit-ui/react-components/dist/icons/src/MultiVariantIcon.InnerMultiVariantIconProps, 'src24' | 'src32'> */
trait OmitInnerMultiVariantIcon extends StObject {
  
  var forwardedRef: ForwardedRef[Any]
  
  var size: js.UndefOr[`2xs` | xs | sm | md | lg | xl | inherit] = js.undefined
  
  var slot: js.UndefOr[String] = js.undefined
}
object OmitInnerMultiVariantIcon {
  
  inline def apply(): OmitInnerMultiVariantIcon = {
    val __obj = js.Dynamic.literal(forwardedRef = null)
    __obj.asInstanceOf[OmitInnerMultiVariantIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitInnerMultiVariantIcon] (val x: Self) extends AnyVal {
    
    inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
    
    inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    
    inline def setSize(value: `2xs` | xs | sm | md | lg | xl | inherit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
  }
}
