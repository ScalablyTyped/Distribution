package typings.plotlyDotJs.plotlyDotJsMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforePlotEvent extends js.Object {
  var config: Partial[Config]
  var data: js.Array[Data]
  var layout: Partial[Layout]
}

object BeforePlotEvent {
  @scala.inline
  def apply(config: Partial[Config], data: js.Array[Data], layout: Partial[Layout]): BeforePlotEvent = {
    val __obj = js.Dynamic.literal(config = config, data = data, layout = layout)
  
    __obj.asInstanceOf[BeforePlotEvent]
  }
}

