package typings.nodelibFsWalk.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueItem extends js.Object {
  var base: js.UndefOr[String] = js.native
  var directory: String = js.native
}

object QueueItem {
  @scala.inline
  def apply(directory: String): QueueItem = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueItem]
  }
  @scala.inline
  implicit class QueueItemOps[Self <: QueueItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
  }
  
}

