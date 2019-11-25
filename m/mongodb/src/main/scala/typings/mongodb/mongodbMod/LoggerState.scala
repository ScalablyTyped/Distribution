package typings.mongodb.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerState extends js.Object {
  var className: String
  var date: scala.Double
  var message: String
  var pid: scala.Double
  var `type`: String
}

object LoggerState {
  @scala.inline
  def apply(className: String, date: scala.Double, message: String, pid: scala.Double, `type`: String): LoggerState = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerState]
  }
}

