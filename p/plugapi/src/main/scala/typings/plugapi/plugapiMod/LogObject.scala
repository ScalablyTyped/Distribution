package typings.plugapi.plugapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogObject extends js.Object {
  def log(): Unit
}

object LogObject {
  @scala.inline
  def apply(log: () => Unit): LogObject = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction0(log))
  
    __obj.asInstanceOf[LogObject]
  }
}

