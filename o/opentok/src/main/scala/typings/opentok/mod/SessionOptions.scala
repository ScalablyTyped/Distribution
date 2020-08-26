package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionOptions extends js.Object {
  var archiveMode: js.UndefOr[ArchiveMode] = js.native
  var location: js.UndefOr[String] = js.native
  var mediaMode: js.UndefOr[MediaMode] = js.native
}

object SessionOptions {
  @scala.inline
  def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  @scala.inline
  implicit class SessionOptionsOps[Self <: SessionOptions] (val x: Self) extends AnyVal {
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
    def setArchiveMode(value: ArchiveMode): Self = this.set("archiveMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchiveMode: Self = this.set("archiveMode", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMediaMode(value: MediaMode): Self = this.set("mediaMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaMode: Self = this.set("mediaMode", js.undefined)
  }
  
}

