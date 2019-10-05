package typings.phaser.Phaser.Physics.Matter.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SleepEndEvent extends js.Object {
  /**
    * The name of the event.
    */
  var name: String
  /**
    * The source object of the event.
    */
  var source: js.Any
}

object SleepEndEvent {
  @scala.inline
  def apply(name: String, source: js.Any): SleepEndEvent = {
    val __obj = js.Dynamic.literal(name = name, source = source)
  
    __obj.asInstanceOf[SleepEndEvent]
  }
}

