package typings
package nodegitLib.indexDashEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexTime extends js.Object {
  var nanoseconds: scala.Double
  var seconds: scala.Double
}

object IndexTime {
  @scala.inline
  def apply(nanoseconds: scala.Double, seconds: scala.Double): IndexTime = {
    val __obj = js.Dynamic.literal(nanoseconds = nanoseconds, seconds = seconds)
  
    __obj.asInstanceOf[IndexTime]
  }
}

