package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SleepingFactory extends js.Object {
  def set(body: BodyType, isSleeping: Boolean): Unit = js.native
}

object SleepingFactory {
  @scala.inline
  def apply(set: (BodyType, Boolean) => Unit): SleepingFactory = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[SleepingFactory]
  }
  @scala.inline
  implicit class SleepingFactoryOps[Self <: SleepingFactory] (val x: Self) extends AnyVal {
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
    def setSet(value: (BodyType, Boolean) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

