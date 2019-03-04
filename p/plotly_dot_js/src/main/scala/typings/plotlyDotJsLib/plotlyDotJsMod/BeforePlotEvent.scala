package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforePlotEvent extends js.Object {
  var config: stdLib.Partial[Config]
  var data: js.Array[Data]
  var layout: stdLib.Partial[Layout]
}

object BeforePlotEvent {
  @scala.inline
  def apply(config: stdLib.Partial[Config], data: js.Array[Data], layout: stdLib.Partial[Layout]): BeforePlotEvent = {
    val __obj = js.Dynamic.literal(config = config, data = data, layout = layout)
  
    __obj.asInstanceOf[BeforePlotEvent]
  }
}

