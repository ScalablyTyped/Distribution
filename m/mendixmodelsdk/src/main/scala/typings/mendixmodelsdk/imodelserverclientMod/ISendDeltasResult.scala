package typings.mendixmodelsdk.imodelserverclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISendDeltasResult extends js.Object {
  var eventId: Double
  var firstError: js.Any
}

object ISendDeltasResult {
  @scala.inline
  def apply(eventId: Double, firstError: js.Any): ISendDeltasResult = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], firstError = firstError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISendDeltasResult]
  }
}

