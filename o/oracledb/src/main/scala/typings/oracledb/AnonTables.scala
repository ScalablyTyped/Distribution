package typings.oracledb

import typings.oracledb.mod.SubscriptionTables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTables extends js.Object {
  /** Array of objects specifying the queries which were affected by the Query Change notification. */
  var tables: SubscriptionTables
}

object AnonTables {
  @scala.inline
  def apply(tables: SubscriptionTables): AnonTables = {
    val __obj = js.Dynamic.literal(tables = tables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTables]
  }
}

