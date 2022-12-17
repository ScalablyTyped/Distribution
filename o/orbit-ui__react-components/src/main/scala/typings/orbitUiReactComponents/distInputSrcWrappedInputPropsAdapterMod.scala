package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.`0`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.className
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInputSrcWrappedInputPropsAdapterMod {
  
  @JSImport("@orbit-ui/react-components/dist/input/src/wrappedInputPropsAdapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrappedInputPropsAdapter[P /* <: `0` */](param0: P): (Omit[P, className]) & AdaptedWrappedInputProps = ^.asInstanceOf[js.Dynamic].applyDynamic("wrappedInputPropsAdapter")(param0.asInstanceOf[js.Any]).asInstanceOf[(Omit[P, className]) & AdaptedWrappedInputProps]
  
  trait AdaptedWrappedInputProps extends StObject {
    
    var wrapperProps: `0`
  }
  object AdaptedWrappedInputProps {
    
    inline def apply(wrapperProps: `0`): AdaptedWrappedInputProps = {
      val __obj = js.Dynamic.literal(wrapperProps = wrapperProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdaptedWrappedInputProps]
    }
    
    extension [Self <: AdaptedWrappedInputProps](x: Self) {
      
      inline def setWrapperProps(value: `0`): Self = StObject.set(x, "wrapperProps", value.asInstanceOf[js.Any])
    }
  }
}
