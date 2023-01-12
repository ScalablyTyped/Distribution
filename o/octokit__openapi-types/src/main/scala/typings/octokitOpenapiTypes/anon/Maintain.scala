package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maintain extends StObject {
  
  var admin: js.UndefOr[Boolean] = js.undefined
  
  var maintain: js.UndefOr[Boolean] = js.undefined
  
  var pull: js.UndefOr[Boolean] = js.undefined
  
  var push: js.UndefOr[Boolean] = js.undefined
  
  var triage: js.UndefOr[Boolean] = js.undefined
}
object Maintain {
  
  inline def apply(): Maintain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Maintain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Maintain] (val x: Self) extends AnyVal {
    
    inline def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
    
    inline def setMaintain(value: Boolean): Self = StObject.set(x, "maintain", value.asInstanceOf[js.Any])
    
    inline def setMaintainUndefined: Self = StObject.set(x, "maintain", js.undefined)
    
    inline def setPull(value: Boolean): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
    
    inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    inline def setTriage(value: Boolean): Self = StObject.set(x, "triage", value.asInstanceOf[js.Any])
    
    inline def setTriageUndefined: Self = StObject.set(x, "triage", js.undefined)
  }
}
