package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryContext
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  @JSName("transaction")
  var transaction_Original: Transaction = js.native
  def transaction(): knexLib.knexMod.KnexNs.QueryBuilder = js.native
  def transaction(tableName: knexLib.Identifier): knexLib.knexMod.KnexNs.QueryBuilder = js.native
  def transaction(tableName: knexLib.TableName): knexLib.knexMod.KnexNs.QueryBuilder = js.native
}

