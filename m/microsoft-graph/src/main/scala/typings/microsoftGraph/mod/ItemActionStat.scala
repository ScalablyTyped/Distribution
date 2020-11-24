package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemActionStat extends js.Object {
  
  // The number of times the action took place. Read-only.
  var actionCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // The number of distinct actors that performed the action. Read-only.
  var actorCount: js.UndefOr[NullableOption[Double]] = js.native
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
    def setActionCount(value: NullableOption[Double]): Self = this.set("actionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionCount: Self = this.set("actionCount", js.undefined)
    
    @scala.inline
    def setActionCountNull: Self = this.set("actionCount", null)
    
    @scala.inline
    def setActorCount(value: NullableOption[Double]): Self = this.set("actorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActorCount: Self = this.set("actorCount", js.undefined)
    
    @scala.inline
    def setActorCountNull: Self = this.set("actorCount", null)
  }
}
