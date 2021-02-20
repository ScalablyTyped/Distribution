package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Effectivedate extends StObject {
  
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
  implicit class EffectivedateMutableBuilder[Self <: Effectivedate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffective_date(value: String): Self = StObject.set(x, "effective_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan(value: Accountsurl): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit_count(value: Double): Self = StObject.set(x, "unit_count", value.asInstanceOf[js.Any])
  }
}
