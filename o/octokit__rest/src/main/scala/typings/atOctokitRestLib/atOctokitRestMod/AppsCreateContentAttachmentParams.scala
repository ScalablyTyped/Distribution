package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateContentAttachmentParams extends js.Object {
  /**
    * The body text of the content attachment displayed in the body or comment of an issue or pull request. This parameter supports markdown.
    */
  var body: java.lang.String
  var content_reference_id: scala.Double
  /**
    * The title of the content attachment displayed in the body or comment of an issue or pull request.
    */
  var title: java.lang.String
}

object AppsCreateContentAttachmentParams {
  @scala.inline
  def apply(body: java.lang.String, content_reference_id: scala.Double, title: java.lang.String): AppsCreateContentAttachmentParams = {
    val __obj = js.Dynamic.literal(body = body, content_reference_id = content_reference_id, title = title)
  
    __obj.asInstanceOf[AppsCreateContentAttachmentParams]
  }
}

