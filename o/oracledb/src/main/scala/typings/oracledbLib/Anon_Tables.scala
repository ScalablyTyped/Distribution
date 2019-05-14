package typings
package oracledbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tables extends js.Object {
  /** Array of objects specifying the queries which were affected by the Query Change notification. */
  var tables: oracledbLib.oracledbMod.SubscriptionTables
}

object Anon_Tables {
  @scala.inline
  def apply(tables: oracledbLib.oracledbMod.SubscriptionTables): Anon_Tables = {
    val __obj = js.Dynamic.literal(tables = tables)
  
    __obj.asInstanceOf[Anon_Tables]
  }
}

