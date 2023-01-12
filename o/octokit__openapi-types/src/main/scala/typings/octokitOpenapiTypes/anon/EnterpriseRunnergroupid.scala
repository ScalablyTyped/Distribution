package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseRunnergroupid extends StObject {
  
  /** The slug version of the enterprise name. You can also substitute this value with the enterprise id. */
  var enterprise: String
  
  /** Unique identifier of the self-hosted runner group. */
  var runner_group_id: Double
}
object EnterpriseRunnergroupid {
  
  inline def apply(enterprise: String, runner_group_id: Double): EnterpriseRunnergroupid = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], runner_group_id = runner_group_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseRunnergroupid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnterpriseRunnergroupid] (val x: Self) extends AnyVal {
    
    inline def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
  }
}
