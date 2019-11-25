package typings.oracledb

import typings.oracledb.oracledbMod.SubscriptionTables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tables extends js.Object {
  /** Array of objects specifying the queries which were affected by the Query Change notification. */
  var tables: SubscriptionTables
}

object Anon_Tables {
  @scala.inline
  def apply(tables: SubscriptionTables): Anon_Tables = {
    val __obj = js.Dynamic.literal(tables = tables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Tables]
  }
}

