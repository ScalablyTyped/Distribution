package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveOptions extends js.Object {
  var hasAudio: js.UndefOr[Boolean] = js.native
  var hasVideo: js.UndefOr[Boolean] = js.native
  var layout: js.UndefOr[ArchiveLayoutOptions] = js.native
  var name: js.UndefOr[String] = js.native
  var outputMode: js.UndefOr[OutputMode] = js.native
  var resolution: js.UndefOr[String] = js.native
}

object ArchiveOptions {
  @scala.inline
  def apply(): ArchiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveOptions]
  }
  @scala.inline
  implicit class ArchiveOptionsOps[Self <: ArchiveOptions] (val x: Self) extends AnyVal {
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
    def setHasAudio(value: Boolean): Self = this.set("hasAudio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasAudio: Self = this.set("hasAudio", js.undefined)
    @scala.inline
    def setHasVideo(value: Boolean): Self = this.set("hasVideo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasVideo: Self = this.set("hasVideo", js.undefined)
    @scala.inline
    def setLayout(value: ArchiveLayoutOptions): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOutputMode(value: OutputMode): Self = this.set("outputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputMode: Self = this.set("outputMode", js.undefined)
    @scala.inline
    def setResolution(value: String): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
  }
  
}

