package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsListRepoSecretsResponseData extends StObject {
  
  var secrets: js.Array[Name] = js.native
  
  var total_count: Double = js.native
}
object ActionsListRepoSecretsResponseData {
  
  @scala.inline
  def apply(secrets: js.Array[Name], total_count: Double): ActionsListRepoSecretsResponseData = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListRepoSecretsResponseData]
  }
  
  @scala.inline
  implicit class ActionsListRepoSecretsResponseDataMutableBuilder[Self <: ActionsListRepoSecretsResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecrets(value: js.Array[Name]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretsVarargs(value: Name*): Self = StObject.set(x, "secrets", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
