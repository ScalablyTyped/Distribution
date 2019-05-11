package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterUpdateEvent extends js.Object {
  /**
    * The name of the event.
    */
  var name: java.lang.String
  /**
    * The source object of the event.
    */
  var source: js.Any
  /**
    * The Matter Engine `timing.timestamp` value for the event.
    */
  var timestamp: scala.Double
}

object AfterUpdateEvent {
  @scala.inline
  def apply(name: java.lang.String, source: js.Any, timestamp: scala.Double): AfterUpdateEvent = {
    val __obj = js.Dynamic.literal(name = name, source = source, timestamp = timestamp)
  
    __obj.asInstanceOf[AfterUpdateEvent]
  }
}

