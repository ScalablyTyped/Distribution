package typings
package nodeDashHueDashApiLib.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISchedule extends js.Object {
  var command: nodeDashHueDashApiLib.Anon_Address
  var description: java.lang.String
  var name: java.lang.String
  var time: stdLib.Date
}

object ISchedule {
  @scala.inline
  def apply(
    command: nodeDashHueDashApiLib.Anon_Address,
    description: java.lang.String,
    name: java.lang.String,
    time: stdLib.Date
  ): ISchedule = {
    val __obj = js.Dynamic.literal(command = command, description = description, name = name, time = time)
  
    __obj.asInstanceOf[ISchedule]
  }
}

