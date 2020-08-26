package typings.pouchdbReplication.PouchDB.Replication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncOptions extends ReplicateOptions {
  var pull: js.UndefOr[ReplicateOptions] = js.native
  var push: js.UndefOr[ReplicateOptions] = js.native
}

object SyncOptions {
  @scala.inline
  def apply(): SyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncOptions]
  }
  @scala.inline
  implicit class SyncOptionsOps[Self <: SyncOptions] (val x: Self) extends AnyVal {
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
    def setPull(value: ReplicateOptions): Self = this.set("pull", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePull: Self = this.set("pull", js.undefined)
    @scala.inline
    def setPush(value: ReplicateOptions): Self = this.set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
  }
  
}

