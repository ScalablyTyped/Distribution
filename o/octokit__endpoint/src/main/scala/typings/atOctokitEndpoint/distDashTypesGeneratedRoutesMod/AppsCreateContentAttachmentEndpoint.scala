package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateContentAttachmentEndpoint extends js.Object {
  var body: String
  var content_reference_id: Double
  var title: String
}

object AppsCreateContentAttachmentEndpoint {
  @scala.inline
  def apply(body: String, content_reference_id: Double, title: String): AppsCreateContentAttachmentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, content_reference_id = content_reference_id, title = title)
  
    __obj.asInstanceOf[AppsCreateContentAttachmentEndpoint]
  }
}

