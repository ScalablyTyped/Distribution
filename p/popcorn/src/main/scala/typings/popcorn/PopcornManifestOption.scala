package typings.popcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopcornManifestOption extends js.Object {
  var elem: String = js.native
  var label: String = js.native
  var `type`: String = js.native
}

object PopcornManifestOption {
  @scala.inline
  def apply(elem: String, label: String, `type`: String): PopcornManifestOption = {
    val __obj = js.Dynamic.literal(elem = elem.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopcornManifestOption]
  }
  @scala.inline
  implicit class PopcornManifestOptionOps[Self <: PopcornManifestOption] (val x: Self) extends AnyVal {
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
    def setElem(value: String): Self = this.set("elem", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

