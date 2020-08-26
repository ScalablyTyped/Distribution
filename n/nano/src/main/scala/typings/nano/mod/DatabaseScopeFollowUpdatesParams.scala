package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseScopeFollowUpdatesParams extends DocumentScopeFollowUpdatesParams {
  var db: String = js.native
}

object DatabaseScopeFollowUpdatesParams {
  @scala.inline
  def apply(db: String): DatabaseScopeFollowUpdatesParams = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseScopeFollowUpdatesParams]
  }
  @scala.inline
  implicit class DatabaseScopeFollowUpdatesParamsOps[Self <: DatabaseScopeFollowUpdatesParams] (val x: Self) extends AnyVal {
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
    def setDb(value: String): Self = this.set("db", value.asInstanceOf[js.Any])
  }
  
}

