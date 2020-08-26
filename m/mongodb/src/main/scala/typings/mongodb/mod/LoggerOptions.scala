package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerOptions extends js.Object {
  /**
    * Override default global log level.
    */
  var logger: js.UndefOr[log] = js.native
  /**
    * Custom logger function
    */
  var loggerLevel: js.UndefOr[String] = js.native
}

object LoggerOptions {
  @scala.inline
  def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  @scala.inline
  implicit class LoggerOptionsOps[Self <: LoggerOptions] (val x: Self) extends AnyVal {
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
    def setLogger(value: (/* message */ js.UndefOr[String], /* state */ js.UndefOr[LoggerState]) => Unit): Self = this.set("logger", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setLoggerLevel(value: String): Self = this.set("loggerLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggerLevel: Self = this.set("loggerLevel", js.undefined)
  }
  
}

