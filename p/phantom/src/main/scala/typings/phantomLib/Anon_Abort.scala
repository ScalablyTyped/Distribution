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
    abort: js.Function0[scala.Unit],
    changeUrl: js.Function1[java.lang.String, scala.Unit],
    setHeader: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): Anon_Abort = {
    val __obj = js.Dynamic.literal(abort = abort, changeUrl = changeUrl, setHeader = setHeader)
  
    __obj.asInstanceOf[Anon_Abort]
  }
}

