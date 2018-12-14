package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryBuilder[QM /* <: Model */, RM, RV]
  extends QueryBuilderBase[QM, RM, RV]
     with Executable[RV] {
  def castTo[T /* <: org.scalablytyped.runtime.Instantiable0[Model] */](model: T): QueryBuilder[QM, js.Array[stdLib.InstanceType[T]], js.Array[stdLib.InstanceType[T]]] = js.native
  def throwIfNotFound(): QueryBuilder[QM, RM, RM] = js.native
}

