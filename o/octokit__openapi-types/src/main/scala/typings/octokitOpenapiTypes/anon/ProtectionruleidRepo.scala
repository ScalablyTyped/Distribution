package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectionruleidRepo extends StObject {
  
  var environment_name: String
  
  var owner: String
  
  var protection_rule_id: Double
  
  var repo: String
}
object ProtectionruleidRepo {
  
  inline def apply(environment_name: String, owner: String, protection_rule_id: Double, repo: String): ProtectionruleidRepo = {
    val __obj = js.Dynamic.literal(environment_name = environment_name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], protection_rule_id = protection_rule_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionruleidRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectionruleidRepo] (val x: Self) extends AnyVal {
    
    inline def setEnvironment_name(value: String): Self = StObject.set(x, "environment_name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setProtection_rule_id(value: Double): Self = StObject.set(x, "protection_rule_id", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
