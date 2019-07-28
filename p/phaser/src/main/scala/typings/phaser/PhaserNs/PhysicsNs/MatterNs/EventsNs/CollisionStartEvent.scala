package typings.phaser.PhaserNs.PhysicsNs.MatterNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollisionStartEvent extends js.Object {
  /**
    * The name of the event.
    */
  var name: String
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
  var timestamp: Double
}

object CollisionStartEvent {
  @scala.inline
  def apply(name: String, pairs: js.Array[_], source: js.Any, timestamp: Double): CollisionStartEvent = {
    val __obj = js.Dynamic.literal(name = name, pairs = pairs, source = source, timestamp = timestamp)
  
    __obj.asInstanceOf[CollisionStartEvent]
  }
}

