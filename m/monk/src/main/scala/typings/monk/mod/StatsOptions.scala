package typings.monk.mod

import typings.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsOptions extends js.Object {
  var scale: Double = js.native
  var session: js.UndefOr[ClientSession] = js.native
}

object StatsOptions {
  @scala.inline
  def apply(scale: Double): StatsOptions = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsOptions]
  }
  @scala.inline
  implicit class StatsOptionsOps[Self <: StatsOptions] (val x: Self) extends AnyVal {
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
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
  }
  
}

