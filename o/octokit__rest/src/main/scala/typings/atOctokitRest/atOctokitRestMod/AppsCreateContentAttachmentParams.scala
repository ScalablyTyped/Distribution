package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateContentAttachmentParams extends js.Object {
  /**
    * The body text of the content attachment displayed in the body or comment of an issue or pull request. This parameter supports markdown.
    */
  var body: String
  var content_reference_id: Double
  /**
    * The title of the content attachment displayed in the body or comment of an issue or pull request.
    */
  var title: String
}

object AppsCreateContentAttachmentParams {
  @scala.inline
  def apply(body: String, content_reference_id: Double, title: String): AppsCreateContentAttachmentParams = {
    val __obj = js.Dynamic.literal(body = body, content_reference_id = content_reference_id, title = title)
  
    __obj.asInstanceOf[AppsCreateContentAttachmentParams]
  }
}

