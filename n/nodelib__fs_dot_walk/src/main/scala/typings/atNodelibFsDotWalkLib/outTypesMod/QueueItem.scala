package typings
package atNodelibFsDotWalkLib.outTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueItem extends js.Object {
  var base: js.UndefOr[java.lang.String] = js.undefined
  var dir: java.lang.String
}

object QueueItem {
  @scala.inline
  def apply(dir: java.lang.String, base: java.lang.String = null): QueueItem = {
    val __obj = js.Dynamic.literal(dir = dir)
    if (base != null) __obj.updateDynamic("base")(base)
    __obj.asInstanceOf[QueueItem]
  }
}

