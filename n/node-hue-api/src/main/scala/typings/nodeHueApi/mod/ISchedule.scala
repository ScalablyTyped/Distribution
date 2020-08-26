package typings.nodeHueApi.mod

import typings.nodeHueApi.anon.Address
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISchedule extends js.Object {
  var command: Address = js.native
  var description: String = js.native
  var name: String = js.native
  var time: Date = js.native
}

object ISchedule {
  @scala.inline
  def apply(command: Address, description: String, name: String, time: Date): ISchedule = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISchedule]
  }
  @scala.inline
  implicit class IScheduleOps[Self <: ISchedule] (val x: Self) extends AnyVal {
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
    def setCommand(value: Address): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Date): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

