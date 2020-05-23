package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateContentAttachmentResponseData extends js.Object {
  var body: String
  var id: Double
  var title: String
}

object AppsCreateContentAttachmentResponseData {
  @scala.inline
  def apply(body: String, id: Double, title: String): AppsCreateContentAttachmentResponseData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateContentAttachmentResponseData]
  }
}

