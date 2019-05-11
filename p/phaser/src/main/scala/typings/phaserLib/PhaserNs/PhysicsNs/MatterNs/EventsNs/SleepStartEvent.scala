package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SleepStartEvent extends js.Object {
  /**
    * The name of the event.
    */
  var name: java.lang.String
  /**
    * The source object of the event.
    */
  var source: js.Any
}

object SleepStartEvent {
  @scala.inline
  def apply(name: java.lang.String, source: js.Any): SleepStartEvent = {
    val __obj = js.Dynamic.literal(name = name, source = source)
  
    __obj.asInstanceOf[SleepStartEvent]
  }
}

