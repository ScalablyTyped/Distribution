package typings.objection.mod

import org.scalablytyped.runtime.StringDictionary
import typings.knex.mod.AliasDict
import typings.knex.mod.TableDescriptor
import typings.knex.mod.TableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryContext
  extends /* key */ StringDictionary[js.Any] {
  @JSName("transaction")
  var transaction_Original: Transaction_ = js.native
  def transaction[TRecord2, TResult2](): typings.knex.mod.QueryBuilder[TRecord2, TResult2] = js.native
  def transaction[TRecord2, TResult2](tableName: AliasDict): typings.knex.mod.QueryBuilder[TRecord2, TResult2] = js.native
  def transaction[TRecord2, TResult2](tableName: AliasDict, options: TableOptions): typings.knex.mod.QueryBuilder[TRecord2, TResult2] = js.native
  def transaction[TRecord2, TResult2](tableName: TableDescriptor): typings.knex.mod.QueryBuilder[TRecord2, TResult2] = js.native
  def transaction[TRecord2, TResult2](tableName: TableDescriptor, options: TableOptions): typings.knex.mod.QueryBuilder[TRecord2, TResult2] = js.native
}

