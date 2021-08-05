package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Createdat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsListOrgSecretsResponseData extends StObject {
  
  var secrets: js.Array[Createdat]
  
  var total_count: Double
}
object ActionsListOrgSecretsResponseData {
  
  inline def apply(secrets: js.Array[Createdat], total_count: Double): ActionsListOrgSecretsResponseData = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListOrgSecretsResponseData]
  }
  
  extension [Self <: ActionsListOrgSecretsResponseData](x: Self) {
    
    inline def setSecrets(value: js.Array[Createdat]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsVarargs(value: Createdat*): Self = StObject.set(x, "secrets", js.Array(value :_*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
