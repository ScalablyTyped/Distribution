package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsListRepoSecretsResponseData extends StObject {
  
  var secrets: js.Array[Name]
  
  var total_count: Double
}
object ActionsListRepoSecretsResponseData {
  
  inline def apply(secrets: js.Array[Name], total_count: Double): ActionsListRepoSecretsResponseData = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListRepoSecretsResponseData]
  }
  
  extension [Self <: ActionsListRepoSecretsResponseData](x: Self) {
    
    inline def setSecrets(value: js.Array[Name]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsVarargs(value: Name*): Self = StObject.set(x, "secrets", js.Array(value :_*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
