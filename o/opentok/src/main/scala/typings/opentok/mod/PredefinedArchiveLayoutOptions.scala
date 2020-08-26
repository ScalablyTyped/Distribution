package typings.opentok.mod

import typings.opentok.opentokStrings.bestFit
import typings.opentok.opentokStrings.horizontalPresentation
import typings.opentok.opentokStrings.pip
import typings.opentok.opentokStrings.verticalPresentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredefinedArchiveLayoutOptions extends ArchiveLayoutOptions {
  var `type`: bestFit | pip | verticalPresentation | horizontalPresentation = js.native
}

object PredefinedArchiveLayoutOptions {
  @scala.inline
  def apply(`type`: bestFit | pip | verticalPresentation | horizontalPresentation): PredefinedArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedArchiveLayoutOptions]
  }
  @scala.inline
  implicit class PredefinedArchiveLayoutOptionsOps[Self <: PredefinedArchiveLayoutOptions] (val x: Self) extends AnyVal {
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
    def setType(value: bestFit | pip | verticalPresentation | horizontalPresentation): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

