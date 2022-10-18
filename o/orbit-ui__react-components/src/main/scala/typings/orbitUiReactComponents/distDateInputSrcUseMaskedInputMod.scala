package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.OnChange
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDateInputSrcUseMaskedInputMod {
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src/useMaskedInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMaskedInput(hasInputElementMask: UseMaskedInputProps): OnChange = ^.asInstanceOf[js.Dynamic].applyDynamic("useMaskedInput")(hasInputElementMask.asInstanceOf[js.Any]).asInstanceOf[OnChange]
  
  trait UseMaskedInputProps extends StObject {
    
    var inputElement: js.UndefOr[HTMLInputElement] = js.undefined
    
    var mask: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  }
  object UseMaskedInputProps {
    
    inline def apply(): UseMaskedInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseMaskedInputProps]
    }
    
    extension [Self <: UseMaskedInputProps](x: Self) {
      
      inline def setInputElement(value: HTMLInputElement): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
      
      inline def setInputElementUndefined: Self = StObject.set(x, "inputElement", js.undefined)
      
      inline def setMask(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMaskVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "mask", js.Array(value*))
    }
  }
}
