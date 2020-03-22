package typings.openfin.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestInfo extends js.Object {
  var manifestUrl: String
  var uuid: String
}

object ManifestInfo {
  @scala.inline
  def apply(manifestUrl: String, uuid: String): ManifestInfo = {
    val __obj = js.Dynamic.literal(manifestUrl = manifestUrl.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ManifestInfo]
  }
}

