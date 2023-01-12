package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closedmilestones extends StObject {
  
  var closed_milestones: js.UndefOr[Double] = js.undefined
  
  var open_milestones: js.UndefOr[Double] = js.undefined
  
  var total_milestones: js.UndefOr[Double] = js.undefined
}
object Closedmilestones {
  
  inline def apply(): Closedmilestones = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Closedmilestones]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Closedmilestones] (val x: Self) extends AnyVal {
    
    inline def setClosed_milestones(value: Double): Self = StObject.set(x, "closed_milestones", value.asInstanceOf[js.Any])
    
    inline def setClosed_milestonesUndefined: Self = StObject.set(x, "closed_milestones", js.undefined)
    
    inline def setOpen_milestones(value: Double): Self = StObject.set(x, "open_milestones", value.asInstanceOf[js.Any])
    
    inline def setOpen_milestonesUndefined: Self = StObject.set(x, "open_milestones", js.undefined)
    
    inline def setTotal_milestones(value: Double): Self = StObject.set(x, "total_milestones", value.asInstanceOf[js.Any])
    
    inline def setTotal_milestonesUndefined: Self = StObject.set(x, "total_milestones", js.undefined)
  }
}
