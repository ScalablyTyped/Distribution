package typings.phaser.Phaser.Physics.Matter.Events

import typings.phaser.Phaser.Types.Physics.Matter.MatterCollisionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollisionEndEvent extends js.Object {
  /**
    * The name of the event.
    */
  var name: String = js.native
  /**
    * A list of all affected pairs in the collision.
    */
  var pairs: js.Array[MatterCollisionData] = js.native
  /**
    * The source object of the event.
    */
  var source: js.Any = js.native
  /**
    * The Matter Engine `timing.timestamp` value for the event.
    */
  var timestamp: Double = js.native
}

object CollisionEndEvent {
  @scala.inline
  def apply(name: String, pairs: js.Array[MatterCollisionData], source: js.Any, timestamp: Double): CollisionEndEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionEndEvent]
  }
  @scala.inline
  implicit class CollisionEndEventOps[Self <: CollisionEndEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPairsVarargs(value: MatterCollisionData*): Self = this.set("pairs", js.Array(value :_*))
    @scala.inline
    def setPairs(value: js.Array[MatterCollisionData]): Self = this.set("pairs", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

