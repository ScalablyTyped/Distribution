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
  def transaction(): knexLib.knexMod.QueryBuilder = js.native
  def transaction(tableName: knexLib.knexMod.Identifier): knexLib.knexMod.QueryBuilder = js.native
  def transaction(tableName: knexLib.knexMod.TableName): knexLib.knexMod.QueryBuilder = js.native
}

