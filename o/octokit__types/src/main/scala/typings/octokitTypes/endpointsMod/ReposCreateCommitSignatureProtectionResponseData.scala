package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateCommitSignatureProtectionResponseData extends js.Object {
  var enabled: Boolean
  var url: String
}

object ReposCreateCommitSignatureProtectionResponseData {
  @scala.inline
  def apply(enabled: Boolean, url: String): ReposCreateCommitSignatureProtectionResponseData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateCommitSignatureProtectionResponseData]
  }
}

