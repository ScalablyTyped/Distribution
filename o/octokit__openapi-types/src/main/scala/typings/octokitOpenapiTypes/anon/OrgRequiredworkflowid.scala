package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgRequiredworkflowid extends StObject {
  
  @JSName("org")
  var org_ : String
  
  var required_workflow_id: Double
}
object OrgRequiredworkflowid {
  
  inline def apply(org_ : String, required_workflow_id: Double): OrgRequiredworkflowid = {
    val __obj = js.Dynamic.literal(required_workflow_id = required_workflow_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgRequiredworkflowid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrgRequiredworkflowid] (val x: Self) extends AnyVal {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setRequired_workflow_id(value: Double): Self = StObject.set(x, "required_workflow_id", value.asInstanceOf[js.Any])
  }
}
