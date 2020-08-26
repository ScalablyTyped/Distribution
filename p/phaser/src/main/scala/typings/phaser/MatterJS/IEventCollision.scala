package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventCollision[T] extends IEventTimestamped[T] {
  /**
    * The collision pair
    */
  var pairs: js.Array[IPair] = js.native
}

object IEventCollision {
  @scala.inline
  def apply[T](name: String, pairs: js.Array[IPair], source: T, timestamp: Double): IEventCollision[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventCollision[T]]
  }
  @scala.inline
  implicit class IEventCollisionOps[Self <: IEventCollision[_], T] (val x: Self with IEventCollision[T]) extends AnyVal {
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
    def setPairsVarargs(value: IPair*): Self = this.set("pairs", js.Array(value :_*))
    @scala.inline
    def setPairs(value: js.Array[IPair]): Self = this.set("pairs", value.asInstanceOf[js.Any])
  }
  
}

