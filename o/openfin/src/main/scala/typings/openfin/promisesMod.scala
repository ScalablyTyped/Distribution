package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promisesMod {
  
  @JSImport("openfin/_v2/util/promises", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def promiseMap[T, S](
    arr: js.Array[T],
    asyncF: js.Function3[/* x */ T, /* i */ Double, /* r */ js.Array[T], js.Promise[S]]
  ): js.Promise[js.Array[S]] = (^.asInstanceOf[js.Dynamic].applyDynamic("promiseMap")(arr.asInstanceOf[js.Any], asyncF.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[S]]]
  
  inline def promiseMapSerial[T](arr: js.Array[js.Any], func: asyncF[T]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("promiseMapSerial")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  
  inline def promisify(func: js.Function): js.Function1[/* repeated */ js.Any, js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]]
  
  inline def serial[T](arr: js.Array[asyncF[T]]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("serial")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
  
  @js.native
  trait asyncF[T] extends StObject {
    
    def apply(args: js.Any*): js.Promise[T] = js.native
  }
}
