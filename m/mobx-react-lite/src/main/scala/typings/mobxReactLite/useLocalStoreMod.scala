package typings.mobxReactLite

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLocalStoreMod {
  
  @JSImport("mobx-react-lite/dist/useLocalStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useLocalStore[TStore /* <: Record[String, js.Any] */](initializer: js.Function0[TStore]): TStore = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalStore")(initializer.asInstanceOf[js.Any]).asInstanceOf[TStore]
  inline def useLocalStore[TStore /* <: Record[String, js.Any] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalStore")(initializer.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[TStore]
}
