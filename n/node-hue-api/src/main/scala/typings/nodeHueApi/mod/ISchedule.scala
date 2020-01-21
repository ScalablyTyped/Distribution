package typings.nodeHueApi.mod

import typings.nodeHueApi.AnonAddress
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISchedule extends js.Object {
  var command: AnonAddress
  var description: String
  var name: String
  var time: Date
}

object ISchedule {
  @scala.inline
  def apply(command: AnonAddress, description: String, name: String, time: Date): ISchedule = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISchedule]
  }
}

