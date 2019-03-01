package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerState extends js.Object {
  var className: java.lang.String
  var date: scala.Double
  var message: java.lang.String
  var pid: scala.Double
  var `type`: java.lang.String
}

object LoggerState {
  @scala.inline
  def apply(
    className: java.lang.String,
    date: scala.Double,
    message: java.lang.String,
    pid: scala.Double,
    `type`: java.lang.String
  ): LoggerState = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("pid")(pid)
    __obj.asInstanceOf[LoggerState]
  }
}

