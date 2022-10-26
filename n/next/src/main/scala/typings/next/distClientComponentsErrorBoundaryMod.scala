package typings.next

import typings.next.anon.Error
import typings.next.anon.ErrorBoundaryPropschildre
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsErrorBoundaryMod {
  
  @JSImport("next/dist/client/components/error-boundary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ErrorBoundary(param0: ErrorBoundaryPropschildre): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ErrorBoundary")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def GlobalErrorComponent(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("GlobalErrorComponent")().asInstanceOf[Element]
  
  trait ErrorBoundaryProps extends StObject {
    
    var errorComponent: ErrorComponent
  }
  object ErrorBoundaryProps {
    
    inline def apply(errorComponent: ErrorComponent): ErrorBoundaryProps = {
      val __obj = js.Dynamic.literal(errorComponent = errorComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorBoundaryProps]
    }
    
    extension [Self <: ErrorBoundaryProps](x: Self) {
      
      inline def setErrorComponent(value: ErrorComponent): Self = StObject.set(x, "errorComponent", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorComponent = ComponentType[Error]
}
