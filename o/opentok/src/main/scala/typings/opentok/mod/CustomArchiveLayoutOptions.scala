package typings.opentok.mod

import typings.opentok.opentokStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomArchiveLayoutOptions extends ArchiveLayoutOptions {
  var stylesheet: String = js.native
  var `type`: custom = js.native
}

object CustomArchiveLayoutOptions {
  @scala.inline
  def apply(stylesheet: String, `type`: custom): CustomArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal(stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomArchiveLayoutOptions]
  }
  @scala.inline
  implicit class CustomArchiveLayoutOptionsOps[Self <: CustomArchiveLayoutOptions] (val x: Self) extends AnyVal {
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
    def setStylesheet(value: String): Self = this.set("stylesheet", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: custom): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

