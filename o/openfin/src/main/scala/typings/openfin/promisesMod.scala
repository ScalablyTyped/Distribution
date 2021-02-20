package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promisesMod {
  
  @JSImport("openfin/_v2/util/promises", "promiseMap")
  @js.native
  def promiseMap[T, S](
    arr: js.Array[T],
    asyncF: js.Function3[/* x */ T, /* i */ Double, /* r */ js.Array[T], js.Promise[S]]
  ): js.Promise[js.Array[S]] = js.native
  
  @JSImport("openfin/_v2/util/promises", "promiseMapSerial")
  @js.native
  def promiseMapSerial[T](arr: js.Array[_], func: asyncF[T]): js.Promise[js.Array[T]] = js.native
  
  @JSImport("openfin/_v2/util/promises", "promisify")
  @js.native
  def promisify(func: js.Function): js.Function1[/* repeated */ js.Any, js.Promise[_]] = js.native
  
  @JSImport("openfin/_v2/util/promises", "serial")
  @js.native
  def serial[T](arr: js.Array[asyncF[T]]): js.Promise[js.Array[T]] = js.native
  
  type asyncF[T] = js.Function1[/* repeated */ js.Any, js.Promise[T]]
}
