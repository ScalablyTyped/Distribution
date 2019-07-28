package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateContentAttachmentResponse extends js.Object {
  var body: String
  var id: Double
  var title: String
}

object AppsCreateContentAttachmentResponse {
  @scala.inline
  def apply(body: String, id: Double, title: String): AppsCreateContentAttachmentResponse = {
    val __obj = js.Dynamic.literal(body = body, id = id, title = title)
  
    __obj.asInstanceOf[AppsCreateContentAttachmentResponse]
  }
}

