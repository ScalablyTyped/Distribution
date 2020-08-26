package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SQLTransaction extends js.Object {
  def executeSql(sql: String): SQLResultSet = js.native
}

object SQLTransaction {
  @scala.inline
  def apply(executeSql: String => SQLResultSet): SQLTransaction = {
    val __obj = js.Dynamic.literal(executeSql = js.Any.fromFunction1(executeSql))
    __obj.asInstanceOf[SQLTransaction]
  }
  @scala.inline
  implicit class SQLTransactionOps[Self <: SQLTransaction] (val x: Self) extends AnyVal {
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
    def setExecuteSql(value: String => SQLResultSet): Self = this.set("executeSql", js.Any.fromFunction1(value))
  }
  
}

