package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollisionStartEvent extends js.Object {
  /**
    * The name of the event.
    */
  var name: java.lang.String
  /**
    * A list of all affected pairs in the collision.
    */
  var pairs: js.Array[_]
  /**
    * The source object of the event.
    */
  var source: js.Any
  /**
    * The Matter Engine `timing.timestamp` value for the event.
    */
  var timestamp: scala.Double
}

object CollisionStartEvent {
  @scala.inline
  def apply(name: java.lang.String, pairs: js.Array[_], source: js.Any, timestamp: scala.Double): CollisionStartEvent = {
    val __obj = js.Dynamic.literal(name = name, pairs = pairs, source = source, timestamp = timestamp)
  
    __obj.asInstanceOf[CollisionStartEvent]
  }
}

