package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseInputs extends StObject {
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var inputs: StringDictionary[Any] | Null
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var ref: String
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
  
  var workflow: String
}
object EnterpriseInputs {
  
  inline def apply(ref: String, repository: Allowupdatebranch, sender: Avatarurl, workflow: String): EnterpriseInputs = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], workflow = workflow.asInstanceOf[js.Any], inputs = null)
    __obj.asInstanceOf[EnterpriseInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnterpriseInputs] (val x: Self) extends AnyVal {
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInputs(value: StringDictionary[Any]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsNull: Self = StObject.set(x, "inputs", null)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setWorkflow(value: String): Self = StObject.set(x, "workflow", value.asInstanceOf[js.Any])
  }
}
