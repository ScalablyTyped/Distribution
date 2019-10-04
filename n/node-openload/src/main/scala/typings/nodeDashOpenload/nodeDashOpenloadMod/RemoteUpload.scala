package typings.nodeDashOpenload.nodeDashOpenloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteUpload extends js.Object {
  var folderid: String
  var id: String
}

object RemoteUpload {
  @scala.inline
  def apply(folderid: String, id: String): RemoteUpload = {
    val __obj = js.Dynamic.literal(folderid = folderid, id = id)
  
    __obj.asInstanceOf[RemoteUpload]
  }
}

