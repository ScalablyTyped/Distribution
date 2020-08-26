package typings.overwatchApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quickplay extends js.Object {
  var competitive: String = js.native
  var quickplay: String = js.native
}

object Quickplay {
  @scala.inline
  def apply(competitive: String, quickplay: String): Quickplay = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quickplay]
  }
  @scala.inline
  implicit class QuickplayOps[Self <: Quickplay] (val x: Self) extends AnyVal {
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
    def setCompetitive(value: String): Self = this.set("competitive", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuickplay(value: String): Self = this.set("quickplay", value.asInstanceOf[js.Any])
  }
  
}

