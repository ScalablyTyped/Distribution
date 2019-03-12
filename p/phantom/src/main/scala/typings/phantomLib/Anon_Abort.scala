package typings
package phantomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abort extends js.Object {
  def abort(): scala.Unit
  def changeUrl(newUrl: java.lang.String): scala.Unit
  def setHeader(key: java.lang.String, value: java.lang.String): scala.Unit
}

object Anon_Abort {
  @scala.inline
  def apply(
    abort: () => scala.Unit,
    changeUrl: java.lang.String => scala.Unit,
    setHeader: (java.lang.String, java.lang.String) => scala.Unit
  ): Anon_Abort = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), changeUrl = js.Any.fromFunction1(changeUrl), setHeader = js.Any.fromFunction2(setHeader))
  
    __obj.asInstanceOf[Anon_Abort]
  }
}

