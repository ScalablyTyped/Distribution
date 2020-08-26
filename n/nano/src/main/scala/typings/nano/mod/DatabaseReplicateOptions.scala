package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
@js.native
trait DatabaseReplicateOptions extends js.Object {
  // Cancels the replication
  var cancel: js.UndefOr[Boolean] = js.native
  // Configure the replication to be continuous
  var continuous: js.UndefOr[Boolean] = js.native
  // Creates the target database. Required administrator’s privileges on target server.
  var create_target: js.UndefOr[Boolean] = js.native
  // Array of document IDs to be synchronized
  var doc_ids: js.UndefOr[js.Array[String]] = js.native
  // The name of a filter function.
  var filter: js.UndefOr[String] = js.native
  // Address of a proxy server through which replication should occur (protocol can be “http” or “socks5”)
  var proxy: js.UndefOr[String] = js.native
  // Source database name or URL
  var source: js.UndefOr[String] = js.native
  // Target database name or URL
  var target: js.UndefOr[String] = js.native
}

object DatabaseReplicateOptions {
  @scala.inline
  def apply(): DatabaseReplicateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseReplicateOptions]
  }
  @scala.inline
  implicit class DatabaseReplicateOptionsOps[Self <: DatabaseReplicateOptions] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setContinuous(value: Boolean): Self = this.set("continuous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuous: Self = this.set("continuous", js.undefined)
    @scala.inline
    def setCreate_target(value: Boolean): Self = this.set("create_target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate_target: Self = this.set("create_target", js.undefined)
    @scala.inline
    def setDoc_idsVarargs(value: String*): Self = this.set("doc_ids", js.Array(value :_*))
    @scala.inline
    def setDoc_ids(value: js.Array[String]): Self = this.set("doc_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoc_ids: Self = this.set("doc_ids", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

