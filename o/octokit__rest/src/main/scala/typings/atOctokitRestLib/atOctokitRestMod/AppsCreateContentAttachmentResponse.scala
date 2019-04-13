package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateContentAttachmentResponse extends js.Object {
  var body: java.lang.String
  var id: scala.Double
  var title: java.lang.String
}

object AppsCreateContentAttachmentResponse {
  @scala.inline
  def apply(body: java.lang.String, id: scala.Double, title: java.lang.String): AppsCreateContentAttachmentResponse = {
    val __obj = js.Dynamic.literal(body = body, id = id, title = title)
  
    __obj.asInstanceOf[AppsCreateContentAttachmentResponse]
  }
}

