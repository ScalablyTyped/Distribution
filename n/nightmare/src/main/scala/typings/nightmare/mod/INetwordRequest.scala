package typings.nightmare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetwordRequest extends js.Object {
  def abort(): Unit
  def changeUrl(url: String): Unit
  def setHeader(key: String, value: String): Unit
}

object INetwordRequest {
  @scala.inline
  def apply(abort: () => Unit, changeUrl: String => Unit, setHeader: (String, String) => Unit): INetwordRequest = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), changeUrl = js.Any.fromFunction1(changeUrl), setHeader = js.Any.fromFunction2(setHeader))
    __obj.asInstanceOf[INetwordRequest]
  }
}

