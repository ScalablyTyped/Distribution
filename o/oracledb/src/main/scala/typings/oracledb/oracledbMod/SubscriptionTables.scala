package typings.oracledb.oracledbMod

import typings.oracledb.Anon_Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object specifying which tables were affected by a subscription's notification.
  */
trait SubscriptionTables extends js.Object {
  /** Name of the table which was modified in some way. */
  var name: String
  /**
    * One of the CQN_OPCODE_* constants.
    */
  var operation: Double
  /**
    * array of objects specifying the rows which were changed. This will only be defined if the qos
    * quality of service used when creating the subscription indicated the desire for ROWIDs and no
    * summary grouping took place.
    */
  var rows: js.UndefOr[js.Array[Anon_Operation]] = js.undefined
}

object SubscriptionTables {
  @scala.inline
  def apply(name: String, operation: Double, rows: js.Array[Anon_Operation] = null): SubscriptionTables = {
    val __obj = js.Dynamic.literal(name = name, operation = operation)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[SubscriptionTables]
  }
}

