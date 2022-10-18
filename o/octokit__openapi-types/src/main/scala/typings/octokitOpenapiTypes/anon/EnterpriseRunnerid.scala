package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseRunnerid extends StObject {
  
  /** The slug version of the enterprise name. You can also substitute this value with the enterprise id. */
  var enterprise: String
  
  /** Unique identifier of the self-hosted runner. */
  var runner_id: Double
}
object EnterpriseRunnerid {
  
  inline def apply(enterprise: String, runner_id: Double): EnterpriseRunnerid = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], runner_id = runner_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseRunnerid]
  }
  
  extension [Self <: EnterpriseRunnerid](x: Self) {
    
    inline def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setRunner_id(value: Double): Self = StObject.set(x, "runner_id", value.asInstanceOf[js.Any])
  }
}
