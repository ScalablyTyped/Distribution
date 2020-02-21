package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: AnonRequired
  var content_reference_id: AnonRequired
  var title: AnonRequired
}

object AnonBody {
  @scala.inline
  def apply(body: AnonRequired, content_reference_id: AnonRequired, title: AnonRequired): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], content_reference_id = content_reference_id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBody]
  }
}

