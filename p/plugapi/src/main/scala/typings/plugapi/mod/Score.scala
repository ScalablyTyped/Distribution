package typings.plugapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Score extends js.Object {
  var grabs: Double = js.native
  var listeners: Double = js.native
  var negative: Double = js.native
  var positive: Double = js.native
  var skipped: Double = js.native
}

object Score {
  @scala.inline
  def apply(grabs: Double, listeners: Double, negative: Double, positive: Double, skipped: Double): Score = {
    val __obj = js.Dynamic.literal(grabs = grabs.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any])
    __obj.asInstanceOf[Score]
  }
  @scala.inline
  implicit class ScoreOps[Self <: Score] (val x: Self) extends AnyVal {
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
    def setGrabs(value: Double): Self = this.set("grabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setListeners(value: Double): Self = this.set("listeners", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegative(value: Double): Self = this.set("negative", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositive(value: Double): Self = this.set("positive", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipped(value: Double): Self = this.set("skipped", value.asInstanceOf[js.Any])
  }
  
}

