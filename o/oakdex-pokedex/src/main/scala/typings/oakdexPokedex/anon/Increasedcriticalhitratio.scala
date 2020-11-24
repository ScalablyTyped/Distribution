package typings.oakdexPokedex.anon

import typings.oakdexPokedex.mod.MoveStatusCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Increasedcriticalhitratio extends js.Object {
  
  var increased_critical_hit_ratio: js.UndefOr[Boolean] = js.native
  
  var status_conditions: js.UndefOr[js.Array[MoveStatusCondition]] = js.native
}
object Increasedcriticalhitratio {
  
  @scala.inline
  def apply(): Increasedcriticalhitratio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Increasedcriticalhitratio]
  }
  
  @scala.inline
  implicit class IncreasedcriticalhitratioOps[Self <: Increasedcriticalhitratio] (val x: Self) extends AnyVal {
    
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
    def setIncreased_critical_hit_ratio(value: Boolean): Self = this.set("increased_critical_hit_ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncreased_critical_hit_ratio: Self = this.set("increased_critical_hit_ratio", js.undefined)
    
    @scala.inline
    def setStatus_conditionsVarargs(value: MoveStatusCondition*): Self = this.set("status_conditions", js.Array(value :_*))
    
    @scala.inline
    def setStatus_conditions(value: js.Array[MoveStatusCondition]): Self = this.set("status_conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus_conditions: Self = this.set("status_conditions", js.undefined)
  }
}
