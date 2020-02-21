package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnid extends js.Object {
  var column_id: AnonRequired
  var content_id: AnonType
  var content_type: AnonType
  var note: AnonType
}

object AnonColumnid {
  @scala.inline
  def apply(column_id: AnonRequired, content_id: AnonType, content_type: AnonType, note: AnonType): AnonColumnid = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], content_id = content_id.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnid]
  }
}

