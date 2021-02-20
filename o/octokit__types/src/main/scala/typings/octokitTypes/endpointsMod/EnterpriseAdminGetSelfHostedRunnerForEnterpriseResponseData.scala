package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminGetSelfHostedRunnerForEnterpriseResponseData extends StObject {
  
  var busy: Boolean = js.native
  
  var id: Double = js.native
  
  var labels: js.Array[Id] = js.native
  
  var name: String = js.native
  
  var os: String = js.native
  
  var status: String = js.native
}
object EnterpriseAdminGetSelfHostedRunnerForEnterpriseResponseData {
  
  @scala.inline
  def apply(busy: Boolean, id: Double, labels: js.Array[Id], name: String, os: String, status: String): EnterpriseAdminGetSelfHostedRunnerForEnterpriseResponseData = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminGetSelfHostedRunnerForEnterpriseResponseData]
  }
  
  @scala.inline
  implicit class EnterpriseAdminGetSelfHostedRunnerForEnterpriseResponseDataMutableBuilder[Self <: EnterpriseAdminGetSelfHostedRunnerForEnterpriseResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: js.Array[Id]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: Id*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
