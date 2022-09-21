package typings.nukaCarousel

import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStateWithRefMod {
  
  @JSImport("nuka-carousel/lib/hooks/use-state-with-ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStateWithRef[S](initialState: S): js.Tuple3[S, js.Function1[/* newValue */ S, Unit], MutableRefObject[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStateWithRef")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[S, js.Function1[/* newValue */ S, Unit], MutableRefObject[S]]]
}
