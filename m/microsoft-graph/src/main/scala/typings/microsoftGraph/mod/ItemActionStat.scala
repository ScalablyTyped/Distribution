package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemActionStat extends js.Object {
  // The number of times the action took place. Read-only.
  var actionCount: js.UndefOr[Double] = js.native
  // The number of distinct actors that performed the action. Read-only.
  var actorCount: js.UndefOr[Double] = js.native
}

object ItemActionStat {
  @scala.inline
  def apply(): ItemActionStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemActionStat]
  }
  @scala.inline
  implicit class ItemActionStatOps[Self <: ItemActionStat] (val x: Self) extends AnyVal {
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
    def setActionCount(value: Double): Self = this.set("actionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionCount: Self = this.set("actionCount", js.undefined)
    @scala.inline
    def setActorCount(value: Double): Self = this.set("actorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActorCount: Self = this.set("actorCount", js.undefined)
  }
  
}

