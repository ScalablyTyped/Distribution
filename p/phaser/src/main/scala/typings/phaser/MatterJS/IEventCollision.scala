package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventCollision[T] extends IEventTimestamped[T] {
  /**
    * The collision pair
    */
  var pairs: js.Array[IPair]
}

object IEventCollision {
  @scala.inline
  def apply[T](name: String, pairs: js.Array[IPair], source: T, timestamp: Double): IEventCollision[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventCollision[T]]
  }
}

