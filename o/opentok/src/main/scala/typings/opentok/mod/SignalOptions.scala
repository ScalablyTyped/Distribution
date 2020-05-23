package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalOptions extends js.Object {
  var data: js.Any
  var `type`: String
}

object SignalOptions {
  @scala.inline
  def apply(data: js.Any, `type`: String): SignalOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalOptions]
  }
}

