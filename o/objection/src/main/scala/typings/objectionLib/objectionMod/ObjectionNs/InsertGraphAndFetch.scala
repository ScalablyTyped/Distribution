package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertGraphAndFetch[QM /* <: Model */] extends js.Object {
  def apply(): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def apply(modelOrObject: stdLib.Partial[QM]): QueryBuilder[QM, QM, QM] = js.native
  def apply(modelOrObject: stdLib.Partial[QM], options: InsertGraphOptions): QueryBuilder[QM, QM, QM] = js.native
  def apply(modelsOrObjects: js.Array[stdLib.Partial[QM]]): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def apply(modelsOrObjects: js.Array[stdLib.Partial[QM]], options: InsertGraphOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
}

