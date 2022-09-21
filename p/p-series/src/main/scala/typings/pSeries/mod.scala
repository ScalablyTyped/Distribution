package typings.pSeries

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-series", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType](tasks: js.Iterable[js.Function0[js.Promise[ValueType] | ValueType]]): js.Promise[js.Array[ValueType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ValueType]]]
}
