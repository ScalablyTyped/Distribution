package typings.nextgenEvents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var args: js.Any = js.native
  var emitter: NextGenEvents = js.native
  var interrupt: Null = js.native
  var mice: Double = js.native
  var name: String = js.native
  var sync: Boolean = js.native
  def callback(interrupt: js.Any): js.Any = js.native
}

object Event {
  @scala.inline
  def apply(
    args: js.Any,
    callback: js.Any => js.Any,
    emitter: NextGenEvents,
    interrupt: Null,
    mice: Double,
    name: String,
    sync: Boolean
  ): Event = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], callback = js.Any.fromFunction1(callback), emitter = emitter.asInstanceOf[js.Any], interrupt = interrupt.asInstanceOf[js.Any], mice = mice.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setArgs(value: js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: js.Any => js.Any): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def setEmitter(value: NextGenEvents): Self = this.set("emitter", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterrupt(value: Null): Self = this.set("interrupt", value.asInstanceOf[js.Any])
    @scala.inline
    def setMice(value: Double): Self = this.set("mice", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
  }
  
}

