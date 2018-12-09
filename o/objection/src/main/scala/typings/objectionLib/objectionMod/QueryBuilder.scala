package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", "QueryBuilder")
@js.native
class QueryBuilder[QM /* <: objectionLib.objectionMod.ObjectionNs.Model */, RM, RV] ()
  extends objectionLib.objectionMod.ObjectionNs.QueryBuilder[QM, RM, RV]

@JSImport("objection", "QueryBuilder")
@js.native
object QueryBuilder extends js.Object {
  def forClass[M /* <: objectionLib.objectionMod.ObjectionNs.Model */, MC /* <: objectionLib.objectionMod.ObjectionNs.ModelClass[M] */](modelClass: MC): objectionLib.objectionMod.ObjectionNs.QueryBuilder[M, js.Array[M], js.Array[M]] = js.native
}

