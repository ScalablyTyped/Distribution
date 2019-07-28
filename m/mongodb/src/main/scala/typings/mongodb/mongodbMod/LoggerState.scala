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
    val __obj = js.Dynamic.literal(className = className, date = date, message = message, pid = pid)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LoggerState]
  }
}

