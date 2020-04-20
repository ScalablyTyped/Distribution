package typings.next.apiUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiPreviewProps extends js.Object {
  var previewModeEncryptionKey: String
  var previewModeId: String
  var previewModeSigningKey: String
}

object ApiPreviewProps {
  @scala.inline
  def apply(previewModeEncryptionKey: String, previewModeId: String, previewModeSigningKey: String): ApiPreviewProps = {
    val __obj = js.Dynamic.literal(previewModeEncryptionKey = previewModeEncryptionKey.asInstanceOf[js.Any], previewModeId = previewModeId.asInstanceOf[js.Any], previewModeSigningKey = previewModeSigningKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiPreviewProps]
  }
}

