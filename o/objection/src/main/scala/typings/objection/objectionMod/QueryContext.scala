package typings.objection.objectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.knex.knexMod.AliasDict
import typings.knex.knexMod.TableDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryContext
  extends /* key */ StringDictionary[js.Any] {
  @JSName("transaction")
  var transaction_Original: Transaction = js.native
  def transaction[TRecord2, TResult2](): typings.knex.knexMod.QueryBuilder[TRecord2, TResult2] = js.native
  def transaction[TRecord2, TResult2](tableName: AliasDict): typings.knex.knexMod.QueryBuilder[TRecord2, TResult2] = js.native
  def transaction[TRecord2, TResult2](tableName: TableDescriptor): typings.knex.knexMod.QueryBuilder[TRecord2, TResult2] = js.native
}

