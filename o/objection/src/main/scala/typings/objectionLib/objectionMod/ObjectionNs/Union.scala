package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Union[QM /* <: Model */] extends js.Object {
  def apply(callback: js.Function0[scala.Unit]): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def apply(callback: js.Function0[scala.Unit], wrap: scala.Boolean): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def apply(callbacks: js.Function0[scala.Unit]*): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def apply(callbacks: js.Array[js.Function0[scala.Unit]]): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def apply(callbacks: js.Array[js.Function0[scala.Unit]], wrap: scala.Boolean): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
}

