package typings.orbitUiReactComponents

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAutocompleteSrcUseDebouncedCallbackMod {
  
  @JSImport("@orbit-ui/react-components/dist/autocomplete/src/useDebouncedCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDebouncedCallback[T /* <: js.Function1[/* repeated */ Any, ReturnType[T]] */](func: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebouncedCallback")(func.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def useDebouncedCallback[T /* <: js.Function1[/* repeated */ Any, ReturnType[T]] */](func: T, wait: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebouncedCallback")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Any]
}
