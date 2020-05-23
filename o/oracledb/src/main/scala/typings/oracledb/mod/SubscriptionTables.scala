package typings.oracledb.mod

import typings.oracledb.anon.Operation
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
  var rows: js.UndefOr[js.Array[Operation]] = js.undefined
}

object SubscriptionTables {
  @scala.inline
  def apply(name: String, operation: Double, rows: js.Array[Operation] = null): SubscriptionTables = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionTables]
  }
}

