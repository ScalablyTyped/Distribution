package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Effectivedate extends StObject {
  
  var effective_date: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var is_installed: js.UndefOr[Boolean] = js.undefined
  
  var plan: js.UndefOr[Accountsurl] = js.undefined
  
  var unit_count: js.UndefOr[Double | Null] = js.undefined
}
object Effectivedate {
  
  inline def apply(): Effectivedate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Effectivedate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Effectivedate] (val x: Self) extends AnyVal {
    
    inline def setEffective_date(value: String): Self = StObject.set(x, "effective_date", value.asInstanceOf[js.Any])
    
    inline def setEffective_dateUndefined: Self = StObject.set(x, "effective_date", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIs_installed(value: Boolean): Self = StObject.set(x, "is_installed", value.asInstanceOf[js.Any])
    
    inline def setIs_installedUndefined: Self = StObject.set(x, "is_installed", js.undefined)
    
    inline def setPlan(value: Accountsurl): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setUnit_count(value: Double): Self = StObject.set(x, "unit_count", value.asInstanceOf[js.Any])
    
    inline def setUnit_countNull: Self = StObject.set(x, "unit_count", null)
    
    inline def setUnit_countUndefined: Self = StObject.set(x, "unit_count", js.undefined)
  }
}
