package typings.popcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopcornManifest extends js.Object {
  var about: PopcornManifestAbout = js.native
  var options: PopcornManifestOptions = js.native
}

object PopcornManifest {
  @scala.inline
  def apply(about: PopcornManifestAbout, options: PopcornManifestOptions): PopcornManifest = {
    val __obj = js.Dynamic.literal(about = about.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopcornManifest]
  }
  @scala.inline
  implicit class PopcornManifestOps[Self <: PopcornManifest] (val x: Self) extends AnyVal {
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
    def setAbout(value: PopcornManifestAbout): Self = this.set("about", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: PopcornManifestOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

