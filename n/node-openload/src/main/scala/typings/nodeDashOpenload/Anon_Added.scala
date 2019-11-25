package typings.nodeDashOpenload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Added extends js.Object {
  var added: String
  var bytes_loaded: String
  var bytes_total: String
  var extid: String | Boolean
  var folderid: String
  var id: Double
  var last_update: String
  var remoteurl: String
  var status: String
  var url: String | Boolean
}

object Anon_Added {
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
  ): Anon_Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], bytes_loaded = bytes_loaded.asInstanceOf[js.Any], bytes_total = bytes_total.asInstanceOf[js.Any], extid = extid.asInstanceOf[js.Any], folderid = folderid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_update = last_update.asInstanceOf[js.Any], remoteurl = remoteurl.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Added]
  }
}

