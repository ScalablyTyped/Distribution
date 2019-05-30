package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryContext
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  @JSName("transaction")
  var transaction_Original: Transaction = js.native
  def transaction[TRecord2, TResult2](): knexLib.knexMod.QueryBuilder[TRecord2, TResult2] = js.native
  def transaction[TRecord2, TResult2](tableName: knexLib.knexMod.AliasDict): knexLib.knexMod.QueryBuilder[TRecord2, TResult2] = js.native
  def transaction[TRecord2, TResult2](tableName: knexLib.knexMod.TableDescriptor): knexLib.knexMod.QueryBuilder[TRecord2, TResult2] = js.native
}

