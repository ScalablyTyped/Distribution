package typings
package memoryDashPagerLib.memoryDashPagerMod.PagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  var buffer: nodeLib.Buffer
  var offset: scala.Double
}

object Page {
  @scala.inline
  def apply(buffer: nodeLib.Buffer, offset: scala.Double): Page = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buffer")(buffer)
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[Page]
  }
}

