package typings.oracledb.mod

import typings.oracledb.anon.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object specifying which tables were affected by a subscription's notification.
  */
@js.native
trait SubscriptionTables extends js.Object {
  /** Name of the table which was modified in some way. */
  var name: String = js.native
  /**
    * One of the CQN_OPCODE_* constants.
    */
  var operation: Double = js.native
  /**
    * array of objects specifying the rows which were changed. This will only be defined if the qos
    * quality of service used when creating the subscription indicated the desire for ROWIDs and no
    * summary grouping took place.
    */
  var rows: js.UndefOr[js.Array[Operation]] = js.native
}

object SubscriptionTables {
  @scala.inline
  def apply(name: String, operation: Double): SubscriptionTables = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionTables]
  }
  @scala.inline
  implicit class SubscriptionTablesOps[Self <: SubscriptionTables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: Double): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsVarargs(value: Operation*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[Operation]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
  
}

