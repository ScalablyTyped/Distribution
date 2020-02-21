package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCardidColumnid extends js.Object {
  var card_id: AnonRequired
  var column_id: AnonType
  var position: AnonRequiredType
}

object AnonCardidColumnid {
  @scala.inline
  def apply(card_id: AnonRequired, column_id: AnonType, position: AnonRequiredType): AnonCardidColumnid = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any], column_id = column_id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCardidColumnid]
  }
}

