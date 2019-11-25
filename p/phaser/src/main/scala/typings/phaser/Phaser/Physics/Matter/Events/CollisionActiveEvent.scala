package typings.phaser.Phaser.Physics.Matter.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollisionActiveEvent extends js.Object {
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

object CollisionActiveEvent {
  @scala.inline
  def apply(name: String, pairs: js.Array[_], source: js.Any, timestamp: Double): CollisionActiveEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CollisionActiveEvent]
  }
}

