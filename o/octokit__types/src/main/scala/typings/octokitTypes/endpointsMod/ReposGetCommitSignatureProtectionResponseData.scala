package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitSignatureProtectionResponseData extends js.Object {
  var enabled: Boolean
  var url: String
}

object ReposGetCommitSignatureProtectionResponseData {
  @scala.inline
  def apply(enabled: Boolean, url: String): ReposGetCommitSignatureProtectionResponseData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCommitSignatureProtectionResponseData]
  }
}

