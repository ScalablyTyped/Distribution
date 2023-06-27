package typings.observ

import typings.observ.mod.ObservableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object watchMod {
  
  inline def apply[O /* <: ObservableValue[Any] */](
    observable: O,
    listener: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: O extends observ.observ.ObservableValue<infer V> ? V : never */ /* value */ js.Any, 
      Unit
    ]
  ): RemoveListener = (^.asInstanceOf[js.Dynamic].apply(observable.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[RemoveListener]
  
  @JSImport("observ/watch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type RemoveListener = js.Function0[Unit]
}
