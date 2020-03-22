package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticHookArguments[M /* <: Model */, R] extends js.Object {
  @JSName("asFindQuery")
  var asFindQuery_Original: ArrayQueryBuilderThunk[M] = js.native
  @JSName("cancelQuery")
  var cancelQuery_Original: CancelQueryThunk = js.native
  var context: QueryContext = js.native
  var inputItems: js.Array[M] = js.native
  var items: js.Array[Model] = js.native
  var modelOptions: js.UndefOr[ModelOptions] = js.native
  var relation: js.UndefOr[Relation] = js.native
  var result: js.UndefOr[R] = js.native
  var transaction: TransactionOrKnex = js.native
  def asFindQuery(): ArrayQueryBuilder[QueryBuilderType[M]] = js.native
  def cancelQuery(result: js.Any): Unit = js.native
}

