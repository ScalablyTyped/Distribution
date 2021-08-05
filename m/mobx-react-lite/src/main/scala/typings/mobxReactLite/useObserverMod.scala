package typings.mobxReactLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useObserverMod {
  
  @JSImport("mobx-react-lite/dist/useObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useObserver[T](fn: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useObserver")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useObserver[T](fn: js.Function0[T], baseComponentName: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useObserver")(fn.asInstanceOf[js.Any], baseComponentName.asInstanceOf[js.Any])).asInstanceOf[T]
}
