package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Teamwork
  extends StObject
     with Entity {
  
  var workforceIntegrations: js.UndefOr[NullableOption[js.Array[WorkforceIntegration]]] = js.undefined
}
object Teamwork {
  
  inline def apply(): Teamwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Teamwork]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Teamwork] (val x: Self) extends AnyVal {
    
    inline def setWorkforceIntegrations(value: NullableOption[js.Array[WorkforceIntegration]]): Self = StObject.set(x, "workforceIntegrations", value.asInstanceOf[js.Any])
    
    inline def setWorkforceIntegrationsNull: Self = StObject.set(x, "workforceIntegrations", null)
    
    inline def setWorkforceIntegrationsUndefined: Self = StObject.set(x, "workforceIntegrations", js.undefined)
    
    inline def setWorkforceIntegrationsVarargs(value: WorkforceIntegration*): Self = StObject.set(x, "workforceIntegrations", js.Array(value*))
  }
}
