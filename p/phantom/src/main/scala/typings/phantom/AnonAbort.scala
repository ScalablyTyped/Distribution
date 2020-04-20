package typings.phantom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbort extends js.Object {
  def abort(): Unit
  def changeUrl(newUrl: String): Unit
  def setHeader(key: String, value: String): Unit
}

object AnonAbort {
  @scala.inline
  def apply(abort: () => Unit, changeUrl: String => Unit, setHeader: (String, String) => Unit): AnonAbort = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), changeUrl = js.Any.fromFunction1(changeUrl), setHeader = js.Any.fromFunction2(setHeader))
    __obj.asInstanceOf[AnonAbort]
  }
}

