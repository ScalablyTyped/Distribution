package typings.overwatchApi.anon

import typings.overwatchApi.mod.Endorsement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  var frame: String = js.native
  var icon: String = js.native
  var level: Double = js.native
  var shotcaller: Endorsement = js.native
  var sportsmanship: Endorsement = js.native
  var teammate: Endorsement = js.native
}

object Frame {
  @scala.inline
  def apply(
    frame: String,
    icon: String,
    level: Double,
    shotcaller: Endorsement,
    sportsmanship: Endorsement,
    teammate: Endorsement
  ): Frame = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], shotcaller = shotcaller.asInstanceOf[js.Any], sportsmanship = sportsmanship.asInstanceOf[js.Any], teammate = teammate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
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
    def setFrame(value: String): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setShotcaller(value: Endorsement): Self = this.set("shotcaller", value.asInstanceOf[js.Any])
    @scala.inline
    def setSportsmanship(value: Endorsement): Self = this.set("sportsmanship", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeammate(value: Endorsement): Self = this.set("teammate", value.asInstanceOf[js.Any])
  }
  
}

