package typings.nodeDashHueDashApi.nodeDashHueDashApiMod

import typings.nodeDashHueDashApi.Anon_Address
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISchedule extends js.Object {
  var command: Anon_Address
  var description: String
  var name: String
  var time: Date
}

object ISchedule {
  @scala.inline
  def apply(command: Anon_Address, description: String, name: String, time: Date): ISchedule = {
    val __obj = js.Dynamic.literal(command = command, description = description, name = name, time = time)
  
    __obj.asInstanceOf[ISchedule]
  }
}

