package typings.nodeOpenload.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Added extends js.Object {
  var added: String = js.native
  var bytes_loaded: String = js.native
  var bytes_total: String = js.native
  var extid: String | Boolean = js.native
  var folderid: String = js.native
  var id: Double = js.native
  var last_update: String = js.native
  var remoteurl: String = js.native
  var status: String = js.native
  var url: String | Boolean = js.native
}

object Added {
  @scala.inline
  def apply(
    added: String,
    bytes_loaded: String,
    bytes_total: String,
    extid: String | Boolean,
    folderid: String,
    id: Double,
    last_update: String,
    remoteurl: String,
    status: String,
    url: String | Boolean
  ): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], bytes_loaded = bytes_loaded.asInstanceOf[js.Any], bytes_total = bytes_total.asInstanceOf[js.Any], extid = extid.asInstanceOf[js.Any], folderid = folderid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_update = last_update.asInstanceOf[js.Any], remoteurl = remoteurl.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
  @scala.inline
  implicit class AddedOps[Self <: Added] (val x: Self) extends AnyVal {
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
    def setAdded(value: String): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytes_loaded(value: String): Self = this.set("bytes_loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytes_total(value: String): Self = this.set("bytes_total", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtid(value: String | Boolean): Self = this.set("extid", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolderid(value: String): Self = this.set("folderid", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_update(value: String): Self = this.set("last_update", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteurl(value: String): Self = this.set("remoteurl", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String | Boolean): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

