package typings.oracledb.anon

import typings.oracledb.mod.SubscriptionTables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tables extends js.Object {
  /** Array of objects specifying the queries which were affected by the Query Change notification. */
  var tables: SubscriptionTables
}

object Tables {
  @scala.inline
  def apply(tables: SubscriptionTables): Tables = {
    val __obj = js.Dynamic.literal(tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tables]
  }
}

