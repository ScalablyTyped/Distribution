package typings.pTimes

import typings.pMap.mod.Options
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-times", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType](count: Double, mapper: js.Function1[/* index */ Double, ValueType | PromiseLike[ValueType]]): js.Promise[js.Array[ValueType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(count.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ValueType]]]
  inline def default[ValueType](
    count: Double,
    mapper: js.Function1[/* index */ Double, ValueType | PromiseLike[ValueType]],
    options: Options
  ): js.Promise[js.Array[ValueType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(count.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ValueType]]]
}
