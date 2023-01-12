package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseororgString extends StObject {
  
  /** The slug version of the enterprise name or the login of an organization. */
  var enterprise_or_org: String
}
object EnterpriseororgString {
  
  inline def apply(enterprise_or_org: String): EnterpriseororgString = {
    val __obj = js.Dynamic.literal(enterprise_or_org = enterprise_or_org.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseororgString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnterpriseororgString] (val x: Self) extends AnyVal {
    
    inline def setEnterprise_or_org(value: String): Self = StObject.set(x, "enterprise_or_org", value.asInstanceOf[js.Any])
  }
}
