package typings.overwatchApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Competitive extends js.Object {
  var competitive: Draw = js.native
  var quickplay: Played = js.native
}

object Competitive {
  @scala.inline
  def apply(competitive: Draw, quickplay: Played): Competitive = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Competitive]
  }
  @scala.inline
  implicit class CompetitiveOps[Self <: Competitive] (val x: Self) extends AnyVal {
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
    def setCompetitive(value: Draw): Self = this.set("competitive", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuickplay(value: Played): Self = this.set("quickplay", value.asInstanceOf[js.Any])
  }
  
}

