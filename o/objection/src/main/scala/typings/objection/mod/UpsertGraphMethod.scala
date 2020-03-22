package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpsertGraphMethod[M /* <: Model */] extends js.Object {
  def apply[QB /* <: AnyQueryBuilder */](graph: js.Array[PartialModelGraph[M, M with GraphParameters]]): ArrayQueryBuilder[QB] = js.native
  def apply[QB /* <: AnyQueryBuilder */](graph: js.Array[PartialModelGraph[M, M with GraphParameters]], options: UpsertGraphOptions): ArrayQueryBuilder[QB] = js.native
  def apply[QB /* <: AnyQueryBuilder */](graph: PartialModelGraph[M, M with GraphParameters]): SingleQueryBuilder[QB] = js.native
  def apply[QB /* <: AnyQueryBuilder */](graph: PartialModelGraph[M, M with GraphParameters], options: UpsertGraphOptions): SingleQueryBuilder[QB] = js.native
}

