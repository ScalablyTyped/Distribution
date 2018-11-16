package typings
package pDashLazyLib.pDashLazyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-lazy", JSImport.Namespace)
@js.native
class namespaced[T] () extends PLazy[T]

@JSImport("p-lazy", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def from[T](fn: js.Function0[T | stdLib.PromiseLike[T]]): pDashLazyLib.pDashLazyMod.PLazy[T] = js.native
}

