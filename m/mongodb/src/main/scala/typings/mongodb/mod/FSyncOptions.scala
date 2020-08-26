package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FSyncOptions extends CommonOptions {
  var fsync: js.UndefOr[Boolean] = js.native
}

object FSyncOptions {
  @scala.inline
  def apply(): FSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FSyncOptions]
  }
  @scala.inline
  implicit class FSyncOptionsOps[Self <: FSyncOptions] (val x: Self) extends AnyVal {
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
    def setFsync(value: Boolean): Self = this.set("fsync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFsync: Self = this.set("fsync", js.undefined)
  }
  
}

