package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SleepingFactory extends js.Object {
  def set(body: BodyType, isSleeping: Boolean): Unit
}

object SleepingFactory {
  @scala.inline
  def apply(set: (BodyType, Boolean) => Unit): SleepingFactory = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[SleepingFactory]
  }
}

