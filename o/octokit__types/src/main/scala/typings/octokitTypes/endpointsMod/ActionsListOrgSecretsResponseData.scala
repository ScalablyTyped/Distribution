package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Createdat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsListOrgSecretsResponseData extends StObject {
  
  var secrets: js.Array[Createdat] = js.native
  
  var total_count: Double = js.native
}
object ActionsListOrgSecretsResponseData {
  
  @scala.inline
  def apply(secrets: js.Array[Createdat], total_count: Double): ActionsListOrgSecretsResponseData = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListOrgSecretsResponseData]
  }
  
  @scala.inline
  implicit class ActionsListOrgSecretsResponseDataMutableBuilder[Self <: ActionsListOrgSecretsResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecrets(value: js.Array[Createdat]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretsVarargs(value: Createdat*): Self = StObject.set(x, "secrets", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
