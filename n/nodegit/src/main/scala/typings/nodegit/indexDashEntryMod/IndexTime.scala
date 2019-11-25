package typings.nodegit.indexDashEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexTime extends js.Object {
  var nanoseconds: Double
  var seconds: Double
}

object IndexTime {
  @scala.inline
  def apply(nanoseconds: Double, seconds: Double): IndexTime = {
    val __obj = js.Dynamic.literal(nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IndexTime]
  }
}

