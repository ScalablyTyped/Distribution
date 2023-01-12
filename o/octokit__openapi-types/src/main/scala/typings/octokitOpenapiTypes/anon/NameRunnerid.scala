package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameRunnerid extends StObject {
  
  /** The slug version of the enterprise name. You can also substitute this value with the enterprise id. */
  var enterprise: String
  
  /** The name of a self-hosted runner's custom label. */
  var name: String
  
  /** Unique identifier of the self-hosted runner. */
  var runner_id: Double
}
object NameRunnerid {
  
  inline def apply(enterprise: String, name: String, runner_id: Double): NameRunnerid = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], runner_id = runner_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameRunnerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameRunnerid] (val x: Self) extends AnyVal {
    
    inline def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRunner_id(value: Double): Self = StObject.set(x, "runner_id", value.asInstanceOf[js.Any])
  }
}
