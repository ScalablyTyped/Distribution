package typings
package nightmareLib.nightmareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetwordRequest extends js.Object {
  def abort(): scala.Unit
  def changeUrl(url: java.lang.String): scala.Unit
  def setHeader(key: java.lang.String, value: java.lang.String): scala.Unit
}

object INetwordRequest {
  @scala.inline
  def apply(
    abort: () => scala.Unit,
    changeUrl: java.lang.String => scala.Unit,
    setHeader: (java.lang.String, java.lang.String) => scala.Unit
  ): INetwordRequest = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), changeUrl = js.Any.fromFunction1(changeUrl), setHeader = js.Any.fromFunction2(setHeader))
  
    __obj.asInstanceOf[INetwordRequest]
  }
}

