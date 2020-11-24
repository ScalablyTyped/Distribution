package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Effectivedate extends js.Object {
  
  var effective_date: String = js.native
  
  var id: Double = js.native
  
  var plan: Accountsurl = js.native
  
  var unit_count: Double = js.native
}
object Effectivedate {
  
  @scala.inline
  def apply(effective_date: String, id: Double, plan: Accountsurl, unit_count: Double): Effectivedate = {
    val __obj = js.Dynamic.literal(effective_date = effective_date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], unit_count = unit_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effectivedate]
  }
  
  @scala.inline
  implicit class EffectivedateOps[Self <: Effectivedate] (val x: Self) extends AnyVal {
    
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
    def setEffective_date(value: String): Self = this.set("effective_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan(value: Accountsurl): Self = this.set("plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit_count(value: Double): Self = this.set("unit_count", value.asInstanceOf[js.Any])
  }
}
