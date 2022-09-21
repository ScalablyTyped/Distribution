package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.orbitUiReactComponentsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useChainedEventCallbackMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useChainedEventCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createChainedFunction_false[T /* <: ChainableFunction */](funcs: (T | `false`)*): ChainableFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createChainedFunction")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ChainableFunction]
  
  inline def useChainedEventCallback_false[T /* <: ChainableFunction */](callbacks: (T | `false`)*): ChainableFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("useChainedEventCallback")(callbacks.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ChainableFunction]
  
  @js.native
  trait ChainableFunction extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
}
