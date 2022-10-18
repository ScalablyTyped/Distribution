package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enterprise extends StObject {
  
  /** The slug version of the enterprise name. You can also substitute this value with the enterprise id. */
  var enterprise: String
}
object Enterprise {
  
  inline def apply(enterprise: String): Enterprise = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enterprise]
  }
  
  extension [Self <: Enterprise](x: Self) {
    
    inline def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
  }
}
