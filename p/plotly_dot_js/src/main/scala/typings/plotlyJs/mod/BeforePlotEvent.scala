package typings.plotlyJs.mod

import typings.plotlyJs.PartialConfig
import typings.plotlyJs.PartialLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforePlotEvent extends js.Object {
  var config: PartialConfig
  var data: js.Array[Data]
  var layout: PartialLayout
}

object BeforePlotEvent {
  @scala.inline
  def apply(config: PartialConfig, data: js.Array[Data], layout: PartialLayout): BeforePlotEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforePlotEvent]
  }
}

