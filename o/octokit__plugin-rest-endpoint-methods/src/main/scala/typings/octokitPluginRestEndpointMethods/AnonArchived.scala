package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArchived extends js.Object {
  var archived: AnonType
  var card_id: AnonRequired
  var note: AnonType
}

object AnonArchived {
  @scala.inline
  def apply(archived: AnonType, card_id: AnonRequired, note: AnonType): AnonArchived = {
    val __obj = js.Dynamic.literal(archived = archived.asInstanceOf[js.Any], card_id = card_id.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArchived]
  }
}

