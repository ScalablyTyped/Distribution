package typings.next.anon

import typings.next.distClientComponentsErrorBoundaryMod.ErrorComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next.next/dist/client/components/error-boundary.ErrorBoundaryProps & {  children :react.react.ReactNode} */
trait ErrorBoundaryPropschildre extends StObject {
  
  var children: ReactNode
  
  var errorComponent: ErrorComponent
}
object ErrorBoundaryPropschildre {
  
  inline def apply(errorComponent: ErrorComponent): ErrorBoundaryPropschildre = {
    val __obj = js.Dynamic.literal(errorComponent = errorComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorBoundaryPropschildre]
  }
  
  extension [Self <: ErrorBoundaryPropschildre](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setErrorComponent(value: ErrorComponent): Self = StObject.set(x, "errorComponent", value.asInstanceOf[js.Any])
  }
}
