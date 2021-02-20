package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Teamwork extends Entity {
  
  var workforceIntegrations: js.UndefOr[NullableOption[js.Array[WorkforceIntegration]]] = js.native
}
object Teamwork {
  
  @scala.inline
  def apply(): Teamwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Teamwork]
  }
  
  @scala.inline
  implicit class TeamworkMutableBuilder[Self <: Teamwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkforceIntegrations(value: NullableOption[js.Array[WorkforceIntegration]]): Self = StObject.set(x, "workforceIntegrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkforceIntegrationsNull: Self = StObject.set(x, "workforceIntegrations", null)
    
    @scala.inline
    def setWorkforceIntegrationsUndefined: Self = StObject.set(x, "workforceIntegrations", js.undefined)
    
    @scala.inline
    def setWorkforceIntegrationsVarargs(value: WorkforceIntegration*): Self = StObject.set(x, "workforceIntegrations", js.Array(value :_*))
  }
}
