package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvestigationSecurityState extends StObject {
  
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  var status: js.UndefOr[NullableOption[String]] = js.undefined
}
object InvestigationSecurityState {
  
  inline def apply(): InvestigationSecurityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvestigationSecurityState]
  }
  
  extension [Self <: InvestigationSecurityState](x: Self) {
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: NullableOption[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
