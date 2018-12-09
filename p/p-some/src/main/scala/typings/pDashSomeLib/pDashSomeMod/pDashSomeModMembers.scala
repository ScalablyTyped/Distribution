package typings
package pDashSomeLib.pDashSomeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-some", JSImport.Namespace)
@js.native
object pDashSomeModMembers extends js.Object {
  val AggregateError: ScalablyTyped.runtime.Instantiable1[
    /* errors */ stdLib.Iterable[stdLib.Error | java.lang.String], 
    aggregateDashErrorLib.aggregateDashErrorMod.namespaced
  ] = js.native
  def apply[T](
    values: js.Array[pDashSomeLib.Value[T]] | stdLib.Iterable[pDashSomeLib.Value[T]],
    options: pDashSomeLib.pDashSomeMod.pSomeNs.Options[T]
  ): js.Promise[js.Array[T]] = js.native
}

