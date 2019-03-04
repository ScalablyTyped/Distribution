package typings
package phantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkRequest extends js.Object {
  def abort(): scala.Unit
  def changeUrl(url: java.lang.String): scala.Unit
  def setHeader(name: java.lang.String, value: java.lang.String): scala.Unit
}

object NetworkRequest {
  @scala.inline
  def apply(
    abort: js.Function0[scala.Unit],
    changeUrl: js.Function1[java.lang.String, scala.Unit],
    setHeader: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): NetworkRequest = {
    val __obj = js.Dynamic.literal(abort = abort, changeUrl = changeUrl, setHeader = setHeader)
  
    __obj.asInstanceOf[NetworkRequest]
  }
}

