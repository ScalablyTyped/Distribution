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
    val __obj = js.Dynamic.literal(added = added, bytes_loaded = bytes_loaded, bytes_total = bytes_total, extid = extid.asInstanceOf[js.Any], folderid = folderid, id = id, last_update = last_update, remoteurl = remoteurl, status = status, url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Added]
  }
}

