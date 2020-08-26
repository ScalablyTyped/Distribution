package typings.popcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopcornManifestOptions extends js.Object {
  var end: PopcornManifestOption = js.native
  var start: PopcornManifestOption = js.native
  var target: String = js.native
  var text: PopcornManifestOption = js.native
}

object PopcornManifestOptions {
  @scala.inline
  def apply(
    end: PopcornManifestOption,
    start: PopcornManifestOption,
    target: String,
    text: PopcornManifestOption
  ): PopcornManifestOptions = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopcornManifestOptions]
  }
  @scala.inline
  implicit class PopcornManifestOptionsOps[Self <: PopcornManifestOptions] (val x: Self) extends AnyVal {
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
    def setEnd(value: PopcornManifestOption): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: PopcornManifestOption): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: PopcornManifestOption): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

