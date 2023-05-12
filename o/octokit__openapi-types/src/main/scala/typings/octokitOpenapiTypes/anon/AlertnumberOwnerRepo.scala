package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertnumberOwnerRepo extends StObject {
  
  var alert_number: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-number'] */ js.Any
  
  var owner: String
  
  var repo: String
}
object AlertnumberOwnerRepo {
  
  inline def apply(
    alert_number: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-number'] */ js.Any,
    owner: String,
    repo: String
  ): AlertnumberOwnerRepo = {
    val __obj = js.Dynamic.literal(alert_number = alert_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertnumberOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlertnumberOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setAlert_number(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-number'] */ js.Any
    ): Self = StObject.set(x, "alert_number", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
