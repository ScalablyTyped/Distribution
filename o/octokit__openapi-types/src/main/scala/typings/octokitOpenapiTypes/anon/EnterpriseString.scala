package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseString extends StObject {
  
  var enterprise: String
}
object EnterpriseString {
  
  inline def apply(enterprise: String): EnterpriseString = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnterpriseString] (val x: Self) extends AnyVal {
    
    inline def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
  }
}
