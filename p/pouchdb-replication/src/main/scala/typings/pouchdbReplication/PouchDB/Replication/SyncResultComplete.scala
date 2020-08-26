package typings.pouchdbReplication.PouchDB.Replication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncResultComplete[Content /* <: js.Object */] extends js.Object {
  var pull: js.UndefOr[ReplicationResultComplete[Content]] = js.native
  var push: js.UndefOr[ReplicationResultComplete[Content]] = js.native
}

object SyncResultComplete {
  @scala.inline
  def apply[/* <: js.Object */ Content](): SyncResultComplete[Content] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncResultComplete[Content]]
  }
  @scala.inline
  implicit class SyncResultCompleteOps[Self <: SyncResultComplete[_], /* <: js.Object */ Content] (val x: Self with SyncResultComplete[Content]) extends AnyVal {
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
    def setPull(value: ReplicationResultComplete[Content]): Self = this.set("pull", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePull: Self = this.set("pull", js.undefined)
    @scala.inline
    def setPush(value: ReplicationResultComplete[Content]): Self = this.set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
  }
  
}

