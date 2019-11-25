package typings.atNodelibFsDotWalk.outTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueItem extends js.Object {
  var base: js.UndefOr[String] = js.undefined
  var dir: String
}

object QueueItem {
  @scala.inline
  def apply(dir: String, base: String = null): QueueItem = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueItem]
  }
}

